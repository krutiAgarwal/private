package AngularTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class Angulartest1 {

	public static NgWebDriver ngDriver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/nitinagarwal/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
		ngDriver=new NgWebDriver((JavascriptExecutor) driver);
		
		ngDriver.waitForAngularRequestsToFinish();
		
//		ByAngular.repeater("foo in f").row(17).column("foo.name")
		
//		System.out.println("The value is    "+ driver.findElement(ByAngular.repeater("column in columns")).getText());
		System.out.println("The value is "+driver.findElement(ByAngular.repeater("column in columns").row(0)).getText());
		
//		driver.findElement(ByAngular.repeater("column in columns").column("selected:dataRow.isSelected"));
		
		driver.quit();

			
			
		}}