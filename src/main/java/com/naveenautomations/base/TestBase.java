package com.naveenautomations.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.System.Logger;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import com.naveenautomations.Utils.Utils;
import com.naveenautomations.Utils.WebdriverEvents;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver webDriver;
	public Properties prop;
	public static WebDriverWait wait;
	public static org.apache.log4j.Logger logger;
	public static EventFiringWebDriver e_driver;
	public static WebdriverEvents events;

	public TestBase() {
		prop = new Properties();
		FileInputStream file;
		try {
			file = new FileInputStream(
					"C:\\Users\\skpos\\eclipse-workspace\\Project28\\testingframework\\src\\main\\java\\com\\naveenautomation\\config\\config.properties");
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@BeforeClass
	public void loggerSetup() {
		logger = org.apache.log4j.Logger.getLogger(TestBase.class);
		PropertyConfigurator.configure("log4j.properties");
		BasicConfigurator.configure();

		logger.setLevel(Level.INFO);
	}

	WebDriver WebDriver;

	public void initialization() {

		String browserName = prop.getProperty("browser");

		switch (browserName) {
		case "chrome":
			webDriver = WebDriverManager.chromedriver().create();
			break;

		case "firefox":
			webDriver = WebDriverManager.firefoxdriver().create();
			break;
		case "edge":

			webDriver = WebDriverManager.edgedriver().create();
			break;
		default:
			System.out.println("Invalid browsername");
			break;
		}

		e_driver = new EventFiringWebDriver(webDriver);
		events = new WebdriverEvents();
		e_driver.register(events);

		webDriver = e_driver;

		webDriver.manage().window().maximize();
		webDriver.get(prop.getProperty("base_url"));
		webDriver.manage().deleteAllCookies();
		webDriver.manage().timeouts().pageLoadTimeout(Utils.PAGE_LOAD_WAIT, TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(Utils.IMPLICT_WAIT, TimeUnit.SECONDS);
	}

	public void quitBrowser() {
		webDriver.quit();
	}

}
