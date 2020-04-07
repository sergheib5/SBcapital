//package runners;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.runner.RunWith;
//
//import java.net.MalformedURLException;
//import java.sql.SQLException;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = {"@target/rerun.txt"},
//        plugin = {
//                "pretty", "html:target/cucumber-html-report2",
//                "json:target/cucumber2.json", "junit:target/cucumber2.xml"},
//        glue = "steps_def")
//
//public class CukesRunnerReRunFailed {
//
//
//    @BeforeClass
//    public static void setUp() throws SQLException, MalformedURLException {
//
//
//    }
//
//    @AfterClass
//    public static void tearDown() throws SQLException {
//
//    }
//
//
//}
//
