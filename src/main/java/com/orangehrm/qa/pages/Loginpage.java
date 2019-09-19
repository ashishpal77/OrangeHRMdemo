package com.orangehrm.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.base.Testbase;

public class Loginpage extends Testbase {
	
	//Testbase tb=new Testbase();
	
	//pagefactories or object repository
	
	
	
	@FindBy(xpath="//input[@name='txtUsername']")
	WebElement usrname;
	@FindBy(xpath="//input[@name='txtPassword']")
	WebElement password;
	@FindBy(xpath="//a[contains(text(),'Forgot your password?')]")
	WebElement forgotpasslink;
	
	//webelement initialization
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions of login page
	
	public String gettittleofpage()
	{
		return driver.getTitle();
	}
	
	public void islogodisplayed()
	{
		
	}
	
	public void isloginbutton()
	{
		
	}
	
	public void verifyforgotpaslink()
	{
		forgotpasslink.click();
	}
	
	public Homepage login(String un,String pwd)
	{
		usrname.sendKeys(un);
		password.sendKeys(pwd,Keys.ENTER);
		return  new Homepage();
		
		
	}
	
	
	
	
	
	

}
