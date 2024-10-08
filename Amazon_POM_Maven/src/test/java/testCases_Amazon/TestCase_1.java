package testCases_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import source_Amazon.Cart_Page_Amazon;
import source_Amazon.Home_Page_Amazon;
import source_Amazon.Login_Amazon;
import source_Amazon.Product_Page_Amazon;

public class TestCase_1 extends Launch_Quit
{
	//Login->Search the product->clicking on 1st product->wishlist->cart	
	@Test
	public void login_to_cart() throws InterruptedException
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
		
		Product_Page_Amazon P1=new Product_Page_Amazon(driver);
		P1.wishlist();
		P1.View_Your_List();
		
		Cart_Page_Amazon c1=new Cart_Page_Amazon(driver);
		c1.add_to_cart();
	}

}
