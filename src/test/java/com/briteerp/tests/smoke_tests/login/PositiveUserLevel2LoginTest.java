package com.briteerp.tests.smoke_tests.login;

import com.briteerp.utilities.ApplicationConstants;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.TestBase;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

public class PositiveUserLevel2LoginTest extends TestBase {

    @Test()
    public void positiveLoginTest() {
        extentLogger = report.createTest("Positive login test for Sales User level");


        extentLogger.info("Verifying to open main page");
        // pages.login().signIn();
        extentLogger.info("Verifying to open BriteErpDemo");
        pages.login().selectBriteErpDemo();

        extentLogger.info("Verifying to login User account");
        pages.login().login(ConfigurationReader.getProperty("salesUser2Email"),
                ConfigurationReader.getProperty("salesUser2Password"));

        extentLogger.info("Verifying to open Sales model page is ready for usage");
        pages.login().clickSales();

        extentLogger.info("Verifying user in Sales User account");
        assertEquals(pages.login().salesUser2Text.getText(),
                ApplicationConstants.SALESUSERLEVEL2_ACCOUNT_NAME);
    }
}
