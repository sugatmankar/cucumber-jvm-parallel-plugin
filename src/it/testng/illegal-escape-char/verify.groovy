import org.junit.Assert

import static org.hamcrest.Matchers.equalToIgnoringWhiteSpace

File suite01 = new File(basedir, "target/generated-test-sources/cucumber/Parallel01IT.java");

assert suite01.isFile()

String expected01 =
        """import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(strict = true, features = {"src/test/resources/features/feature1.feature"}, tags = {"@complete"}, plugin = {"json:target/cucumber-reports/1.json",
"pretty"}, monochrome = false,  glue = { "foo", "bar" })
public class Parallel01IT extends AbstractTestNGCucumberTests {
}"""

Assert.assertThat(suite01.text, equalToIgnoringWhiteSpace(expected01))
