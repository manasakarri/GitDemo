package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class cleartripPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String errMessage;

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com/");

		// selecting value from Adults dropdrown
		Select ddAdult = new Select(driver.findElement(By.id("Adults")));
		ddAdult.selectByValue("2");

		// selecting value from Children dropdown
		Select ddChild = new Select(driver.findElement(By.id("Childrens")));
		ddChild.selectByIndex(1);

		// select value from Infants dropdown
		Select ddInfant = new Select(driver.findElement(By.id("Infants")));
		ddInfant.selectByVisibleText("1");

		// select departure date from calendar picker
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click();

		// click on More options link
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();

		// select value from TravelClass dropdown
		Select ddTravelclass = new Select(driver.findElement(By.id("Class")));
		ddTravelclass.selectByValue("Business");

		// enter text in Preferred Airline textbox
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");

		// click on search flights button
		driver.findElement(By.id("SearchBtn")).click();

		// get error message and print on console
		errMessage = driver.findElement(By.id("homeErrorMessage")).getText();
		System.out.println(errMessage);

	}

}
