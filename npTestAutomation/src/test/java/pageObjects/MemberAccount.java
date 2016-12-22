package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MemberAccount {
	
	private static WebElement element = null;
	
	//Login link   
    
		 public static WebElement lnk_Login(WebDriver driver){
		 
		    element = driver.findElement(By.xpath("//*[@id='menu']/ul/li[2]/a"));
		 
		    return element;
		 
		    }

}
