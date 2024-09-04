package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinations 
{
	static WebDriver driver;
	@Given("user is on login page of amazon.")
	public void user_is_on_login_page_of_amazon() 
	{
	    driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	}
	@When("user enters valid credentails.")
	public void user_enters_valid_credentails() 
	{
	   WebElement username=driver.findElement(By.id("ap_email"));
	   username .sendKeys("pankajprasad4798@gmail.com");
	   username.sendKeys(Keys.ENTER);
	   WebElement password=driver.findElement(By.id("ap_password"));
	   password.sendKeys("Automation@123");
	}

	@And("user is clicking on login button.")
	public void user_is_clicking_on_login_button() 
	{
	    driver.findElement(By.id("signInSubmit")).click();
	}

	@Then("user is navigated to home page.")
	public void user_is_navigated_to_home_page() 
	{
	   Assert.assertTrue(driver.findElements(By.id("nav-logo-sprites")).size()>0, "user is navigated to home page");
	}

	@And("close the browser")
	public void close_the_browser() 
	{
	   driver.quit();
	}

}
