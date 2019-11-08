package com.atmecs.ninja.testbase;

import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.atmecs.ninja.constants.ConstantPaths;
import com.atmecs.ninja.helpers.ReadPropertiesFile;
import com.atmecs.ninja.reports.LogReports;

public class InvokeBrowser {
	public LogReports log = new LogReports();
	public static WebDriver driver;
	Properties config = new Properties();
	protected ReadPropertiesFile read = new ReadPropertiesFile();

//To invoke the chrome browse
	@Test(priority = 1)
	public void setup() throws IOException {
		System.setProperty("webdriver.ie.driver", ConstantPaths.IE_FILE);
		driver = new InternetExplorerDriver();
		//driver = new ChromeDriver();
		log.info("Chrome browser invoked...");
		driver.get(read.readPropertiesFile("url", ConstantPaths.CONFIG_FILE));
		log.info("Application opened...");
		driver.manage().window().maximize();
	}
}