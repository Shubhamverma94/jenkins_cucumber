package Test_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/login/login_test.feature"},glue = {"Step_Defination"}, dryRun = false)
public class testRunner extends AbstractTestNGCucumberTests {

}
