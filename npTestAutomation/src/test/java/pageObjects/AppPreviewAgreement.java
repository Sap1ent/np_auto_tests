package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppPreviewAgreement {
	
	private static WebElement element = null;
	
		//Authorised to apply button

	 public static WebElement auth_apply(WebDriver driver){
		 
	    element = driver.findElement(By.xpath("//*[@id='accept-agreement-confirmation']/div/div[3]/div/a[1]"));
	 
	    return element;
	 
	    }

}


