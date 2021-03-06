package com.briteerp.tests.smoke_tests.login;

import com.briteerp.utilities.ApplicationConstants;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.TestBase;
import org.testng.annotations.Test;

import static com.briteerp.utilities.ApplicationConstants.*;
import static org.testng.Assert.assertEquals;

public class NegativeSalesManagerLoginTests extends TestBase {


    @Test()
    public void wrongEmailTest(){
        extentLogger = report.createTest("Wrong email test for Sales Manager level");

        extentLogger.info("Verifying to open main page");
        // pages.login().signIn();
        extentLogger.info("Verifying to open BriteErpDemo");
        pages.login().selectBriteErpDemo();

        extentLogger.info("Verifying to login Manager account");
        pages.login().login(ConfigurationReader.getProperty("salesManagerWrongEmail"),
                ConfigurationReader.getProperty("salesManagerPassword"));
        //Thread.sleep(5000);
        String actualError = pages.login().errorMessage.getText();

        extentLogger.info("Verifying error message");
        assertEquals(actualError, LOGIN_ERROR_MESSAGE);
        extentLogger .pass("Passed:Wrong email test");
    }

    @Test()
    public void wrongPasswordTest(){
        extentLogger = report.createTest("Wrong password test for Sales Manager level");

        extentLogger.info("Verifying to open main page");

        extentLogger.info("Verifying to open BriteErpDemo");
        pages.login().selectBriteErpDemo();

        extentLogger.info("Verifying to login Manager account");
        pages.login().login(ConfigurationReader.getProperty("salesManagerEmail"),
                ConfigurationReader.getProperty("salesManagerWrongPassword"));

        String actualError = pages.login().errorMessage.getText();

        extentLogger.info("Verifying error message");
        assertEquals(actualError, LOGIN_ERROR_MESSAGE);
        extentLogger .pass("Passed:Wrong password test");
    }

    @Test()
    public void blankEmailTest() {
        extentLogger = report.createTest("Blank email test for Sales Manager level");

        extentLogger.info("Verifying to open main page");

        extentLogger.info("Verifying to open BriteErpDemo");
        pages.login().selectBriteErpDemo();

        extentLogger.info("Verifying to login Manager account");
        pages.login().login(ConfigurationReader.getProperty("salesManagerBlankEmail"),
                ConfigurationReader.getProperty("salesManagerPassword"));

        String actualError = pages.login().email.getText();

        extentLogger.info("Verifying error message");
        assertEquals(actualError, LOGIN_EMPTY_EMAIL);
        extentLogger .pass("Passed:Blank email test");
    }

    @Test()
    public void blankPasswordTest(){
        extentLogger = report.createTest("Blank password test for Sales Manager level");

        extentLogger.info("Verifying to open main page");

        extentLogger.info("Verifying to open BriteErpDemo");
        pages.login().selectBriteErpDemo();

        extentLogger.info("Verifying to login Manager account");
        pages.login().login(ConfigurationReader.getProperty("salesManagerEmail"),
                ConfigurationReader.getProperty("salesManagerBlankPassword"));

        String actualError = pages.login().password.getText();

        extentLogger.info("Verifying error message");
        assertEquals(actualError, LOGIN_EMPTY_PASSWORD);
        extentLogger .pass("Passed:Blank password test");
    }

}
