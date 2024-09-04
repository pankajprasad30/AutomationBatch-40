package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="",features={"src/test/resources/Features/DDT.feature"},
  glue= {"StepDefinations"},plugin= {"pretty","html:Reports/ddtreport.html"} )

public class DDT_TestRunner extends AbstractTestNGCucumberTests
{

}
