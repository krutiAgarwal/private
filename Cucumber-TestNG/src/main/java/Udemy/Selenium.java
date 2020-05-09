package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/nitinagarwal/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//img[@src='images/rs_logo.png']")).isDisplayed();
		
		WebElement selectElement=driver.findElement(By.id("dropdown-class-example"));
		
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		Thread.sleep(200l);
		
		Select sel=new Select(selectElement);
		
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		Thread.sleep(200l);
		sel.selectByValue("option1");
//		
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		
//		driver.close();

		
		
	}

}
