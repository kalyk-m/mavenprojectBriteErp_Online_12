package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class InvoicingPage extends Menu {
    public InvoicingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
