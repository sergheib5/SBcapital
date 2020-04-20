package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import utilities.Config;
import utilities.DBUtility;
import utilities.Driver;
import utilities.ExtentReport;


import java.sql.SQLException;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", "html:target/cucumber-html-report",
                "json:target/cucumber.json", "junit:target/cucumber.xml",
                "rerun:target/rerun.txt"},
        features="src/test/resources/features",
        glue="steps_def",
        dryRun= false,
        tags = "@excel"
)

public class CukesRunner {



    @BeforeClass
    public static void  setUp() throws SQLException {


    }

    @AfterClass
    public static void tearDown() throws SQLException {


    }

}
