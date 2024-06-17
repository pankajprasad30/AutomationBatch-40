package testCases_SpiceJet;

import org.testng.annotations.Test;

import source_SpiceJet.AddOn_Page;
import source_SpiceJet.Boooking_Page;
import source_SpiceJet.Homepage_SpiceJet;
import source_SpiceJet.Payment_Page;
import source_SpiceJet.Search_Page;

public class TestCase_15 extends Launch_Quit
{
	//Reach till payment page and select credit card option --> enter card details and make payment
	
	@Test
	public void Till_Payement_Page() throws InterruptedException
	{
		Homepage_SpiceJet h1=new Homepage_SpiceJet(driver);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		h1.date_forward_button();
		h1.date_select();
		h1.flight_search_button();
		
		Search_Page s1=new Search_Page(driver);
		s1.search_continue_button();
		
		Boooking_Page b1=new Boooking_Page(driver);
		b1.title_selection_dd();
		b1.title_selection();
		b1.FIRST_NAME();
		b1.LAST_NAME();
		b1.Mobile_No();
		b1.Email();
		b1.town_name();
		Thread.sleep(2000);
		b1.passenger_info_checkbox();
		b1.payment_page_continue_button();
		b1.continue_button();
		
		AddOn_Page a1=new AddOn_Page(driver);
		//a1.continue_button();
		a1.iframe1(driver);
		a1.pop_up1();
		a1.continue_button();
		
		Payment_Page p1=new Payment_Page(driver);
		p1.card_holder_name();
		p1.card_holder_name();
		p1.expiry_month();
		p1.expiry_year();
		p1.cvv_number();
		p1.proceed_to_pay_button();
		
	}

}
