package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
//page-4

public class AddCustomerPage extends Utility {
    public void AddCustomerPage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@placeholder='First Name']")
    WebElement firstName;

    public void enterFirstName(String myFirstName){
        sendTextToElement(firstName,myFirstName);
    }

    @FindBy(xpath="//input[@placeholder='Last Name']")
    WebElement lastName;

    public void enterLastName(String myLastName){
        sendTextToElement(firstName,myLastName);
    }
    //
    @FindBy(xpath="//input[@placeholder='Post Code']")
    WebElement postCode;
    public void enterPostCode(String myPostCode){
        sendTextToElement(postCode,myPostCode);
    }



    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomer;

    public void clickOnAddCustomer(){

        clickOnElement(addCustomer);
    }



    public void verifyPopUpMessage() {
        String actual = getTextFromAlert();
        String expected = "Customer added successfully with customer id :6";
        Assert.assertEquals(expected, actual);
        Reporter.log("Verifying customer added successfully message:" + actual);
    }
    public void clickOnPopUpOkButton() {
        Reporter.log("Accepting popup message"+"\n</br>");
        acceptAlert();
    }










}
