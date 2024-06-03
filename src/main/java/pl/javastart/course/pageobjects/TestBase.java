package pl.javastart.course.pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import pl.javastart.course.driver.DriverManager;

public class TestBase {

    private WebDriver driver;


    @BeforeMethod
    public void beforetest() {

        driver = DriverManager.getWebDriver();

        driver.navigate().to("https://www.medicover.pl/");
    }


//    @AfterMethod
//    public void afterTest() {
//        DriverManager.disposeDriver();
//    }
}
