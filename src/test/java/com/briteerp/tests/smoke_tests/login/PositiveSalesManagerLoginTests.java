package com.briteerp.tests.smoke_tests.login;

import com.briteerp.utilities.ApplicationConstants;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.TestBase;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class PositiveSalesManagerLoginTests extends TestBase {

    @Test()
    public void positiveLoginTest() {
        extentLogger = report.createTest("Positive login test for Sales Manager level");

        extentLogger.info("Verifying to open main page");
        // pages.login().signIn();
        extentLogger.info("Verifying to open BriteErpDemo");
        pages.login().selectBriteErpDemo();

        extentLogger.info("Verifying to login Manager account");
        pages.login().login(ConfigurationReader.getProperty("salesManagerEmail"),
                ConfigurationReader.getProperty("salesManagerPassword"));

        extentLogger.info("Verifying to open Sales model page is ready for usage");
        pages.login().clickSales();

        extentLogger.info("Verifying user in Manager account");
        assertEquals(pages.login().salesManagerText.getText(), ApplicationConstants.SALESMANAGER_ACCOUNT_NAME);




    }

}
