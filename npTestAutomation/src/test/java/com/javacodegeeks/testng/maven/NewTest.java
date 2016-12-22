package com.javacodegeeks.testng.maven;

import org.testng.annotations.Test;

import pageObjects.AppAdvancedSignUp;
import pageObjects.AppSelectPlan;
import utility.constants;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTest {

	WebDriver driver;
	
		   
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:/BrowserDrivers/chromedriver_win32/chromedriver.exe");
	  driver = new ChromeDriver();
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
	  
	  //Select a plan (101 in this case)
	  AppSelectPlan.scheme_101(driver).click();
	  
	  //Verify we reach the Advanced Sign up page
	  Assert.assertEquals("Advanced Sign-up | Sign Up", driver.getTitle());
	
	  //Enter Company Name
	  AppAdvancedSignUp.emp_Legal_Name(driver).sendKeys(constants.CompName);
	  
	  //Enter Company trading Name - !this auto populates
	  //AppAdvancedSignUp.emp_Trade_Name(driver).sendKeys(constants.CompName);
	  
	  //Select a staging date from the drop down
	  new Select (AppAdvancedSignUp.emp_Stage_Date(driver)).selectByVisibleText("1st July 2017");
	  
	  //Select whether the scheme data differs from stage date
	  AppAdvancedSignUp.start_Early_No(driver).click();
	  
	  //Select company type
	  new Select (AppAdvancedSignUp.comp_Type_Dropdown(driver)).selectByVisibleText("Public Limited Company");
	  
	  //Enter registration number (or don't)
	  AppAdvancedSignUp.comp_RegNo(driver).sendKeys(constants.RegNo);
	  
	  //Fill in Registered office address
	  AppAdvancedSignUp.comp_Address1(driver).sendKeys("310");
	  AppAdvancedSignUp.comp_Address2(driver).sendKeys("Ashgate Road");
	  AppAdvancedSignUp.comp_City(driver).sendKeys("Chesterfield");
	  AppAdvancedSignUp.comp_Postcode(driver).sendKeys("S40 3BW");
	  
	  //Select number of employees
	  new Select (AppAdvancedSignUp.num_inc_Empl(driver)).selectByVisibleText("21-30");

	  //Ignore contact address change
	  
	  //Fill out primary contact person details
	  AppAdvancedSignUp.primCon_Name(driver).sendKeys(constants.PrimCon);
	  AppAdvancedSignUp.primCon_Mail(driver).sendKeys(constants.PrimConMail);
	  AppAdvancedSignUp.primCon_Mail_conf(driver).sendKeys(constants.PrimConMail);
	  AppAdvancedSignUp.primCon_job_title(driver).sendKeys(constants.PrimConJob);
	  AppAdvancedSignUp.primCon_tel_num(driver).sendKeys(constants.GenPhone);
	  
	  //Fill out PDF comms
	  AppAdvancedSignUp.pdfcomms_mail(driver).sendKeys(constants.PDFCommsMail);
	  AppAdvancedSignUp.pdfcomms_mail_confirm(driver).sendKeys(constants.PDFCommsMail);
	  	  
	  //Fill in PAYE Ref
	  AppAdvancedSignUp.paye_Ref(driver).sendKeys(constants.PAYEREF);
	  
	  //Fill in Payroll Contact details
	  AppAdvancedSignUp.payCon_name(driver).sendKeys(constants.PayCon);
	  
	  //Not Necessary to fill out e-mail contact for bureau managed
	  //AppAdvancedSignUp.payCon_email(driver).sendKeys(constants.PayConMail);
	 
	  //Not Necessary to fill out e-mail contact for bureau managed confirm
	  //AppAdvancedSignUp.payCon_email_conf(driver).sendKeys(constants.PayConMail);
	    
	  AppAdvancedSignUp.payCon_tel_num(driver).sendKeys(constants.GenPhone);
	  
	  //Fill in payroll name
	  AppAdvancedSignUp.payroll_name(driver).sendKeys(constants.PayName);
	  
	  //Pick payroll frequency
	  new Select (AppAdvancedSignUp.payroll_freq(driver)).selectByVisibleText("Fortnightly");
	  
	  //Type payroll provider - not necessary for payroll bureau - prepopulated
	  //AppAdvancedSignUp.payroll_prov(driver).sendKeys("BrightPay");
	  
	  //click Continue
	  AppAdvancedSignUp.next_button(driver).click();
	  
	  
	  //Ensure we land on right page
	  Assert.assertEquals("Preview Agreement | Sign Up", driver.getTitle());
	
	  //click Continue
	  driver.findElement(By.id("next-button")).click();
	  
	  //Click authorised to apply for agreement
	  driver.findElement(By.xpath("//*[@id='accept-agreement-confirmation']/div/div[3]/div/a[1]")).click();
	 
	  //Click authorised to provide details for DD
	  driver.findElement(By.xpath("//*[@id='accept-agreement-confirmation']/div/div[3]/form/div/input[1]")).click();
	    
	  //Fill in bank account details
	  driver.findElement(By.id("direct_debit-ddpp_account_name-0")).sendKeys(constants.AccName);
	  driver.findElement(By.id("sort_code-0")).sendKeys(constants.SortCode);
	  driver.findElement(By.id("direct_debit-ddpp_account_number-0")).sendKeys(constants.AccNo);
	  //Click to copy account details from prim contact
	  driver.findElement(By.id("ddpp_contact_yes")).click();
	  
	  //fill in missing first name
	  driver.findElement(By.id("direct_debit-contact_first_name-0")).sendKeys("test");
	 
	  
	  //Locate element for which you wants to retrieve x y coordinates.
      WebElement Button = driver.findElement(By.id("ddpp_one_authorized_true"));
      //Used points class to get x and y coordinates of element.
      Point point = Button.getLocation();
      int xcord = point.getX();
      System.out.println("Element's Position from left side Is "+xcord +" pixels.");
      int ycord = point.getY();
      System.out.println("Element's Position from top side Is "+ycord +" pixels.");
	 
      //Click to mark one person as authorising DD on account
	  driver.findElement(By.id("ddpp_one_authorized_true")).click();
	  
	  
	  //Pause whilst it loads
	  
	  try {
		Thread.sleep(500);
	  } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	  
	  
	  //Locate element for which you wants to retrieve x y coordinates.
      WebElement Button1 = driver.findElement(By.id("ddpp_self_authorized_yes"));
      //Used points class to get x and y coordinates of element.
      Point point1 = Button1.getLocation();
      int xcord1 = point1.getX();
      System.out.println("Element's Position from left side Is "+xcord1 +" pixels.");
      int ycord1 = point1.getY();
      System.out.println("Element's Position from top side Is "+ycord1 +" pixels.");
      
      //Click to mark as I am able to authorise DD
	  driver.findElement(By.id("ddpp_self_authorized_yes")).click();
     
      //Different method of clicking
      //WebElement element = driver.findElement(By.id("ddpp_self_authorized_yes"));
      //Actions actions = new Actions(driver);
      //actions.moveToElement(element).click().perform();
      
      //Thread.sleep(2000);
      
      //Find an element and define it
	  //WebElement elementToClick = driver.findElement(By.id("ddpp_self_authorized_yes"));
	  //Print the location
	  // System.out.println(+elementToClick.getLocation().y+")");
	  //Scroll the browser to the element's Y position
	  //((JavascriptExecutor) driver).executeScript("window.scrollTo(0,"+elementToClick.getLocation().y+")");
	  //Click the element
	  //elementToClick.click();
	  
	  //Click to mark that I can auth a DD
	  //driver.findElement(By.id("ddpp_self_authorized_yes")).click();
	  
	  //click continue to check bank details
	  driver.findElement(By.id("check-bank-details")).click();
	  
	  //Some jiggerypokery to wait for a confirm details element to appear on the page and then click it
	  //WebElement confirmdeets;
	  // confirmdeets= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddpp_legal']/div[2]/div/button")));						
	 //confirmdeets.click();
	  
	  try {
		Thread.sleep(500);
	  } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	 
	//click confirm details
	  driver.findElement(By.xpath("//*[@id='ddpp_legal']/div[2]/div/button")).click();
	  
	  //click to use same bank account
	  driver.findElement(By.id("ddc_payroll_accounts-0")).click();
	  
	  //click for one person to autho
	  driver.findElement(By.id("ddc_one_authorized_true_0")).click();
	  
	  //Pause whilst it loads
	  
	  try {
		Thread.sleep(500);
	  } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	  
	  //click for I can auth
	  driver.findElement(By.id("ddc_self_authorized_yes_0")).click();
	  
	  try {
			Thread.sleep(500);
		  } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	  
	  //click to continue
	  driver.findElement(By.id("ddc-check-bank-details")).click();
	  
	  //Some jiggerypokery to wait for a confirm details element to appear on the page for a second time and then click it
	  //WebElement confirmdeets2;
	  //confirmdeets2= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='ddc_legal']/div[2]/div/button")));						
	  //confirmdeets2.click();
	  
	  try {
			Thread.sleep(500);
		  } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	  //click confirm details
	  driver.findElement(By.xpath("//*[@id='ddc_legal']/div[2]/div/button")).click();
	  
	  try {
			Thread.sleep(500);
		  } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		  }
	  
	  //click to complete application
	  driver.findElement(By.xpath("//*[@id='accept-agreement-confirmation']/div/div[3]/div/a[1]")).click();
	  
	  //click to notify that we do not have a promo code
	  driver.findElement(By.xpath("//*[@id='accept-agreement-confirmation']/div/div[5]/form/div[2]/input[3]")).click();
	  
	  //click to complete application
	  driver.findElement(By.id("next-button")).click();
	  
	  //fill out details of person who finished form
	  driver.findElement(By.id("accepted-by-first-name-1")).sendKeys("sigfirstname");
	  driver.findElement(By.id("accepted-by-last-name-1")).sendKeys("sigsurname");
	  driver.findElement(By.id("accepted-by-email-1")).sendKeys(constants.SigMail);
	  driver.findElement(By.id("accepted-by-email-confirm-0")).sendKeys(constants.SigMail);
	  
	  //click submit application
	  driver.findElement(By.id("signatory-continue")).click();
	  
	  //click to confirm agreement
	  driver.findElement(By.xpath("//*[@id='accept-agreement-confirmation']/div/div[6]/div[2]/label")).click();
	  
	  //click to fully complete application!
	  driver.findElement(By.id("final-acceptance")).click();
	  
      //verify landing on final page	
	  Assert.assertEquals("Online agreement submitted | Sign Up", driver.getTitle());
	  
	  
  }
  
    
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
