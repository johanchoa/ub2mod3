package starter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"step_definitions"},
      //  features = "src/test/resources/features/searcher.feature")
        features = "src/test/resources/features/ExecuteOrder.feature")
      //  features = "src/test/resources/features/Selector.feature")

public class searchTestSuite {
}
