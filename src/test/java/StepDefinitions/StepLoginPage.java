package StepDefinitions;

import Locators.LoginLocators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class StepLoginPage extends PageObject {

    LoginLocators loginLocators = new LoginLocators();
//    WebDriver driver = new ChromeDriver();

//    public void startnew(){
//        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        driver.navigate().to("https://demo.automationtesting.in/Register.html");
//        driver.manage().window().maximize();
//    }

    @Step("Enter firstname")
    public void enterfirstname(){
        $(By.xpath(loginLocators.first_name)).sendKeys("Aryan");
    }

    @Step("Enter lastname")
    public void enterlastname(){
        $(By.xpath(loginLocators.last_name)).sendKeys("Pandey");
    }
    @Step("Enter address")
    public void enteraddress(){
        $(By.xpath(loginLocators.address)).sendKeys("F-102,Vatrak,Valsad");
    }
    @Step("Enter email-address")
    public void enteremail(){
        $(By.xpath(loginLocators.email_address)).sendKeys("aryanpandey7308@gmail.com");
    }
    @Step("Enter phoneno")
    public void enterphoneno(){
        $(By.xpath(loginLocators.phone)).sendKeys("7096930275");
    }
    @Step("Select gender")
    public void selectgender(){
        $(By.xpath(loginLocators.gender)).click();
    }
    @Step("Select hobbies")
    public void selecthobbies(){
        $(By.xpath(loginLocators.hobby)).click();
    }
    @Step("Enter language")
    public void language(){
        $(By.xpath(loginLocators.languages)).click();
        $(By.xpath(loginLocators.languages1)).click();
        $(By.xpath("//label[normalize-space()='Languages']")).click();
    }
    @Step("Enter skills")
    public void skilling(){
        $(By.xpath(loginLocators.skills)).click();
        $(By.xpath(loginLocators.select_skills)).click();
    }
    @Step("Enter country")
    public void country(){
        $(By.xpath(loginLocators.country)).click();
    }
    @Step("Enter select-country")
    public void selectCountry(){
        $(By.xpath(loginLocators.select_country)).click();
        $(By.xpath(loginLocators.select_country1)).click();
    }
    @Step("Enter year")
    public void year(){
        $(By.xpath(loginLocators.year)).click();
        $(By.xpath(loginLocators.year1)).click();
    }
    @Step("Enter Month")
    public void month(){
        $(By.xpath(loginLocators.month)).click();
        $(By.xpath(loginLocators.month1)).click();
    }
    @Step("Enter Day")
    public void day(){
        $(By.xpath(loginLocators.day)).click();
        $(By.xpath(loginLocators.day1)).click();
    }
    @Step("Enter password")
    public void pwd(){
        $(By.xpath(loginLocators.password)).sendKeys("Aryan110801");
    }
    @Step("Enter cfn_pass")
    public void confirm_pass(){
        $(By.xpath(loginLocators.confirm_password)).sendKeys("Aryan110801");
    }
    @Step("Enter submit")
    public void sub(){
        $(By.xpath(loginLocators.submit)).click();
    }
}
