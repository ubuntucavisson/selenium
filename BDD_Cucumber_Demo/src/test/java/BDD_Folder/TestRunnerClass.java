package BDD_Folder;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/GoogleSearch.feature", "src/test/resources/demoL.feature"}, glue= {"BDD_Folder"},
monochrome=true,
//plugin= {"pretty","html:target/HtmlReport/report.html"}
//plugin= {"pretty","json:target/reports/cucumber.json"}
plugin= {"pretty","junit:target/reports/cucumber.xml"},
tags="@smokeTest"
		)
public class TestRunnerClass {

}
