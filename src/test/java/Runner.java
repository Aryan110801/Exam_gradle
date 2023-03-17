import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "C:\\Users\\Aryan.Pandey\\IdeaProjects\\Exam_gradle\\src\\test\\resources\\Features\\registration.feature",glue = "StepDefinitions")
public class Runner {
}
