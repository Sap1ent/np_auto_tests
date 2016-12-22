package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
private static WebElement element = null;
	
    

	
	//Employer Icon
	    
	 public static WebElement er_icon(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//*[@id='primary']/div[2]/div[1]/div/dl/dd[1]/a/i"));
	 
	    return element;
	 
	    }
	 
	//Employer username email
	 
	 public static WebElement er_user_mail(WebDriver driver){
		 
		    element = driver.findElement(By.id("osuemail"));
		 
		    return element;
		 
		    }
	 
	//Employer password
	 
	 public static WebElement er_password(WebDriver driver){
		 
		    element = driver.findElement(By.id("osupassword"));
		 
		    return element;
		 
		    }
	 
	//Employer portal email
	
	//Employer Login button
	 
	//Employer Get link button
	 
	//Employer register button 
	 
	//Employee Icon
	    
		 public static WebElement ee_icon(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//*[@id='primary']/div[2]/div[1]/div/dl/dd[2]/a/i"));
		 
		    return element;
		 
		    }
		 
		//Adviser Icon
		    
		 public static WebElement adviser_icon(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//*[@id='primary']/div[2]/div[1]/div/dl/dd[3]/a/i"));
		 
		    return element;
		 
		    }
		 
		//Payroll Bureau Icon
		    
		 public static WebElement bureau_icon(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//*[@id='primary']/div[2]/div[1]/div/dl/dd[4]/a/i"));
		 
		    return element;
		 
		    }

}
