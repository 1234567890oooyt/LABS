package lab_11_12;


import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import lab_11_12_po.Bo;
import lab_11_12_po.po.HomePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class end_to_end {


    //    Setup ChromeDriver using driver file and properties.
//    Setup ChromeDriver using DriverManager.
//    My first UI test:
//    go to the page from your variant
//    choose any 5 different elements;
//    Use different WebElement methods to communicate with those elements. (one element - at least one interaction)
//    Make a testNG test case to check visibility of your elements.

    private WebDriver driver;
    @BeforeTest
    void setup() {
        //WebDriver webDriverTest = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        ChromeDriverManager.getInstance().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().setSize(new Dimension(1024, 768));
    }
    @Test
    void MyTest() throws InterruptedException {
        Bo bo = new Bo(driver);
        HomePage homePage = new HomePage(driver);
        bo
            .open("https://www.toolsqa.com/");
        homePage
                .search()
                .checks();
        homePage
                .SearchForMoreResults().getTableValue();
    }
    @AfterTest
    void closeBrowser(){
        driver.close();
        driver.quit();
    }



}





