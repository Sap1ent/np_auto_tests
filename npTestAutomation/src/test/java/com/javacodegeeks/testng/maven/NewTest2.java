package com.javacodegeeks.testng.maven;

import org.testng.annotations.Test;

import utility.constants;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTest2 {

	WebDriver driver;
  
 	
   
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver","C:/BrowserDrivers/geckodriver-v0.11.1-win64/geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.manage().window().maximize(); 
  }


  
  @Test
  public void createApplication() {
	  driver.get("http://staging.nowpensions.com");
	  //Verify title on homepage is correct
	  Assert.assertEquals("Auto Enrolment Solution - Company Pensions & Workplace Pensions Scheme", driver.getTitle());
	  //Verify cookie banner is shown
	  //Assert.assertEquals(true,driver.findElement(By.id("cookie_action_close_header")).isDisplayed());
	  String cookieText = driver.findElement(By.id("cookie-law-info-bar")).getText();
	  System.out.println(cookieText);
	  System.out.println(constants.CompName);
	  System.out.println(constants.PAYE1);
	  System.out.println(constants.PAYE2);
	  System.out.println(constants.PAYE3);
	  System.out.println(constants.PAYEX);
	  System.out.println(constants.PAYE4);
	  System.out.println(constants.PAYE5);
	  System.out.println(constants.PAYE6);
	  System.out.println(constants.PAYEREF);
	  //Assert.assertEquals("This site uses cookies. By continuing to browse the site you are agreeing to our use of cookies. Read our \nX \nCookie Policy",driver.findElement(By.id("cookie-law-info-bar")).getText());
	  //Click to close cookie banner
	  driver.findElement(By.id("cookie_action_close_header")).click();
	  //Verify cookie banner has disappeared
	  
	  //Click on the payroll Bureau page
	  driver.findElement(By.xpath("//ul[@id='osu_lead_main']/li[4]/a")).click();
	  //Verify we're on the bureau page
	  Assert.assertEquals("Payroll - NOW: Pensions", driver.getTitle());
	  //Click Login button
	  driver.findElement(By.xpath("//*[@id='primary']/header/div/div/p/a[2]/strong")).click();
	  //Verify we're on the login page
	  Assert.assertEquals("Login - NOW: Pensions", driver.getTitle());
	  //Wait
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	  //Click on Payroll Login icon
	  driver.findElement(By.xpath("//*[@id='primary']/div[2]/div[1]/div/dl/dd[4]/a/i")).click();
	  //Enter email address
	  driver.findElement(By.xpath("//*[@id='bureau']/div/div[1]/form/div[1]/input")).sendKeys("gateburthurs@test.com");
	  //Enter password
	  driver.findElement(By.xpath("//*[@id='bureau']/div/div[1]/form/div[2]/input")).sendKeys("P3nsions");
	  //Click login button
	  driver.findElement(By.xpath("//*[@id='bureau']/div/div[1]/form/div[3]/button")).click();
	  //Verify we're on the bureau application creation page
	  Assert.assertEquals("Payroll - NOW: Pensions", driver.getTitle());
	  //Start a new application
	  driver.findElement(By.xpath("//*[@id='primary']/header/div/div/div/div[1]/a/span")).click();
	  //Verify we reach the OSU page
	  Assert.assertEquals("OSU Welcome Bureaux - NOW: Pensions", driver.getTitle());
	  //Start a new application
	  driver.findElement(By.xpath("//*[@id='primary']/header/div/div/div/div/div[1]/a/span")).click();
	  //Verify we reach the Plan selection page
	  Assert.assertEquals("Select Plan | Sign Up", driver.getTitle());
	  //Select a plan
	  driver.findElement(By.xpath("//*[@id='agreement-plans']/tbody/tr[2]/th[1]/div[2]/form/button")).click();
	  //Verify we reach the Advanced Sign up page
	  Assert.assertEquals("Advanced Sign-up | Sign Up", driver.getTitle());
	  //Enter Company Name
	  driver.findElement(By.id("company_name_legal")).sendKeys(constants.CompName);
	  //Enter Company trading Name - !this auto populates
	  //driver.findElement(By.id("company_name_aka")).sendKeys(constants.CompName);
	  //Select a staging date from the drop down
	  new Select (driver.findElement(By.id("staging_date"))).selectByVisibleText("1st July 2017");
	  //Select whether the scheme data differs from stage date
	  driver.findElement(By.id("start_early-1")).click();
	  //Select company type
	  new Select (driver.findElement(By.id("company_type-1"))).selectByVisibleText("Public Limited Company");
	  //Enter registration number (or don't)
	  driver.findElement(By.id("company_registration_no")).sendKeys(constants.RegNo);
	  //Fill in Registered office address
	  driver.findElement(By.id("company_address1")).sendKeys("310");
	  driver.findElement(By.id("company_address2")).sendKeys("Ashgate Road");
	  driver.findElement(By.id("company_city")).sendKeys("Chesterfield");
	  driver.findElement(By.id("company_postcode")).sendKeys("S40 3BW");
	  //Select number of employees
	  new Select (driver.findElement(By.id("no_of_included_employees"))).selectByVisibleText("21-30");
	  //Ignore contact address change
	  //Fill out primary contact person details
	  driver.findElement(By.id("primary_contact_name-0")).sendKeys(constants.PrimCon);
	  driver.findElement(By.id("primary_contact_email-0")).sendKeys(constants.PrimConMail);
	  driver.findElement(By.id("primary_contact_email_confirm-0")).sendKeys(constants.PrimConMail);
	  driver.findElement(By.id("primary_contact_title-0")).sendKeys(constants.PrimConJob);
	  driver.findElement(By.id("primary_contact_phone-0")).sendKeys("07000000000");
	  //Fill out PDF comms
	  driver.findElement(By.id("payroll_settings-company_pdf_email-0")).sendKeys(constants.PDFCommsMail);
	  driver.findElement(By.id("payroll_settings-pdf_comms_mailbox_confirm-0")).sendKeys(constants.PDFCommsMail);
	  //Fill in PAYE Ref
	  driver.findElement(By.id("paye_ref-0")).sendKeys(constants.PAYEREF);
	  //Fill in Payroll Contact details
	  driver.findElement(By.id("payroll_settings-payroll_contact_name-0")).sendKeys(constants.PayCon);
	  //Not Necessary to fill out e-mail contact for bureau managed
	  //driver.findElement(By.id("payroll_settings-payroll_contact_email-0")).sendKeys(constants.PayCon);
	  //Not Necessary to fill out e-mail contact for bureau managed confirm
	  //driver.findElement(By.id("payroll_settings-payroll_contact_email_confirm-0")).sendKeys(constants.PayCon);
	  driver.findElement(By.id("payroll_settings-payroll_contact_phone-0")).sendKeys("07000000000");
	  //Fill in payroll name
	  driver.findElement(By.id("payrolls-0-payroll_name-0")).sendKeys(constants.PayName);
	  //Pick payroll frequency
	  new Select (driver.findElement(By.id("payrolls-0-payroll_type-0"))).selectByVisibleText("Fortnightly");
	  //Type payroll provider - not necessary for payroll bureau - prepopulated
	  //driver.findElement(By.id("payrolls-0-payroll_provider-0")).sendKeys("BrightPay");
	  //click Continue
	  driver.findElement(By.id("next-button")).click();
	  //Ensure we land on right page
	  Assert.assertEquals("Preview Agreement | Sign Up", driver.getTitle());
	  //click Continue
	  driver.findElement(By.id("next-button")).click();
	  //click YES on authorised to apply popup
	  driver.findElement(By.xpath("//*[@id='accept-agreement-confirmation']/div/div[3]/div/a[1]")).click(); 
	  //click YES on authorised to provide details for DD popup
	  driver.findElement(By.xpath("//*[@id='accept-agreement-confirmation']/div/div[3]/form/div/input[1]")).click(); 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
  
    
  @AfterTest
  public void afterTest() {
//	  driver.quit();
  }

}
