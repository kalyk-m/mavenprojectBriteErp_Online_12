package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ReportingPage {
    public ReportingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
