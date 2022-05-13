package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
//page-1

    public void HomePage() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement managerLogin;

    public void clickOnBankManagerLogin() {

        Reporter.log("Clicking on Manager login link"+managerLogin.toString()+"<br>");

        mouseHoverToElementAndClick(managerLogin);
    }


    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;

    public void clickOnCustomerLogin() {
        Reporter.log("Clicking on Customer login link"+customerLogin.toString()+"<br>");

       clickOnElement(customerLogin);
    }

}
