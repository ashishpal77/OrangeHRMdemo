package com.orangehrm.qa.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.orangehrm.qa.base.Testbase;
import com.relevantcodes.extentreports.model.Test;

public class Testutil extends Testbase {
	
	
	public void Mousemovement(WebElement locator, WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(locator).build().perform();
	}
	
	

}
