package pl.javastart.course.tests;

import org.testng.annotations.Test;
import pl.javastart.course.driver.DriverManager;
import pl.javastart.course.pageobjects.MainPage;
import pl.javastart.course.pageobjects.TestBase;

import java.awt.*;

public class LogIn extends TestBase {

    @Test
    public void LogIn() throws AWTException, InterruptedException {





        DriverManager.getWebDriver().switchTo().parentFrame();
        MainPage mainPage = new MainPage();
        mainPage.logIn();
    }


}
