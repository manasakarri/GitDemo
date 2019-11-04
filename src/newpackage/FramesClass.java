package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
		driver.switchTo().frame(0);
		System.out.println(driver.findElement(By.xpath("//html/body")).getText());
		
		
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
			driver.switchTo().frame(1);
		  System.out.println(driver.findElement(By.xpath("//html/body/div")).getText())
		  ;
		  
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
			driver.switchTo().frame(2);
		  System.out.println(driver.findElement(By.xpath("//html/body")).getText());
		  
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_bottom']")));
		  System.out.println(driver.findElement(By.xpath("//html/body")).getText());
		 
	}

}
