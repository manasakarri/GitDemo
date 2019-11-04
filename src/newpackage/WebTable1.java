package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		/*
		int totalRows = driver.findElements(By.xpath("//table[@id='product']//tbody//tr")).size();
		System.out.println(totalRows);
		
		int totalColumns = driver.findElements(By.xpath("//table[@id='product']//tbody//tr//th")).size();
		System.out.println(totalColumns);
		
		
		
		System.out.println(driver.findElements(By.xpath("//table[@id='product']//tbody//tr//td[1]")).get(2).getText());
		System.out.println(driver.findElements(By.xpath("//table[@id='product']//tbody//tr//td[2]")).get(2).getText());
		System.out.println(driver.findElements(By.xpath("//table[@id='product']//tbody//tr//td[3]")).get(2).getText());
		*/
		
		
		
		WebElement table = driver.findElement(By.cssSelector("#product"));
		int rowcount= table.findElements(By.xpath("//tr")).size();
		int columncount = table.findElements(By.cssSelector("th")).size();
		System.out.println(rowcount);
		System.out.println(columncount);
		System.out.println(table.findElement(By.xpath("//tr[3]//td[1]")).getText());
		System.out.println(table.findElement(By.xpath("//tr[3]//td[2]")).getText());
		System.out.println(table.findElement(By.xpath("//tr[3]//td[3]")).getText());
		
		
		
		
	}

}
