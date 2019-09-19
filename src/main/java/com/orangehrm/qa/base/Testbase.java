package com.orangehrm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Testbase {
	
	public static FileInputStream fis;
	public static  Properties prop;
	public static  WebDriver driver;
	
	/*
	 * Test base class constructor:use to initialize my config properties and env variables
	 * 
	 * 
	 * 
	 */
	
	public Testbase()
	{
		prop=new Properties();
		try {
			 fis=new FileInputStream("E:\\seleniumproject\\orangehrmtestsuite\\src\\main\\java\\com\\orangehrm\\qa\\config\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public  void initialization()
	{
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equals("ie"))
		{
			System.setProperty("webdriver.Internetexplorer.driver", "IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("driver is not initialized");
		}
		String Testsiteurl=prop.getProperty("url");
		driver.get(Testsiteurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		}
	
	public void sendkeys(String element,String value)
	{
		
		driver.findElement(By.xpath(element)).sendKeys(value);
		
	}
	
	public void click(String element)
	{
		driver.findElement(By.xpath(element)).click();
	}
	
	public void selectdropdown(String element,String value)
	{
		Select s=new Select(driver.findElement(By.xpath(element)));
		s.selectByVisibleText(value);
		
	}

}
