package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginStepDefinition {

	 WebDriver driver;
	 
	
	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/nitinagarwal/Downloads/chromedriver");
		driver = new ChromeDriver();
//		log.info("Launching Chrome Driver");
		driver.get("https://www.google.com");
	}

	@When("^title of login page is Google$")
	public void title_of_login_page_is_google() {
		String title = driver.getTitle();
//		log.info("Title of the Page is "+title);
		System.out.println(title);
		Assert.assertEquals("Google", title);
	}

	@Then("^user clicks on Gmail$")
	public void user_clicks_on_Gmail() {
		WebElement gmail = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		gmail.click();

	}

	@Then("^user navigates to Gmail Page$")
	public void user_navigates_to_Gmail_Page() {
		String title = driver.getTitle();
		System.out.println(title);
//		log.info("Title of the Page is "+title);
		Assert.assertEquals("Gmail - Email from Google", title);

	}

	@Then("^Close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
