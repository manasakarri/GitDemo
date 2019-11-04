package newpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/windows");
		driver.findElement(By.xpath("//div[@id='content']/div/a")).click();
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentId=it.next();
		String childId=it.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//body/div/h3")).getText());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		

	}

}
