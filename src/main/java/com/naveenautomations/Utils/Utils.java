package com.naveenautomations.Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.naveenautomations.base.TestBase;

public class Utils extends TestBase {

	public static final int IMPLICT_WAIT = 10;
	public static final int PAGE_LOAD_WAIT = 30;

	public static void takeFailedScreenshots(String testCaseName) {
		// Get the date and time
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		// save screenshot in a file
		File screenShotFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

		// save the file
		try {
			FileUtils.copyFile(screenShotFile,
					new File("./FailedScreenShot\\" + "_" + testCaseName + "_" + timeStamp + ".jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("unable to take screenshot of failes test cases" + testCaseName);
		}
	}

	public static String generateRandomEamil() {

		String email = RandomStringUtils.randomNumeric(3);

		String emailID = "Salinder" + email + "@gmail.com";

		return emailID;

	}

	public static String generateRandomPassword() {

		String randomStringForPassword = RandomStringUtils.randomNumeric(3);

		String password = "Manager" + randomStringForPassword;

		return password;

	}

}
