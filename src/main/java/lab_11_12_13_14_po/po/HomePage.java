package lab_11_12_13_14_po.po;
import lab_11_12_13_14_po.Bo;
import lab_11_12_13_14_po.decorator.GetCellData;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends Bo {
@FindBy(xpath = "/html/body/header/nav/div/div/div[3]/div/div[2]/form/input")
WebElement SearchInput;
@FindBy(xpath = "/html/body/div[1]/div[2]/div/div/a[1]/div/div[1]")
WebElement SearchedTitle;
@FindBy(xpath = "/html/body/header/nav/div/div/div[3]/div/div[2]/form/input")
GetCellData tableValue;

    public HomePage(WebDriver driver) {
        super(driver);
    }
public HomePage search() {
    SearchInput.click();
    SearchInput.sendKeys("What is Rest Api");
    SearchInput.sendKeys(Keys.ENTER);
 return this;
    }


    public HomePage SearchForMoreResults() {
        SearchInput.click();
        SearchInput.sendKeys("L");
        SearchInput.sendKeys(Keys.ENTER);
        return this;
    }



    public HomePage checks() throws InterruptedException {


        Thread.sleep(1000);

        Assert.assertTrue(SearchedTitle.isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(SearchedTitle.getText(),"What is Rest Api?");
        System.out.println(SearchedTitle.getText());


        return this;
    }


    public HomePage getTableValue() {

        tableValue.getCellData(2, 2 ,driver);

        return this;
    }



}