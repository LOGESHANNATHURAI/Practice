
package testrunnerfile;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"src/test/resources/feature/login.feature"},
		dryRun = !true,
		//to connect the step file and feature file
		glue = "stepdefenitionfile",
		//we will get classname words with underscore.that is a ruby format to change the ruby foramt class name to java class name we sld use snippettype camelcase
		snippets = SnippetType.CAMELCASE,
		//to remove extra thing (like letters in the above of the console )in the console we sld use it  
		monochrome = true
                 )
//we sld extend the AbstractTestNGCucumberTests. the only the script will run
public class testrunner extends AbstractTestNGCucumberTests{

}
