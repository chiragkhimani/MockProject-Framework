package com.automation.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtils {
	static WebDriver driver;

	public static void createDriver() {

		switch (PropertyReader.getProperty("browser").toLowerCase()) {

		case "chrome":

			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":

			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		case "ie":

			System.setProperty("webdriver.ie.driver", "src\\test\\resources\\driver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		default:
			System.out.println("Invalid browser specified");

		}

		driver.manage().window().maximize();

	}

	public static void quitDriver() {
		driver.quit();
		driver=null;
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			PropertyReader.initProperties();
			createDriver();
		}
		return driver;
	}

}
