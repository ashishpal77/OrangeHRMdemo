package com.orangehrm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orangehrm.qa.base.Testbase;
import com.orangehrm.qa.pages.Homepage;
import com.orangehrm.qa.pages.Loginpage;

public class Homepagetest extends Testbase {

	Loginpage lp;
	Homepage hp;

	public Homepagetest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		lp = new Loginpage();
		hp = new Homepage();
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Test(priority = 1)
	public void verifyuserstest() {
		hp.clickonuserslink();
	}

	@Test(priority = 2)
	public void verifyjobtittlepage() {
		hp.clickonjobtittlelink();
	}

	@Test(priority = 3)
	public void veriftpaygradepage() {
		hp.clickonpaygradelink();
	}

	@Test(priority = 4)
	public void verifyemployeestatuspage() {
		hp.Clickonemployeestatuslink();
	}

	@Test(priority = 5)
	public void verifyjobcategoriespage() {
		hp.Clickonjobcategorieslink();
	}

	@Test(priority = 6)
	public void verifyworkshiftspage() {
		hp.clickonworkshiftslink();
	}

	@Test(priority = 7)
	public void verifygeneralinformationpage() {
		hp.clickongeninfo();
	}

	@Test(priority = 8)
	public void verifylocationpage() {
		hp.clickonlocationlink();
	}

	

	@AfterMethod
	public void teardown() {
		driver.quit();

	}

}
