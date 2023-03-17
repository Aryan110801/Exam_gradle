package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class StepRegistrationPage {

    @Steps
    StepLoginPage loginPage;

    @Given("User is on Home page of website")
    public void user_is_on_home_page_of_website() {
        System.out.println("User is on Home page");
    }

    @When("User enters the following details")
    public void user_enters_the_following_details() {
        loginPage.enterfirstname();
        loginPage.enterlastname();
        loginPage.enteraddress();
        loginPage.enteremail();
        loginPage.enterphoneno();
        loginPage.entergender();
        loginPage.selecthobbies();
        loginPage.lang();
        loginPage.skilling();
        loginPage.country();
        loginPage.select_country();
        loginPage.year();
        loginPage.month();
        loginPage.day();
        loginPage.pwd();
        loginPage.confirm_pass();
    }

    @When("Clicks on Submit button")
    public void clicks_on_submit_button() {
        loginPage.sub();
    }

    @Then("He should be able to login")
    public void he_should_be_able_to_login() {
        System.out.println("Login success");
    }
}
