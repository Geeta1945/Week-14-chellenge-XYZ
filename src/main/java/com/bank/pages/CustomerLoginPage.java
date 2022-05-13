package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

//page-2

public class CustomerLoginPage extends Utility {

    /*
    3. customerShouldLoginAndLogoutSuceessfully.
	click on "Customer Login" Tab
	search customer that you created.
	click on "Login" Button
	verify "Logout" Tab displayed.
	click on "Logout"
	verify "Your Name" text displayed.
     */

    public void CustomerLoginPage(){

        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;
    public void clickOnLoginButton(){
        Reporter.log("Clicking on login Button"+loginButton.toString()+"<br>");
        clickOnElement(loginButton);
    }

    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement logOut;
    public String verifyLogoutText(){

       return getTextFromElement(logOut);
    }

    @FindBy(xpath = "//span[@class='fontBig ng-binding']")
    WebElement customerName;

    public String checkCustomerNameDisplayed(){
      return  getTextFromElement(customerName);
    }


}
