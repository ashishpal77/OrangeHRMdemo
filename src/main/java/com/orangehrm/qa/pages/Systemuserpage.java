package com.orangehrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.orangehrm.qa.base.Testbase;

public class Systemuserpage extends Testbase {
	
	//page factories
	
	@FindBy(xpath="//a[@class='toggle tiptip activated']")
	
	WebElement systemuserlabel;
	
	
	
	

}
