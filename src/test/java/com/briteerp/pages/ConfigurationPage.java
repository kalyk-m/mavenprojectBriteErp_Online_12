package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;


    public class ConfigurationPage extends Menu {
        public ConfigurationPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }
    }

