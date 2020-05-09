package AngularTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class AngularNgTest {
	
	public static NgWebDriver ngDriver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/nitinagarwal/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://juliemr.github.io/protractor-demo/");
		ngDriver=new NgWebDriver((JavascriptExecutor) driver);
		
		ngDriver.waitForAngularRequestsToFinish();
		driver.findElement(ByAngular.model("first")).sendKeys("2");
		driver.findElement(ByAngular.model("second")).sendKeys("2");
		driver.findElement(ByAngular.buttonText("Go!")).click();
		Thread.sleep(200);
		try
		{
		String expectedResult=driver.findElement(By.xpath("//tr[@ng-repeat='result in memory']//td[@class='ng-binding'][2]")).getText();
		System.out.println("the value is......"+expectedResult);
		}catch(Exception e){
			System.out.println("the exception is..."+e.getMessage());
			
			
		}
//		assertEquals("4", expectedResult);
//		try{
//		driver.findElement(ByAngular.repeater("result in memory"));
//		}catch(Exception e)
//		{
//			
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println("The value of the Table is"      +text);
//		driver.quit();
}
}