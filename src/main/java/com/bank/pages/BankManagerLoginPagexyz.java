package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//page-3

public class BankManagerLoginPagexyz extends Utility {

public void BankManagerLoginPagexyz(){
    PageFactory.initElements(driver, this);
}

    @FindBy(xpath = "//button[contains(text(),'Home')]")
    WebElement homeButton;

    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    WebElement addCustomer;
    public void clickOnAddCustomer(){
        mouseHoverToElementAndClick(addCustomer);
    }


    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    WebElement openAccount;

    public void clickOnOpenAccount(){

        mouseHoverToElementAndClick(openAccount);
    }

    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    WebElement customers;

    public void clickOnCustomerS(){

        mouseHoverToElementAndClick(customers);
    }

    @FindBy(id="userSelect")
    WebElement customersNameDropDown;


    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyDropDown;




}
