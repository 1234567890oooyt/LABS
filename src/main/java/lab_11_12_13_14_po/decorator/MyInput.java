package lab_11_12_13_14_po.decorator;


import org.openqa.selenium.WebElement;

public class MyInput extends Element{

    public MyInput(WebElement webElement) {
        super(webElement);
        this.webElement=webElement;
    }

    public void input(String inputText){
        System.out.println("input '"+inputText+"'");
        webElement.sendKeys(inputText);;
    }
}