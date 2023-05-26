package lab_11_12_13_14_po.decorator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GetCellData extends Element{

    public GetCellData(WebElement webElement) {
        super(webElement);
        this.webElement=webElement;
    }

    public void getCellData(Integer column, Integer row , WebDriver driver){
        List<WebElement> rows=driver.findElements(By.className("article"));


        String[][] array = new String[3][4];
        int s = 0 ;

        for(int i =0 ; i<3;i++){
            for (int k=0; k<4;k++){
                array [i][k]=rows.get(s).getText();
                s++;

            }
        }


        System.out.println(array [column] [row]);



    }
}

//дорогоЙ дневник мне не передать ету боль и страдания которие я ощутил в джаве