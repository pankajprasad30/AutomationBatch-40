package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DDT_StepDefinations 
{
	static WebDriver driver;
	@Given("User is on sauce demo webpage.")
	public void user_is_on_sauce_demo_webpage() 
	{
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.saucedemo.com/v1/");
	}

	@When("user is login into sauce demo webpage with valid {string} and {string}.")
	public void user_is_login_into_sauce_demo_webpage_with_valid_and(String string, String string2) {
	   driver.findElement(By.id("user-name")).sendKeys(string);
	   driver.findElement(By.id("password")).sendKeys(string2);
	}

	@When("user clicks on login Button.")
	public void user_clicks_on_login_button() 
	{
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("user navigated to home page of saucedemo webpage.")
	public void user_navigated_to_home_page_of_saucedemo_webpage() 
	{
	   Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0);
	}

	@Then("Quit the browser.")
	public void quit_the_browser() 
	{
	    driver.quit();
	}


}
