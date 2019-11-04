package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//open the URL
		driver.get("http://rediff.com");
		
		//Click on Signin
		driver.findElement(By.cssSelector("a[title *= 'Sign in']")).click();
		
		//enter Username
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		
		//enter Password
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("Pass");
		
		//Click on Go
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

	}

}
