package lab_11_12_13_14_po.listeners;



import io.qameta.allure.Attachment;
import lab_11_12_13_14_po.driverHelper.DriverHelper;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.BufferedWriter;
import java.io.FileWriter;


public class CustomTestListener implements ITestListener {
    private final Logger LOGGER = Logger.getLogger(this.getClass());
    @Attachment (value = "{0}",type ="text/plain")
    public String getHTML(){
        DriverHelper driverHelper= new DriverHelper();
        return driverHelper.driver.getPageSource();
    }
    @Override
    public void onTestFailure(ITestResult result) {
        try{
            // Create file
            FileWriter fstream = new FileWriter("C:\\Users\\Yehen\\Desktop\\A_T\\LABS");
            BufferedWriter out = new BufferedWriter(fstream);
            out.write(getHTML());
            //Close the output stream
            out.close();
        }catch (Exception e){//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        LOGGER.info(result.getName()+" onTestSkipped");
    }


    }
