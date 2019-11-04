package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testQaAcademysite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manasa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("http://www.qaclickacademy.com");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Thread.sleep(2000);
		
		
		driver.findElement(By.xpath(" //span[contains(text(),'Login')]")).click();
		
		/*
		 * if(driver.findElement(By.xpath("//button[contains(text(),'NO THANKS')]")).
		 * isDisplayed()) {
		 * driver.findElement(By.xpath("//button[contains(text(),'NO THANKS')]")).click(
		 * ); }
		 */
		

	}

}
