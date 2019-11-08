package com.atmecs.ninja.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.atmecs.ninja.constants.ConstantPaths;
import com.atmecs.ninja.helpers.PageActions;
import com.atmecs.ninja.helpers.ReadExcelData;
import com.atmecs.ninja.helpers.ValidateTestResult;

public class MerchandisePage extends HomePage {
	@Test(priority = 3)
	public void merchandiseOrderPage() {
// click merchandise menu bar
		Xpath = read.readPropertiesFile("loc.menu.merchandise.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);
		log.info("clicked on merchandise");
//validate the text 
		Xpath = read.readPropertiesFile("loc.validate.merchandisemens.text.xpath", ConstantPaths.LOCATORS_FILE);
		String acttxt = driver.findElement(By.xpath(Xpath)).getText();
		String expectedtext = read.readPropertiesFile("expectedtext", ConstantPaths.LOCATORS_FILE);
		ValidateTestResult.validateData(acttxt, expectedtext, "No match");
		log.info("validated text");
//click on buy now
		Xpath = read.readPropertiesFile("loc.click.buynow.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);
		log.info("clicked on buy now");
//select color
		Xpath = read.readPropertiesFile("loc.selectredcolor.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);
		log.info("selected color");
//select size
		Xpath = read.readPropertiesFile("loc.selectsize.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);
		log.info("selected size");
//select name
		Xpath = read.readPropertiesFile("loc.field.name.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);
		log.info("selected name");
//enter personalised name
		Xpath = read.readPropertiesFile("loc.field.name.xpath", ConstantPaths.LOCATORS_FILE);
		String name = read.readPropertiesFile("name", ConstantPaths.LOCATORS_FILE);
		driver.findElement(By.xpath(Xpath)).sendKeys(name);
		log.info("entered personalised name");
// click buy now on modal popup
		Xpath = read.readPropertiesFile("loc.popup.clickbuynow.xpath", ConstantPaths.LOCATORS_FILE);
		PageActions.clickOnElement(driver, Xpath);
log.info("Clicked on buynow");
	}

}
