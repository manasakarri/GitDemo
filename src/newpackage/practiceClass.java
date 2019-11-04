package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//opens the url
		driver.get("http://google.com");
		
		//enter text in search bar by using xPath (parent to child traversing)
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[1]/input")).sendKeys("selenium" + Keys.ENTER);
		
		//click on search
		//driver.findElement(By.xpath("//div[@class='A8SBwf']/div[3]/center/input[1]")).submit();
		
		//driver.findElement(By.cssSelector("input[class='RNmpXc']")).click();
		
		
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
		

	}

}
