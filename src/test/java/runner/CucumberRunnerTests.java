package runner;

import org.testng.annotations.Listeners;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
    
@CucumberOptions(tags = "@OrangeHRM", features = {"src/test/resources/features/LoginPage.feature"}, glue = {"definitions"},
                 plugin = {"pretty", "html:target/cucumber-reports.html"})
@Listeners({ExtentITestListenerClassAdapter.class})
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
    
}