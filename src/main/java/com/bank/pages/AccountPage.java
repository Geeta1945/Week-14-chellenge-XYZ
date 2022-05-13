package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {
    @FindBy(xpath = "//button[@ng-class='btnClass1']")
    WebElement transactions;
    public void clickOnTransactionsButton(){
        clickOnElement(transactions);
    }


    @FindBy(xpath = "//button[@ng-class='btnClass2']")
    WebElement deposit;

    public void clickOnDepositButton(){
        clickOnElement(deposit);
    }
    @FindBy(xpath = "//button[@ng-class='btnClass3']")

    WebElement withdrawl;
    public void clickOnWithdrawlButton(){
        clickOnElement(withdrawl);

    }


    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amount;

    public void enterAmount(String myAmount){

        sendTextToElement(amount,myAmount);
    }

    @FindBy(xpath = "//button[@class='btn btn-default']")
    WebElement depositButton;

    public void afterEnteringAmountDeposit(){

        clickOnElement(depositButton);
    }

    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement depositText;

    public String getDepositSuccessfulText(){
        return getTextFromElement(depositText);
    }

    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement withdrawButton;

    public void clickOnWithdrawButton2(){
        clickOnElement(withdrawButton);
    }

    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement transactionMessage;

    public String checkTransactionMessage(){

        return  getTextFromElement(transactionMessage);
    }

}
