package testCases_SpiceJet;

import org.testng.Assert;
import org.testng.annotations.Test;

import source_SpiceJet.Homepage_SpiceJet;

public class TestCase_10 extends Launch_Quit
{
	// Validate the flight information, fare details, baggage rules and cancellations link has the details in the search result page.
	
	@Test
	public void Flight_Details()
	{
		Homepage_SpiceJet h1=new Homepage_SpiceJet(driver);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		h1.date_forward_button();
		h1.date_select();
		h1.flight_search_button();
		h1.flight_details_dropdown();
		//h1.flight_info();
		
		
	}

}
