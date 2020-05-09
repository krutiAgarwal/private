package Udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class suggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/nitinagarwal/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'From')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MUM");
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		driver.findElement(By.id("fromCity")).click();
//		
//		
//		driver.findElement(By.id("fromCity")).sendKeys("MUM");
//		Thread.sleep(2000);
//		driver.findElement(By.id("fromCity")).sendKeys(Keys.ENTER);
		
		
		
		
//		driver.findElement(By.id("toCity")).clear();
//		driver.findElement(By.id("toCity")).clear();
//		
		


	}


