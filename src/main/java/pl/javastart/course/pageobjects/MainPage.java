package pl.javastart.course.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.javastart.course.driver.DriverManager;

public class MainPage {
     @FindBy(className = "login-widget-button-login")
     private WebElement logIn;
     @FindBy(xpath="//*[@id='cmpbntyestxt']")
     private WebElement banner;


     public MainPage() {


          PageFactory.initElements(DriverManager.getWebDriver(), this);
     }

     public LoginPage logIn(){
          banner.click();
          logIn.click();
          return new LoginPage();
     }






}