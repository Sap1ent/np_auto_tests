package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	    private static WebElement element = null;
	    
	 //Login link   
	    
	 public static WebElement lnk_Login(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//*[@id='menu']/ul/li[2]/a"));
	 
	    return element;
	 
	    }
	 
	 public static WebElement lnk_Press(WebDriver driver){
	 
	    element = driver.findElement(By.id("//*[@id='menu']/ul/li[1]/a"));
	 
	 return element;
	 
	    }
	 
	 //Cookie close
	 
	 
	 
}

