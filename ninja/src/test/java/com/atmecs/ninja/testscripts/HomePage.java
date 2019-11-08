package com.atmecs.ninja.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.ninja.constants.ConstantPaths;
import com.atmecs.ninja.helpers.PageActions;
import com.atmecs.ninja.helpers.ReadPropertiesFile;
import com.atmecs.ninja.helpers.ValidateTestResult;
import com.atmecs.ninja.testbase.InvokeBrowser;

public class HomePage extends InvokeBrowser {
	ReadPropertiesFile read = new ReadPropertiesFile();
	String Xpath, usrname, pswd;

	@Test(priority = 2)
	public void login() {

// click home
		Xpath = read.readPropertiesFile("loc.menu.home.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);
		log.info("clicked on home");
//validate home tab
		Xpath = read.readPropertiesFile("loc.validate.home.xpath", ConstantPaths.LOCATORS_FILE);
		String hometab = driver.findElement(By.xpath(Xpath)).getText();
		String exphome = read.readPropertiesFile("exphome", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(hometab, exphome, "No match");
		log.info("home validated");

// click hot sauces

		Xpath = read.readPropertiesFile("loc.menu.hotsauces.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);
		log.info("clicked on hot sauces");
//validate hot sauces tab
		Xpath = read.readPropertiesFile("loc.validate.hotsauces.xpath", ConstantPaths.LOCATORS_FILE);
		String hotsaucestab = driver.findElement(By.xpath(Xpath)).getText();
		String exphotsauces = read.readPropertiesFile("exphotsauces", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(hotsaucestab, exphotsauces, "No match");
log.info("sauce tab validated");
// click merchandise

		Xpath = read.readPropertiesFile("loc.menu.merchandise.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);
		log.info("clickced merchandise");
//validate merchandise tab
		Xpath = read.readPropertiesFile("loc.validate.merchandise.xpath", ConstantPaths.LOCATORS_FILE);
		String merchandise = driver.findElement(By.xpath(Xpath)).getText();
		String expmerchandise = read.readPropertiesFile("expmerchandise", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(merchandise, expmerchandise, "No match");
log.info("merchandise tab validated");
// clearance

		Xpath = read.readPropertiesFile("loc.menu.clearance.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);
		log.info("clicked clearance");
//validate clearance tab
		Xpath = read.readPropertiesFile("loc.validate.clearance.xpath", ConstantPaths.LOCATORS_FILE);
		String clearance = driver.findElement(By.xpath(Xpath)).getText();
		String expclearance = read.readPropertiesFile("expclearance", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(clearance, expclearance, "Np match");
		log.info("clearance tab validated");

// new to sauce

		Xpath = read.readPropertiesFile("loc.menu.newtohotsauce.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);
		log.info("clicked on sauce tab");
//validate new to sauce tab
		Xpath = read.readPropertiesFile("loc.validate.newtohotsauce.xpath", ConstantPaths.LOCATORS_FILE);
		String newtootsauce = driver.findElement(By.xpath(Xpath)).getText();
		String exptext = read.readPropertiesFile("exptext", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(newtootsauce, exptext, "Np match");
		log.info("validated sauce tab");

// FAQ
		Xpath = read.readPropertiesFile("loc.menu.faq.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);
		log.info("clicked on FAQ");
//validate faq tab
		Xpath = read.readPropertiesFile("loc.validate.faq.xpath", ConstantPaths.LOCATORS_FILE);
		String faq = driver.findElement(By.xpath(Xpath)).getText();
		String expvalue = read.readPropertiesFile("expvalue", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(faq, expvalue, "Np match");
		log.info("validated faq tab");

	}

}
