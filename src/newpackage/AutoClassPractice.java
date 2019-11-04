package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoClassPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		WebElement suggestion=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		
		suggestion.sendKeys("ind");
		Thread.sleep(2000L);
		suggestion.sendKeys(Keys.DOWN);
		suggestion.sendKeys(Keys.DOWN);
		System.out.println(suggestion.getAttribute("value"));
		
		/*
		//using JavaScript DOM to identify hidden elements
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		
		while(!text.equalsIgnoreCase("INDIA"))
		{
			suggestion.sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
		}
		*/
	}

}
