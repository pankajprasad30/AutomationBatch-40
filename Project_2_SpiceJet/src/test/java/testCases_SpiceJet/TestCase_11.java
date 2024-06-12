package testCases_SpiceJet;

import org.testng.annotations.Test;

import source_SpiceJet.Boooking_Page;
import source_SpiceJet.Homepage_SpiceJet;
import source_SpiceJet.Search_Page;

public class TestCase_11 extends Launch_Quit
{
	@Test
	public void passenger_info()
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
		b1.passenger_info_checkbox();
	}

}
