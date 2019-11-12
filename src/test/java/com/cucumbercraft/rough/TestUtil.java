package com.cucumbercraft.rough;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.cucumbercraft.framework.Util;

public class TestUtil {

	public static void main(String[] args) {

		String absolutePath = TestUtil.getAbsolutePath();
		System.out.println("AbsolutePath : " + absolutePath);
		
		String fileSeparator = TestUtil.getFileSeparator();
		System.out.println("File Separator : " + fileSeparator);
		
		String resultsPath = TestUtil.getResultsPath();
		System.out.println("Results Path : " + resultsPath);
		
		String targetPath = TestUtil.getTargetPath();
		System.out.println("Target Path : " + targetPath);
		
		String targetExtentReportPath = TestUtil.getTargetExtentReportPath();
		System.out.println("Target Extent Report Path : " + targetExtentReportPath);
		
		String targetAllureReportPath = TestUtil.getTargetAllureReportPath();
		System.out.println("Target Allure Report Path : " + targetAllureReportPath);
		
//		System.setProperty("webdriver.gecko.driver", "//Users//r632871//Documents//Selenium//geckodriver");
//		WebDriver driver = new FirefoxDriver();
//		
//		System.out.println(driver.getClass());
//		byte[] screenshot = TestUtil.takeScreenshot(driver);
//		System.out.println(screenshot.toString());
		
		Date today = TestUtil.getCurrentTime();
		System.out.println("Today's date and Time : " + today);

		
//		driver.quit();

	}

	public static String getAbsolutePath() {
		String relativePath = new File(System.getProperty("user.dir")).getAbsolutePath();
		return relativePath;
	}
	
	public static String getFileSeparator() {
		return System.getProperty("file.separator");
	}
	
	public static String getResultsPath() {
		File path = new File(Util.getAbsolutePath() + Util.getFileSeparator() + "Results");
		if (!path.isDirectory()) {
			path.mkdirs();
		}

		return path.toString();
	}
	
	public static String getTargetPath() {

		File targetPath = new File(Util.getAbsolutePath() + Util.getFileSeparator() + "target" + Util.getFileSeparator()
				+ "cucumber-report");

		return targetPath.toString();
	}
	
	public static String getTargetExtentReportPath() {

		File targetPath = new File(
				Util.getAbsolutePath() + Util.getFileSeparator() + "target" + Util.getFileSeparator() + "ExtentReport");

		return targetPath.toString();
	}
	
	public static String getTargetAllureReportPath() {

		File targetPath = new File(
				Util.getAbsolutePath() + Util.getFileSeparator() + "target" + Util.getFileSeparator() + "site");

		return targetPath.toString();
	}
	
	public static byte[] takeScreenshot(WebDriver driver) {
		if (driver == null) {
			throw new RuntimeException("Report.driver is not initialized!");
		}

		if (driver.getClass().getSimpleName().equals("HtmlUnitDriver") || driver.getClass().getGenericSuperclass()
				.toString().equals("class org.openqa.selenium.htmlunit.HtmlUnitDriver")) {
			return null; // Screenshots not supported in headless mode
		}

		if (driver.getClass().getSimpleName().equals("RemoteWebDriver")) {
			Capabilities capabilities = ((RemoteWebDriver) driver).getCapabilities();
			if (capabilities.getBrowserName().equals("htmlunit")) {
				return null; // Screenshots not supported in headless mode
			}
			WebDriver augmentedDriver = new Augmenter().augment(driver);
			return ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.BYTES);
		} else {
			return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		}
	}
	
	public static String takeScreenshotFile(WebDriver driver) {

		String screenShotPath = null;
		try {
			if (driver == null) {
				throw new RuntimeException("Report.driver is not initialized!");
			}

			WebDriver augmentedDriver = new Augmenter().augment(driver);
			File scrFile = ((TakesScreenshot) augmentedDriver).getScreenshotAs(OutputType.FILE);

			screenShotPath = copyFile(scrFile).toString();
		} catch (Exception e) {

		}
		return screenShotPath;
	}
	
	private static File copyFile(File scrFile) {

		File newPath = new File(Util.getAbsolutePath() + Util.getFileSeparator() + "Screenshorts");
		if (!newPath.isDirectory()) {
			newPath.mkdir();
		}

		File screenShotPath = new File(
				newPath + Util.getFileSeparator() + RandomStringUtils.randomAlphanumeric(16) + ".png");
		try {
			FileUtils.copyFile(scrFile, new File(screenShotPath.toString()), true);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return screenShotPath;
	}
	
	public static Date getCurrentTime() {
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}
	
	public static String getCurrentFormattedTime(String dateFormatString) {
		DateFormat dateFormat = new SimpleDateFormat(dateFormatString);
		Calendar calendar = Calendar.getInstance();
		return dateFormat.format(calendar.getTime());
	}
	
	public static String getFormattedTime(Date time, String dateFormatString) {
		DateFormat dateFormat = new SimpleDateFormat(dateFormatString);
		return dateFormat.format(time);
	}
	
	public static String getTimeDifference(Date startTime, Date endTime) {
		long timeDifferenceSeconds = (endTime.getTime() - startTime.getTime()) / 1000; // to
																						// convert
																						// from
																						// milliseconds
																						// to
																						// seconds
		long timeDifferenceMinutes = timeDifferenceSeconds / 60;

		String timeDifferenceDetailed;
		if (timeDifferenceMinutes >= 60) {
			long timeDifferenceHours = timeDifferenceMinutes / 60;

			timeDifferenceDetailed = Long.toString(timeDifferenceHours) + " hour(s), "
					+ Long.toString(timeDifferenceMinutes % 60) + " minute(s), "
					+ Long.toString(timeDifferenceSeconds % 60) + " second(s)";
		} else {
			timeDifferenceDetailed = Long.toString(timeDifferenceMinutes) + " minute(s), "
					+ Long.toString(timeDifferenceSeconds % 60) + " second(s)";
		}
		
		return timeDifferenceDetailed;
	}

}
