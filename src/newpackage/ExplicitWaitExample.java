package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
		
		//explicitly waits until the text is visible to the user after clicking on the above link
		WebDriverWait dw=new WebDriverWait(driver,20);
		dw.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		
		System.out.println(driver.findElement(By.id("results")).getText());


	}

}
