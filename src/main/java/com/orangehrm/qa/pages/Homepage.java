package com.orangehrm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.qa.base.Testbase;
import com.orangehrm.qa.utilities.Testutil;

public class Homepage extends Testbase {

	Testutil util = new Testutil();

	// page factories

	@FindBy(xpath = "//a[@id='menu_admin_viewAdminModule']")
	@CacheLookup
	WebElement adminlink;

	@FindBy(xpath = "//input[@id='MP_link']")

	WebElement label;

	@FindBy(xpath = "(//a[contains(text(),'Admin')])[1]")

	WebElement usernamelabel;

	@FindBy(xpath = "(//a[contains(text(),'Users')])[1]")

	WebElement userslink;

	@FindBy(xpath = "//a[@id='menu_admin_UserManagement']")

	WebElement usermanagementlink;

	@FindBy(xpath = "//a[@id='menu_admin_Job']")

	WebElement joblink;

	@FindBy(xpath = "//a[@id='menu_admin_viewJobTitleList']")

	WebElement job_tittlelink;
	
	@FindBy(xpath="//a[@id='menu_admin_viewPayGrades']")
	
	@CacheLookup
	WebElement paygradelink;

	@FindBy(xpath = "//a[@id='menu_admin_employmentStatus']")

	WebElement employementstatuslink;

	@FindBy(xpath = "//a[@id='menu_admin_jobCategory']")

	WebElement jobcategorieslink;

	@FindBy(xpath = "//a[@id='menu_admin_workShift']")

	WebElement workshiftslink;

	@FindBy(xpath = "//a[@id='menu_admin_Organization']")

	WebElement organizationlink;

	@FindBy(xpath = "//a[@id='menu_admin_viewOrganizationGeneralInformation']")

	WebElement generalinformationlink;

	@FindBy(xpath = "//a[@id='menu_admin_viewLocations']")

	WebElement Locationslink;

	@FindBy(xpath = "//a[@id='menu_admin_viewCompanyStructure']")

	WebElement structurelink;

	@FindBy(xpath = "//a[@id='menu_admin_Qualifications']")

	WebElement Qalificationslink;

	@FindBy(xpath = "//a[@id='menu_admin_viewSkills']")

	WebElement skillslink;

	@FindBy(xpath = "//a[@id='menu_admin_viewEducation']")

	WebElement Educationlink;

	@FindBy(xpath = "//a[@id='menu_admin_viewLicenses']")

	WebElement Licenseslink;

	@FindBy(xpath = "//a[@id='menu_admin_viewLanguages']")

	WebElement languageslink;

	@FindBy(xpath = "//a[@id='menu_admin_membership']")

	WebElement Membershiplink;

	@FindBy(xpath = "//a[@id='menu_admin_nationality']")

	WebElement nationalitylink;

	@FindBy(xpath = "//a[@id='menu_admin_Configuration']")

	WebElement Configuartionlink;

	@FindBy(xpath = "//a[@id='menu_admin_viewEmailNotification']")

	WebElement Emailsubscriptionlink;

	@FindBy(xpath = "//a[@id='menu_admin_localization']")

	WebElement localizationlink;

	@FindBy(xpath = "//a[@id='menu_admin_viewModules']")

	WebElement Moduleslink;

	@FindBy(xpath = "//a[@id='menu_admin_openIdProvider']")

	WebElement Socialmediaauthenticationlink;

	@FindBy(xpath = "//a[@id='menu_admin_registerOAuthClient']")

	WebElement Regisauthclient;

	public Homepage() {
		PageFactory.initElements(driver, this);
	}

	// Actions

	public Systemuserpage clickonuserslink() {
		adminlink.click();
		util.Mousemovement(usermanagementlink, driver);
		userslink.click();
		return new Systemuserpage();
	}

	public Jobtittlepage clickonjobtittlelink() {
		adminlink.click();
		util.Mousemovement(joblink, driver);
		job_tittlelink.click();
		return new Jobtittlepage();

	}
	
	public Paygradepage clickonpaygradelink()
	{
		adminlink.click();
		util.Mousemovement(joblink, driver);
		paygradelink.click();
		return new Paygradepage();
		
	}
	
	public Employementstatuspage Clickonemployeestatuslink()
	{
		adminlink.click();
		util.Mousemovement(joblink, driver);
		employementstatuslink.click();
		return new Employementstatuspage();
		
	}
	public Jobcategoriespage Clickonjobcategorieslink()
	{
		adminlink.click();
		util.Mousemovement(joblink, driver);
		jobcategorieslink.click();
		return new Jobcategoriespage();
		
	}
	
	public Workshiftpage clickonworkshiftslink()
	{
		adminlink.click();
		util.Mousemovement(joblink, driver);
		workshiftslink.click();
		return new Workshiftpage();
		
	}
	public Generalinformationpage clickongeninfo()
	{
		adminlink.click();
		util.Mousemovement(organizationlink, driver);
		generalinformationlink.click();
		return new Generalinformationpage();
		
	}
	
	public Locationspage clickonlocationlink()
	{
		adminlink.click();
		util.Mousemovement(organizationlink, driver);
		Locationslink.click();
		return new Locationspage();
	}
	

}
