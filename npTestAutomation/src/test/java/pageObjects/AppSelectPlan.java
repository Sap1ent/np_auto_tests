package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppSelectPlan {
	
	private static WebElement element = null;
    
	 //Button link to scheme 101
	    
	 public static WebElement scheme_101(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//*[@id='agreement-plans']/tbody/tr[2]/th[1]/div[2]/form/button"));
	 
	    return element;
	 
	    }
	 
	 //Button link to scheme 102
	    
	 public static WebElement scheme_102(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//*[@id='agreement-plans']/tbody/tr[2]/th[2]/div[2]/form/button"));
	 
	    return element;
	 
	    }

	 
	 //Button link to scheme 103
	    
	 public static WebElement scheme_103(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//*[@id='agreement-plans']/tbody/tr[2]/th[3]/div[2]/form/button"));
	 
	    return element;
	 
	    }

	 
	 //Button link to scheme 104
	    
	 public static WebElement scheme_104(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//*[@id='agreement-plans']/tbody/tr[2]/th[4]/div[2]/form/button"));
	 
	    return element;
	 
	    }

	 
	 //Button link to scheme 105
	    
	 public static WebElement scheme_105(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("//*[@id='agreement-plans']/tbody/tr[2]/th[5]/div[2]/form/button"));
	 
	    return element;
	 
	    }


}
