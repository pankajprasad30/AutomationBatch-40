package selenium.program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_2 
{
	@Test(dataProvider="testdata1")
	public void data_pro1(String username1, String password1 ) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(username1);
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys(password1);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
	}
	
	@DataProvider(name="testdata1")
	public Object[][] dataforlogin()
	{
		Object[][]d1=new Object[5][2];
		d1[0][0]="pankaj@gmail.com";
	    d1[0][1]= "math@123";
	    d1[1][0]="pankaj1@gmail.com";
	    d1[1][1]= "math1@123";
	    d1[2][0]="pankaj2@gmail.com";
	    d1[2][1]= "math3@123";
	    d1[3][0]="pankaj3@gmail.com";
	    d1[3][1]= "math12@123";
	    d1[4][0]="pankaj4@gmail.com";
	    d1[4][1]= "math11@123";
		return d1;
		
		
	}
	

}
