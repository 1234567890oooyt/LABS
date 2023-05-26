package lab_11_12_13_14_po.listeners;


import org.apache.log4j.Logger;
import org.testng.*;

public class CustomSuiteListener implements ISuiteListener , IInvokedMethodListener {
    private final Logger LOGGER = Logger.getLogger(this.getClass());
    @Override
    public void onStart(ISuite suite) {
        ISuiteListener.super.onStart(suite);
        LOGGER.info(suite.getName()+" START");
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
        IInvokedMethodListener.super.afterInvocation(method, testResult, context);
        LOGGER.info(testResult.getName()+"RESULTS");
    }
}