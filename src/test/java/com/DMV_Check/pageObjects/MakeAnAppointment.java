package com.DMV_Check.pageObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MakeAnAppointment {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","D://Selenium Projects//DMV_Check//Drivers//chromedriver.exe");
	WebDriver ldriver = new ChromeDriver();	
	ldriver.get("https://www.dmv.ca.gov/portal/make-an-appointment/");
	ldriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ldriver.findElement(By.linkText("Behind-the-Wheel Drive Test")).click();
	System.out.println(ldriver.getCurrentUrl());
	System.out.println(ldriver.getTitle());
	WebElement SelectElement = ldriver.findElement(By.xpath(".//select[@id='officeId']"));
	Select Se = new Select(SelectElement);
	//List OriginalList = new ArrayList();
	//List TempList = new ArrayList();
	List <WebElement> options = Se.getOptions();
//	for(WebElement e:options)
//	{
//		OriginalList.add(e.getText());
//		TempList.add(e.getText());
//	}
//	System.out.println(OriginalList);
//	System.out.println(OriginalList.size());
//	System.out.println(TempList);
//	
//	Collections.sort(TempList,Collections.reverseOrder());
//	
//	System.out.println(TempList);
//	
//	if (OriginalList.equals(TempList))
//	{
//		System.out.println("Both are equal");	
//		
//	}
//	
//	else
//		
//	{
//		System.out.println("Both are not equal");
//	}
//	
	System.out.println(options);
	
	
	ldriver.close();
	
//		public MakeAnAppointment(WebDriver rdriver)
//	{
//		ldriver = rdriver;
//		PageFactory.initElements(rdriver,this);		
//	}
//	
//	@Test
//	public void setup() {
//		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
//		ldriver = new ChromeDriver();
//		ldriver.get("https://www.dmv.ca.gov/portal/make-an-appointment/");
//		MakeAnAppointment MA = new MakeAnAppointment(ldriver);
//		
//	}
//	
//	@FindBy(partialLinkText="wasapp/foa/driveTest.do") @CacheLookup WebElement driveTest;
//	
//	@Test
//	public void clickSubmit() {
//		driveTest.click();
//		System.out.println(ldriver.getCurrentUrl());
//		System.out.println(ldriver.getTitle());
//		
//		
//		
}
	
	
}
