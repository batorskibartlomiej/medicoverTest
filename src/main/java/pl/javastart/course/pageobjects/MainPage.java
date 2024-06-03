package pl.javastart.course.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pl.javastart.course.driver.DriverManager;

import java.util.List;

public class MainPage {
     @FindBy(className = "login-widget-button-login")
     private WebElement logIn;
     @FindBy(xpath="//*[@id='cmpbntyestxt']")
     private WebElement banner;


     public MainPage() {


          PageFactory.initElements(DriverManager.getWebDriver(), this);
     }

     public LoginPage logIn(){
//          String currentTabHandle = DriverManager.getWebDriver().getWindowHandle();String newTabHandle = DriverManager.getWebDriver().getWindowHandles()
//               .stream()
//               .filter(handle -> !handle.equals(currentTabHandle ))
//               .findFirst()
//               .get();
//       DriverManager.getWebDriver().switchTo().window(newTabHandle);
       //DriverManager.getWebDriver().switchTo().parentFrame();

          int frameIndex = 0;
     List<WebElement> listFrames = DriverManager.getWebDriver().findElements(By.tagName("iframe"));
        System.out.println("list frames   "+listFrames.size());
          banner.click();
          logIn.click();
          return new LoginPage();
     }






}