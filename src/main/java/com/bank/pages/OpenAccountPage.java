package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//page-5

public class OpenAccountPage extends Utility {

    public void OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customers;
    public void selectCustomer(String customer1){
        selectByVisibleTextFromDropDown(customers,customer1);
    }


    @FindBy(id="currency")
    WebElement currencyDropDown;
    public void selectFromCurrencyDropDown(String currency){
        selectByVisibleTextFromDropDown(currencyDropDown,currency);
    }



    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement processButton;

    public void clickOnProcess(){
        clickOnElement(processButton);
    }

}
