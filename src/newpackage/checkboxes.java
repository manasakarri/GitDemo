package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		//check the checkbox - option1
		WebElement ch1 = driver.findElement(By.id("checkBoxOption1"));
		ch1.click();
		
		System.out.println(ch1.isSelected());
		
		//uncheck the checkbox - option1
		if(ch1.isSelected() == true)
		{
			ch1.click();
		}
		System.out.println(ch1.isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		

	}

}
