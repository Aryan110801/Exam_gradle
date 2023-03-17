package StepDefinitions;

import Locators.LoginLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class StepLoginPage extends PageObject {

    LoginLocators loginLocators = new LoginLocators();

    @Step("Enter firstname")
    public void enterfirstname(){
        $(By.xpath(loginLocators.full_name)).sendKeys("Aryan");
    }

    @Step("Enter lastname")
    public void enterlastname(){
        $(By.xpath(loginLocators.last_name)).sendKeys("Pandey");
    }
    @Step("Enter address")
    public void enteraddress(){
        $(By.xpath(loginLocators.address)).sendKeys("Vatrak");
    }
    @Step("Enter email-address")
    public void enteremail(){
        $(By.xpath(loginLocators.email_address)).sendKeys("Aryan123@gmail.com");
    }
    @Step("Enter phoneno")
    public void enterphoneno(){
        $(By.xpath(loginLocators.phone)).sendKeys("7096930275");
    }
    @Step("Select gender")
    public void entergender(){
        $(By.xpath(loginLocators.gender)).click();
    }
    @Step("Select hobbies")
    public void selecthobbies(){
        $(By.xpath(loginLocators.hobby)).click();
    }
    @Step("Enter language")
    public void lang(){
        $(By.xpath(loginLocators.languages)).click();
    }
    @Step("Enter skills")
    public void skilling(){
        $(By.xpath(loginLocators.skills)).selectByVisibleText("C++").click();
    }
    @Step("Enter country")
    public void country(){
        $(By.xpath(loginLocators.country)).click();
    }
    @Step("Enter select-country")
    public void select_country(){
        $(By.xpath(loginLocators.select_country)).selectByVisibleText("Bangladesh").click();
    }
    @Step("Enter year")
    public void year(){
        $(By.xpath(loginLocators.year)).selectByVisibleText("2001").click();
    }
    @Step("Enter Month")
    public void month(){
        $(By.xpath(loginLocators.month)).selectByVisibleText("January").click();
    }
    @Step("Enter Day")
    public void day(){
        $(By.xpath(loginLocators.day)).selectByVisibleText("3").click();
    }
    @Step("Enter password")
    public void pwd(){
        $(By.xpath(loginLocators.password)).sendKeys("Aryan");
    }
    @Step("Enter cfn_pass")
    public void confirm_pass(){
        $(By.xpath(loginLocators.confirm_password)).sendKeys("Aryan");
    }
    @Step("Enter submit")
    public void sub(){
        $(By.xpath(loginLocators.submit)).click();
    }


}
