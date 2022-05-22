package AliTestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import AliUtil.AliTestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/AliFeature"} , 
plugin = {"json:target/cucumber.json"},
glue = "AliStepDef",tags= {"@All"})



   public class TestRunnerAli extends AbstractTestNGCucumberTests {
 
	@BeforeTest
	public static void setUP() {
	
	AliTestBase test = new AliTestBase();
	test.initalize();
	}
    @AfterTest
    public void tearDown() {
		AliTestBase test = new AliTestBase();
		test.driver.quit();
		
		}


}
