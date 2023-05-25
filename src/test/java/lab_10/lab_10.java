package lab_10;



import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lab_10 {
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
    }
    @Test
    void MyTest(){
        driver.get("https://demoqa.com/elements");
        WebElement TextBox = driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
        TextBox.click();
        WebElement Input1 = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        Input1.sendKeys("TEST");

        WebElement Text = driver.findElement(By.xpath("//*[@id=\"userName-label\"]"));
        System.out.println(Text.getText());
       WebElement Button = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
       System.out.println(Button.getSize());
      WebElement Image = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
        System.out.println(Image.getTagName());
Assert.assertEquals(Text.getText(),"Full Name");
Assert.assertTrue(Text.isDisplayed());
    }
    @AfterTest
    void closeBrowser(){
        driver.close();
        driver.quit();
    }
}