package testCases_SpiceJet;

import org.testng.annotations.Test;

import source_SpiceJet.Homepage_SpiceJet;

public class Testcase_9 extends Launch_Quit
{
	// validate the systems ability to handle multiple passenger
	@Test
	public void Multiple_Passenger()
	{
		Homepage_SpiceJet h1=new Homepage_SpiceJet(driver);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		h1.date_forward_button();
		h1.date_select();
		h1.passanger_dropdown();
		h1.adult_button();
		h1.children_button();
		h1.infant_button();
		h1.flight_search_button();
	}

}
