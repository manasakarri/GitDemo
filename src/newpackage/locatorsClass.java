package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("manasa.karri@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement((By.linkText("Forgot account?"))).click();

	}

}
