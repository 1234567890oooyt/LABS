package lab_11_12_po;

import lab_11_12_po.decorator.MyFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Bo {

    protected WebDriver driver;

    public Bo(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new MyFieldDecorator(driver),this);
    }
    public void open(String url){
        driver.get(url);

    }
}
