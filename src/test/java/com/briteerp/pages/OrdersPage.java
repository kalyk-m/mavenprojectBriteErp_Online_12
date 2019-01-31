package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrdersPage extends Menu{
    public OrdersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    @FindBy(id="ctl00_MainContent_fmwOrder_ddlProduct")
//    public WebElement product;
//
//    @FindBy(id="ctl00_MainContent_fmwOrder_txtQuantity")
//    public WebElement quantity;
//
//    @FindBy(id="ctl00_MainContent_fmwOrder_txtUnitPrice")
//    public WebElement  pricePerUnit;
//
//    @FindBy(id="ctl00_MainContent_fmwOrder_txtDiscount")
//    public WebElement discount;
//
//    @FindBy(id="ctl00_MainContent_fmwOrder_txtTotal")
//    public WebElement total;
//
//    @FindBy(css="[value='Calculate']")
//    public WebElement calculate;
//
//    @FindBy(id="ctl00_MainContent_fmwOrder_txtName")
//    public WebElement customerName;
//
//    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox2")
//    public WebElement street;
//
//    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox3")
//    public WebElement city;
//
//    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox4")
//    public WebElement state;
//
//    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox5")
//    public WebElement zip;
//
//    @FindBy(id="ctl00_MainContent_fmwOrder_cardList_0")
//    public WebElement visa;
//
//    @FindBy(id="ctl00_MainContent_fmwOrder_cardList_1")
//    public WebElement masterCard;
//
//    @FindBy(id="ctl00_MainContent_fmwOrder_cardList_2")
//    public WebElement americanExpress;
//
//    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox6")
//    public WebElement cardNr;
//
//    @FindBy(id="ctl00$MainContent$fmwOrder$TextBox1")
//    public WebElement expireDate;
//
//    @FindBy(id="ctl00_MainContent_fmwOrder_InsertButton")
//    public WebElement Process;
//
//    @FindBy(css="[value='Reset']")
//    public WebElement reset;
//
//    public Select productList(){
//        return new Select(product);
//    }
}
