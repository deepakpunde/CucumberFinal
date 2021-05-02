package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "features",                /*specifies where feature files are kept*/
 glue={"steps"},                      /*specifies where step definitions are kept*/
 plugin= {"pretty","html:Report1"},   /*specifies how report will be generated*/
 monochrome = true                   /*more readable format, removes extra text from console*/
 //tags = {"Sanity"}
 //dryRun = true                       /*Find out any scenarios without steps exists. When true it will skip sceanrios with step definitions*/
 //,plugin= {"pretty","json:Report2"}
 //,plugin= {"pretty","junit:Report3"}
 //strict = true,                       /*makes mandatory to add step definitions*/
 //tags = {"Smoke"},                    /*Will run only scenarios which have tag specified*/
 //name= {"Log"}						  /*Will run only scenarios which have specified string in their name*/
 )

public class TestRunner {
	
}
