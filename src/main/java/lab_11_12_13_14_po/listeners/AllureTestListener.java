package lab_11_12_13_14_po.listeners;



import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AllureTestListener implements ITestListener {





    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);

    }
    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
    }
    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);

    }
}