package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/test/resources/Features/Login.feature"},
glue= {"StepDefinations"},plugin= {"pretty","html:Reports/htmlreport.html"} )

public class Cucumber_TestRunner extends AbstractTestNGCucumberTests
{

}
