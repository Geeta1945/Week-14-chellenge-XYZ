package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
//page-6

public class CustomersPage extends Utility {

    public void CustomersPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement selectCustomer;

    public void selectCustomerFromDropDown(String customerName){

        Reporter.log("Selecting customer from drop down"+selectCustomer.toString()+"<br>");

        selectByVisibleTextFromDropDown(selectCustomer,customerName);

    }


}
