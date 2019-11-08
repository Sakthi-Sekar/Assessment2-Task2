package com.atmecs.ninja.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.ninja.constants.ConstantPaths;
import com.atmecs.ninja.helpers.PageActions;
import com.atmecs.ninja.helpers.ValidateTestResult;

public class BuyProduct extends MerchandisePage {
	@Test(priority = 4)
	public void clickCartAndViewDetails() {
		// click cart symbol
		Xpath = read.readPropertiesFile("loc.click.cartsymbol.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);
//validate size
		Xpath = read.readPropertiesFile("loc.validatecart.size.xpath", ConstantPaths.LOCATORS_FILE);
		String actsize = driver.findElement(By.xpath(Xpath)).getText();
		String expsize = read.readPropertiesFile("expsize", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(actsize, expsize, "No match");
		log.info(" matches");
//validate personalized name
		Xpath = read.readPropertiesFile("loc.validate.personalizedname.xpath", ConstantPaths.LOCATORS_FILE);
		String actlname = driver.findElement(By.xpath(Xpath)).getText();
		String exptname = read.readPropertiesFile("exptname", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(actlname, exptname, "No match");
		log.info(" matches");
//validate color
		Xpath = read.readPropertiesFile("loc.validatecolor.xpath", ConstantPaths.LOCATORS_FILE);
		String actcolor = driver.findElement(By.xpath(Xpath)).getText();
		String expcolor = read.readPropertiesFile("expcolor", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(actcolor, expcolor, "No match");
		log.info(" matches");
//validate price
		Xpath = read.readPropertiesFile("loc.validate.initialprice.xpath", ConstantPaths.LOCATORS_FILE);
		String actprice = driver.findElement(By.xpath(Xpath)).getText();
		String expprice = read.readPropertiesFile("initprice", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(actprice, expprice, "No match");
		log.info("matches");
//validate total price
		Xpath = read.readPropertiesFile("loc.validate.total.xpath", ConstantPaths.LOCATORS_FILE);
		String acttotal = driver.findElement(By.xpath(Xpath)).getText();
		String exptotal = read.readPropertiesFile("total", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(acttotal, exptotal, "No match");
		log.info("matches");

	}

	@Test(priority = 5)
	public void clickProduct() {
		Xpath = read.readPropertiesFile("loc.increase.qty.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);

		Xpath = read.readPropertiesFile("loc.increase.qty.xpath", ConstantPaths.LOCATORS_FILE);
		String number = read.readPropertiesFile("number", ConstantPaths.LOCATORS_FILE);
		driver.findElement(By.xpath(Xpath)).sendKeys(number);

		Xpath = read.readPropertiesFile("loc.click.update.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);

		Xpath = read.readPropertiesFile("loc.validate.final", ConstantPaths.LOCATORS_FILE);
		String actfinaltotal = driver.findElement(By.xpath(Xpath)).getText();
		String expfinaltotal = read.readPropertiesFile("final", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(actfinaltotal, expfinaltotal, "No match");
		log.info(" matches");

	}
}
