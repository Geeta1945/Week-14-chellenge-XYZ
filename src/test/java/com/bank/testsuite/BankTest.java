package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.junit.experimental.theories.Theories;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
/*
1.bankManagerShouldAddCustomerSuccessfully.
    click On "Bank Manager Login" Tab
	click On "Add Customer" Tab
	enter FirstName
	enter LastName
	enter PostCode
	click On "Add Customer" Button
	popup display
	verify message "Customer added successfully"
	click on "ok" button on popup.
 */

    HomePage homePage;
    AddCustomerPage addCustomerPage;
    BankManagerLoginPagexyz bankManagerLoginPagexyz;
    OpenAccountPage openAccountPage;
    CustomerLoginPage customerLoginPage;
    CustomersPage customersPage;
    AccountPage accountPage;

    @BeforeMethod(groups = {"sanity","smoke","regression"})

    public void inIt() {

        homePage = new HomePage();
        addCustomerPage = new AddCustomerPage();
        bankManagerLoginPagexyz = new BankManagerLoginPagexyz();
        openAccountPage = new OpenAccountPage();
        customerLoginPage = new CustomerLoginPage();
        customersPage = new CustomersPage();
        accountPage = new AccountPage();
    }

//Test 1
    @Test(groups = {"smoke","regression"})
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        //1.click On "Bank Manager Login" Tab
        Thread.sleep(2000);
        homePage.clickOnBankManagerLogin();

        //2.click On "Add Customer" Tab
        bankManagerLoginPagexyz.clickOnAddCustomer();
        Thread.sleep(1000);
        addCustomerPage.enterFirstName("Harry");
        addCustomerPage.enterLastName("Potter");
        addCustomerPage.enterPostCode("ha5 4ag");
        addCustomerPage.clickOnAddCustomer();
        addCustomerPage.verifyPopUpMessage();


        addCustomerPage.clickOnPopUpOkButton();


    }
//Test 2
    @Test(groups = {"smoke","regression"})
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        //1.click On "Bank Manager Login" Tab
        Thread.sleep(2000);
        homePage.clickOnBankManagerLogin();
        bankManagerLoginPagexyz.clickOnOpenAccount();
        openAccountPage.selectCustomer("Albus Dumbledore");
        Thread.sleep(2000);
        openAccountPage.selectFromCurrencyDropDown("Rupee");
        openAccountPage.clickOnProcess();



    }

    //Test 3
    /*
    3. customerShouldLoginAndLogoutSuceessfully.
	click on "Customer Login" Tab
	search customer that you created.
	click on "Login" Button
	verify "Logout" Tab displayed.
	click on "Logout"
	verify "Your Name" text displayed.
     */
    @Test(groups = {"sanity","regression"})

    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        Thread.sleep(2000);

        homePage.clickOnCustomerLogin();
        Thread.sleep(1000);
        customersPage.selectCustomerFromDropDown("Harry Potter");
        customerLoginPage.clickOnLoginButton();
        Thread.sleep(1000);
        String actualMessage = customerLoginPage.verifyLogoutText();
        String expectedMessage ="Logout";
        Assert.assertEquals(actualMessage,expectedMessage,"Logout text can't found");
        Thread.sleep(1000);
        String currentUserName =customerLoginPage.checkCustomerNameDisplayed();
        Assert.assertEquals(currentUserName,"Harry Potter","You are not your login page.");

    }
    /*
    4. customerShouldDepositMoneySuccessfully.
	click on "Customer Login" Tab
	search customer that you created.
	click on "Login" Button
	click on "Deposit" Tab
	Enter amount 100
	click on "Deposit" Button
	verify message "Deposit Successful"
     */

    @ Test(groups = {"sanity","regression"})
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        Thread.sleep(2000);
        homePage.clickOnCustomerLogin();
        Thread.sleep(1000);
        customersPage.selectCustomerFromDropDown("Harry Potter");
        customerLoginPage.clickOnLoginButton();
        Thread.sleep(1000);
       accountPage.clickOnDepositButton();
       accountPage.enterAmount("100");
       accountPage.afterEnteringAmountDeposit();
        Thread.sleep(1000);

        String actualText = accountPage.getDepositSuccessfulText();
        Assert.assertEquals(actualText,"Deposit Successful","Cannot deposit amount");
    }
    /*
    5. customerShouldWithdrawMoneySuccessfully
	click on "Customer Login" Tab
	search customer that you created.
	click on "Login" Button
	click on "Withdrawl" Tab
	Enter amount 50
	click on "Withdraw" Button
	verify message "Transaction Successful"

     */

    @Test(groups = {"sanity","regression"})
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {

        Thread.sleep(2000);
        homePage.clickOnCustomerLogin();
        Thread.sleep(1000);
        customersPage.selectCustomerFromDropDown("Hermoine Granger");
        customerLoginPage.clickOnLoginButton();
        Thread.sleep(1000);
        accountPage.clickOnWithdrawlButton();
        accountPage.enterAmount("50");
        accountPage.clickOnWithdrawButton2();
        String actualTransactionText= accountPage.checkTransactionMessage();
        Assert.assertEquals(actualTransactionText,"Transaction successful","Can't withdraw amount entered");



    }


}
