package Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLocators {

    WebDriver driver = new ChromeDriver();

    public final String full_name = "//input[@placeholder='First Name']";
    public final String last_name = "//input[@placeholder='Last Name']";
    public final String address = "//textarea[@ng-model='Adress']";
    public final String email_address = "//input[@type='email']";
    public final String phone = "//input[@type='tel']";
    public final String gender = "//input[@value='Male']";
    public final String hobby = "//input[@id='checkbox1']";
    public final String languages = "//div[@id='msdd']/../div[2]/ul/li/a[contains(text(),'English')]";
    public final String skills = "//select[@id='Skills']";
    public final String country = "//select[@id='countries']";
    public final String select_country = "//span[@id='select2-country-container']";
    public final String year = "//select[@placeholder='Year']";
    public final String month = "//select[@placeholder='Month']";
    public final String day = "//select[@placeholder='Day']";
    public final String password = "//input[@id='firstpassword']";
    public final String confirm_password = "//input[@id='secondpassword']";
    public final String submit = "//button[@id='submitbtn']";

}
