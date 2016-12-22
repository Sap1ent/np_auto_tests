package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppAdvancedSignUp {
	
	private static WebElement element = null;
	
	//TODO change default scheme code
	
	//TODO Add another scheme code to contrib model
    
	//Employer Legal Name field
	    
	 public static WebElement emp_Legal_Name(WebDriver driver){
	 
	    element = driver.findElement(By.id("company_name_legal"));
	 
	    return element;
	 
	    }
	 
	//Employer Trading Name field
	    
	 public static WebElement emp_Trade_Name(WebDriver driver){
		 
	    element = driver.findElement(By.id("company_name_aka"));
	 
	    return element;
	 
	    }
	 
	 //TODO Holding company yes
	 
	 //TODO Holding company no
	 
	 //Staging date drop down
	    
		 public static WebElement emp_Stage_Date(WebDriver driver){
			 
		    element = driver.findElement(By.id("staging_date"));
		 
		    return element;
		 
		    }
		 
	//Start early Yes radio button
	    
	 public static WebElement start_Early_Yes(WebDriver driver){
		 
	    element = driver.findElement(By.id("start_early-0"));
	 
	    return element;
	 
	    }
	 
	//Start early No radio button
	    
		 public static WebElement start_Early_No(WebDriver driver){
			 
		    element = driver.findElement(By.id("start_early-1"));
		 
		    return element;
		 
		    }
		 
		//Company type drop down
		    
		 public static WebElement comp_Type_Dropdown(WebDriver driver){
			 
		    element = driver.findElement(By.id("company_type-1"));
		 
		    return element;
		 
		    }
		 
		//Company registration no
		    
		 public static WebElement comp_RegNo(WebDriver driver){
			 
		    element = driver.findElement(By.id("company_registration_no"));
		 
		    return element;
		 
		    }
		 
		 //TODO No reg number checkbox
		 
		//Company address 1
		    
		 public static WebElement comp_Address1(WebDriver driver){
			 
		    element = driver.findElement(By.id("company_address1"));
		 
		    return element;
		 
		    } 
		 
		//Company address 2
		    
		 public static WebElement comp_Address2(WebDriver driver){
			 
		    element = driver.findElement(By.id("company_address2"));
		 
		    return element;
		 
		    } 
		 
		//Company city
		    
		 public static WebElement comp_City(WebDriver driver){
			 
		    element = driver.findElement(By.id("company_city"));
		 
		    return element;
		 
		    } 
		 
		//Company postcode
		    
		 public static WebElement comp_Postcode(WebDriver driver){
			 
		    element = driver.findElement(By.id("company_postcode"));
		 
		    return element;
		 
		    } 
		 
		//Number of employees dropdown 
		 
		 public static WebElement num_inc_Empl(WebDriver driver){
			 
			    element = driver.findElement(By.id("no_of_included_employees"));
			 
			    return element;
			 
			    } 
	 
		 //TODO contact address specify
		 
		 //Prim contact name
		 
		 public static WebElement primCon_Name(WebDriver driver){
			 
			    element = driver.findElement(By.id("primary_contact_name-0"));
			 
			    return element;
			 
			    } 
		 
		 //Prim contact mail
		 
		 public static WebElement primCon_Mail(WebDriver driver){
			 
			    element = driver.findElement(By.id("primary_contact_email-0"));
			 
			    return element;
			 
			    } 
		 
		 //Prim contact mail confirm
		 
		 public static WebElement primCon_Mail_conf(WebDriver driver){
			 
			    element = driver.findElement(By.id("primary_contact_email_confirm-0"));
			 
			    return element;
			 
			    }
		 
		 //Prim contact job title
		 
		 public static WebElement primCon_job_title(WebDriver driver){
			 
			    element = driver.findElement(By.id("primary_contact_title-0"));
			 
			    return element;
			 
			    }
		 
		 //Prim contact telephone number
		 
		 public static WebElement primCon_tel_num(WebDriver driver){
			 
			    element = driver.findElement(By.id("primary_contact_phone-0"));
			 
			    return element;
			 
			    }
		 
		 //Pdf comms first mail
		 
		 public static WebElement pdfcomms_mail(WebDriver driver){
			 
			    element = driver.findElement(By.id("payroll_settings-company_pdf_email-0"));
			 
			    return element;
			 
			    }
		 
		 //Pdf comms confirm mail
		 
		 public static WebElement pdfcomms_mail_confirm(WebDriver driver){
			 
			    element = driver.findElement(By.id("payroll_settings-pdf_comms_mailbox_confirm-0"));
			 
			    return element;
			 
			    }
		 
		//PAYE Ref
		 
		 public static WebElement paye_Ref(WebDriver driver){
			 
			    element = driver.findElement(By.id("paye_ref-0"));
			 
			    return element;
			 
			    }
				 
		//Payroll Contact details
		//Payroll contact name
		 
		 public static WebElement payCon_name(WebDriver driver){
			 
			    element = driver.findElement(By.id("payroll_settings-payroll_contact_name-0"));
			 
			    return element;
			 
			    }
		 
		//Payroll contact e-mail
		 
		 public static WebElement payCon_email(WebDriver driver){
			 
			    element = driver.findElement(By.id("payroll_settings-payroll_contact_email-0"));
			 
			    return element;
			 
			    }
		 
		//Payroll contact e-mail confirm
		 
		 public static WebElement payCon_email_conf(WebDriver driver){
			 
			    element = driver.findElement(By.id("payroll_settings-payroll_contact_email_confirm-0"));
			 
			    return element;
			 
			    }

		 //Payroll contact e-mail confirm
		 
		 public static WebElement payCon_tel_num(WebDriver driver){
			 
			    element = driver.findElement(By.id("payroll_settings-payroll_contact_phone-0"));
			 
			    return element;
			 
			    } 
		 
		 //Payroll name
		 
		 public static WebElement payroll_name(WebDriver driver){
			 
			    element = driver.findElement(By.id("payrolls-0-payroll_name-0"));
			 
			    return element;
			 
			    } 
		
		 //Payroll frequency
		 
		 public static WebElement payroll_freq(WebDriver driver){
			 
			    element = driver.findElement(By.id("payrolls-0-payroll_type-0"));
			 
			    return element;
			 
			    } 
		 
		 //Payroll provider
		 
		 public static WebElement payroll_prov(WebDriver driver){
			 
			    element = driver.findElement(By.id("payrolls-0-payroll_provider-0"));
			 
			    return element;
			 
			    } 
		 
		 //Next button
		 
		 public static WebElement next_button(WebDriver driver){
			 
			    element = driver.findElement(By.id("next-button"));
			 
			    return element;
			 
			    } 
		 
}
	
	
	
	 
	 
	  
	  
	  
	  


