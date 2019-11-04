package newpackage;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class testClass2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
       
//    	driver.get("http://www.popuptest.com/popuptest2.html");
//        driver.quit();  // using QUIT all windows will close
    	
    	//switch to iFrame
    	
		/*
		 * driver.get("http://demo.guru99.com/selenium/deprecated.html");
		 * driver.switchTo().frame("classFrame");
		 * driver.findElement(By.linkText("Deprecated")).click(); driver.close();
		 */
    	
    	//Explicit wait for a particular instance
    	driver.get("http://demo.guru99.com/test/newtours/");
    	
    	WebDriverWait wdWait=new WebDriverWait(driver,10);
    	
    	wdWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
    	driver.findElement(By.name("userName")).sendKeys("tutorial");
    			   	
    
        
        }
}
