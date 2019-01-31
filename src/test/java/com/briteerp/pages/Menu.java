package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class Menu {
    public Menu() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


}
