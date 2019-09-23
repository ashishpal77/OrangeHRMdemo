package com.orangehrm.qa.testcases;

import org.testng.annotations.BeforeMethod;

import com.orangehrm.qa.base.Testbase;
import com.orangehrm.qa.pages.Homepage;
import com.orangehrm.qa.pages.Loginpage;
import com.orangehrm.qa.pages.Systemuserpage;

public class Newusertest extends Testbase {
	
	Loginpage lp;
	Homepage hp;
	Systemuserpage sup;
	
	public Newusertest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		lp=new Loginpage();
		hp=new Homepage();
		hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		sup=hp.clickonuserslink();
		
		
	}

}
