package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\java\\resources\\features\\adicaodeprodutos.feature",
				glue = {"steps"},
				//tags = ("@Cenario1"),
				plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
				monochrome = true,
				publish = true)


public class TestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider()
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
