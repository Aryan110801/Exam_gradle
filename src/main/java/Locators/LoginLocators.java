package Locators;


public class LoginLocators {

    public final String first_name = "//input[@placeholder='First Name']";
    public final String last_name = "//input[@placeholder='Last Name']";
    public final String address = "//textarea[@ng-model='Adress']";
    public final String email_address = "//input[@type='email']";
    public final String phone = "//input[@type='tel']";
    public final String gender = "//input[@value='Male']";
    public final String hobby = "//input[@id='checkbox1']";
    public final String languages = "//div[@id='msdd']";
    public final String languages1 = "//div[@id='msdd']/../div[2]/ul/li/a[contains(text(),'English')]";
    public final String skills = "//select[@id='Skills']";
    public final String select_skills = "//select[@id='Skills']//option[@value='C++']";
    public final String country = "//select[@id='countries']";
    public final String select_country = "//span//span[@role='combobox']";
    public final String select_country1 = "//span//span//span//ul//li[text()='India']";
    public final String year = "//select[@placeholder='Year']";
    public final String year1 = "//select[@placeholder='Year']//option[@value='2001']";
    public final String month = "//select[@placeholder='Month']";
    public final String month1 = "//select[@placeholder='Month']//option[@value='January']";
    public final String day = "//select[@placeholder='Day']";
    public final String day1 = "//select[@placeholder='Day']//option[@value='3']";
    public final String password = "//input[@id='firstpassword']";
    public final String confirm_password = "//input[@id='secondpassword']";
    public final String submit = "//button[@id='submitbtn']";

}
