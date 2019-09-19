package com.orangehrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.orangehrm.qa.base.Testbase;
import com.orangehrm.qa.pages.Loginpage;

public class Loginpagetest extends Testbase {
	
	Loginpage lp;
	SoftAssert soft=new SoftAssert() ;
	
	
	public Loginpagetest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		lp=new Loginpage();
		
		
	}
	@Test(priority=1)
	public void verifylogintest()
	{
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	@Test(priority=2)
	public void gettittle()
	{
		String tittle=lp.gettittleofpage();
		soft.assertEquals(tittle, "OrangeHRM");
		soft.assertAll();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

}
