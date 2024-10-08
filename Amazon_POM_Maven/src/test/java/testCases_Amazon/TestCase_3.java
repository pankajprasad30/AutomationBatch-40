package testCases_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import source_Amazon.Home_Page_Amazon;
import source_Amazon.Login_Amazon;
import source_Amazon.Product_Page_Amazon;

public class TestCase_3 extends Launch_Quit
{
	//Login->Serach->click 1st product->cart->reach till payments page	
	@Test
	public void Login_to_Payment() throws InterruptedException
	{
		Login_Amazon L1=new Login_Amazon(driver);
		L1.un_txtfld();
		L1.continue_button();
		L1.pswrd_txtfld();
		L1.signin_button();
		
		Home_Page_Amazon H1=new Home_Page_Amazon(driver);
		H1.Search_Shoe();
		H1.first_shoe();
		
		Set<String> Brwsr_ID=driver.getWindowHandles();
		Iterator<String> s1=Brwsr_ID.iterator();
		String Parent_Browser_ID=s1.next();
		String Child_Browser_ID=s1.next();
		driver.switchTo().window(Child_Browser_ID);
		
		Product_Page_Amazon p1= new Product_Page_Amazon(driver);
		p1.Add_Cart();
		p1.Proceed_Cart();
	}

}
