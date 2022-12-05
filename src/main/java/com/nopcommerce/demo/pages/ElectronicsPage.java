package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By mouseHoverOnElectronicsTab = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    public void mouseHoverOnElectronics(String userName) {
        mouseHoverToElement(mouseHoverOnElectronicsTab);
    }
    By mouseHoverOnCellPhonesAndClick = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    public void mouseHoverOnCellPhonesAndClick(){
        mouseHoverToElementAndClick(mouseHoverOnCellPhonesAndClick);
    }
    By verifyTextCellPhones = By.xpath("//h1[contains(text(),'Cell phones')]");
    public String verifyTextCellPhones(){
        return getTextFromElement(verifyTextCellPhones);
    }
    By mouseHoverOnElectronics = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");
    public void mouseHoverOnElectronics(){
        mouseHoverToElement(mouseHoverOnElectronics);
    }
    //Mouse Hover on “Cell phones” and click
    By mouseHoverOnCellPhones1 = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    public void mouseHoverOnCellPhones1(){
        mouseHoverToElementAndClick(mouseHoverOnCellPhones1);
    }
    By verifyTextCellphones = By.xpath("//h1[contains(text(),'Cell phones')]");
    public String verifyTextCellphones(){
        return getTextFromElement(verifyTextCellphones);
    }
    By clickOnListViewTab = By.xpath("//a[contains(text(),'List')]");
    public void clickOnListViewTab(){
        clickOnElement(clickOnListViewTab);
    }
    //Click on product name “Nokia Lumia 1020” link
    By clickOnProductNameNokia = By.xpath("//img[@alt ='Picture of Nokia Lumia 1020']");
    public void clickOnProductNameNokia(){
        clickOnElement(clickOnProductNameNokia);
    }
    //Verify the text “Nokia Lumia 1020”
    By verifyTextNokiaLumia = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    public String verifyTextNokiaLumia(){
        return getTextFromElement(verifyTextNokiaLumia);
    }
    //verify price
    By verifyNokiaPrice = By.xpath("//span[@id='price-value-20']");
    public String verifyNokiaPrice(){
        return getTextFromElement(verifyNokiaPrice);
    }
//    change quantity and add to cart
 //       driver.findElement(By.cssSelector("#product_enteredQuantity_20")).clear();
////        sendTextToElement(By.xpath("//input[@id='product_enteredQuantity_20']"), "2");
//        clickOnElement(By.cssSelector("#add-to-cart-button-20"));
    By verifyGreenBarMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    public String verifyGreenBarMessage(){
        return getTextFromElement(verifyGreenBarMessage);
    }
    By clickOnGreenBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    public void clickOnGreenBar(){
        clickOnElement(clickOnGreenBar);
    }
    By mouseHoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    public void mouseHoverOnShoppingCart (){
        mouseHoverToElementAndClick(mouseHoverOnShoppingCart);
    }
    By clickOnGoToCart = By.xpath("//button[@class='button-1 cart-button']");
    public void clickOnGoToCart(){
        clickOnElement(clickOnGoToCart);
    }
    By verifyMessageShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    public String verifyMessageShoppingCart(){
        return getTextFromElement(verifyMessageShoppingCart);
    }
    By verifyQuantity = By.xpath("//span[contains(text(),'(2)')]");
    public String verifyQuantity(){
        return getTextFromElement(verifyQuantity);
    }
    // Verify the Total $698.00
    By verifyTotal = By.xpath("//tbody/tr[1]/td[6]");
    public String verifyTotal(){
        return getTextFromElement(verifyTotal);
    }
    //click on checkbox “I agree with the terms of service”
    By clickOnCheckbox = By.xpath("//input[@id='termsofservice']");
    public void clickOnCheckbox(){
        clickOnElement(clickOnCheckbox);
    }
    //Click on “CHECKOUT”
    By clickOnCheckout = By.xpath("//button[@id='checkout']");
    public void clickOnCheckout(){
        clickOnElement(clickOnCheckout);
    }
    //  Verify the Text “Welcome, Please Sign In!”
    By verifyTextWelcomePlease = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    public String verifyTextWelcomePlease(){
        return getTextFromElement(verifyTextWelcomePlease);
    }
    //Click on “REGISTER” tab
    By clickOnRegister = By.xpath("//button[contains(text(),'Register')]");
    public void clickOnRegister(){
        clickOnElement(clickOnRegister);
    }
    //Verify the text “Register”
    By verifyTextRegister = By.xpath("//h1[contains(text(),'Register')]");
    public String verifyTextRegister(){
       return getTextFromElement(verifyTextRegister);
    }
    //Fill the mandatory fields
    By sendTextToFirstNameField = By.xpath("//input[@id='FirstName']");
    public void sendTextToFirstNameField(String firstname){
        sendTextToElement(sendTextToFirstNameField,firstname);
    }
    By sendTextToLastNameField = By.xpath("//input[@id='LastName']");
    public void sendTextToLastNameField(String lastname){
        sendTextToElement(sendTextToLastNameField,lastname);
    }
    By sendTextToDay = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]");
    public void sendTextToDay(String day){
        sendTextToElement(sendTextToDay,day);
    }
    By sendTextToMonth = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]");
    public void sendTextToMonth(String month){
        sendTextToElement(sendTextToMonth,month);
    }
    By sendTextToYear = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]");
    public void sendTextToYear(String year){
        sendTextToElement(sendTextToYear,year);
    }
    By sendTextToEmailField = By.xpath("//input[@id='Email']");
    public void sendTextToEmailField(String email){
        sendTextToElement(sendTextToEmailField,email);
    }
    By sendTextToPasswordField = By.xpath("//input[@id='Password']");
    public void sendTextToPasswordField(String password) {
        sendTextToElement(sendTextToPasswordField, password);
    }
    By sendTextToConfirmPasswordField = By.xpath("//input[@id='ConfirmPassword']");
    public void sendTextToConfirmPasswordField(String confirmPassword) {
        sendTextToElement(sendTextToPasswordField, confirmPassword);
    }
    By clickOnRegister1 = By.xpath("//button[@id='register-button']");
    public void clickOnRegister1(){
        clickOnElement(clickOnRegister1);
    }

    // Verify the message “Your registration completed”
    By verifyMessageYourRegistrationCompleted = By.xpath("//div[contains(text(),'Your registration completed')]");
    public String verifyMessageYourRegistrationCompleted(){
        return getTextFromElement(verifyMessageYourRegistrationCompleted);
    }
    //Click on “CONTINUE” tab
    By clickOnContinue = By.xpath("//a[contains(text(),'Continue')]");
    public void clickOnContinue(){
        clickOnElement(clickOnContinue);
    }
    //Verify the text “Shopping card”
    By verifyTextShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    public String verifyTextShoppingCart(){
        return getTextFromElement(verifyTextShoppingCart);
    }
    //click on checkbox “I agree with the terms of service”
    By clickOnCheckbox1 = By.xpath("//input[@id='termsofservice']");
    public void clickOnCheckbox1(){
       clickOnElement(clickOnCheckbox1);
    }
    //Click on “CHECKOUT”
    By clickOnCheckout1 = By.xpath("//button[@id='checkout']");
    public void clickOnCheckout1 (){
        clickOnElement(clickOnCheckout1);
    }

//    //Fill the Mandatory fields
////        Select select = new Select(driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")));
////        select.selectByVisibleText("United Kingdom");
    By sendTextToCity = By.xpath("//input[@id='BillingNewAddress_City']");
    public void sendTextToCity(String city){
        sendTextToElement(sendTextToCity,city);
    }
    By sendTextToAddress = By.cssSelector("#BillingNewAddress_Address1");
    public void sendTextToAddress(String address){
        sendTextToElement(sendTextToAddress,address);
    }
    By sendTextToPostelCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    public void sendTextToPostelCode(String postalCode){
        sendTextToElement(sendTextToPostelCode,postalCode);
    }
    By sendTextToPhoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    public void sendTextToPhoneNumber(String phoneNumber){
    sendTextToElement(sendTextToPhoneNumber,phoneNumber);
    }
    //Click on “CONTINUE”
    By clickOnContinue1 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
    public void clickOnContinue1(){
        clickOnElement(clickOnContinue1);
    }
    // Click on Radio Button “2nd Day Air ($0.00)”
    By clickOn2ndDayAir = By.id("shippingoption_2");
    public void clickOn2ndDayAir(){
       clickOnElement(clickOn2ndDayAir);
    }
    //Click on “CONTINUE”
    By clickOnContinue2 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    public void clickOnContinue2(){
        clickOnElement(clickOnContinue2);
    }
    //Select Radio Button “Credit Card”
    By clickOnCreditCard = By.id("paymentmethod_1");
    public void clickOnCreditCard(){
        clickOnElement(clickOnCreditCard);
    }
    //Select “Visa” From Select credit card dropdown
    By clickOnSelectCreditCard = By.xpath("//select[@id='CreditCardType']");
    public void clickOnSelectCreditCard(){
        clickOnElement(clickOnSelectCreditCard);
    }
    By clickOnVisa = By.xpath("//option[contains(text(),'Visa')]");
    public void clickOnVisa(){
        clickOnElement(clickOnVisa);
    }
//    //        Select select1 = new Select(driver.findElement(By.xpath("//select[@id='CreditCardType']")));
////        select1.selectByVisibleText("Visa");
    // Fill all the details
    By sendTextToCardholderName = By.xpath("//input[@id='CardholderName']");
    public void sendTextToCardholderName(String cardHolderName){
        sendTextToElement(sendTextToCardholderName,cardHolderName);
    }
    By sendTextToCardNumber = By.xpath("//input[@id='CardNumber']");
    public void sendTextToCardNumber(String cardNumber){
        sendTextToElement(sendTextToCardNumber,cardNumber);
    }
    By sendTextToExpirationMonth = By.xpath("//select[@id='ExpireMonth']");
    public void sendTextToExpirationMonth(String expirationMonth){
        sendTextToElement(sendTextToExpirationMonth,expirationMonth);
    }
    By sendTextToExpirationYear = By.xpath("//select[@id='ExpireYear']");
    public void sendTextToExpirationYear(String expirationYear){
        sendTextToElement(sendTextToExpirationYear,expirationYear);
    }
    By sendTextToCardCode = By.xpath("//input[@id='CardCode']");
    public void sendTextToCardCode(String cardCode){
        sendTextToElement(sendTextToCardCode,cardCode);
    }
    //Click on “CONTINUE”
    By clickOnContinue3 = By.xpath("//button[@type = 'button']");
    public void clickOnContinue3(){
       clickOnElement(clickOnContinue3);
    }
    // Verify “Payment Method” is “Credit Card”
    By verifyPaymentMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    public String verifyPaymentMethod(){
        return getTextFromElement(verifyPaymentMethod);
    }
    //Verify “Shipping Method” is “2nd Day Air”
    By verifyShopingMethod = By.xpath("//span[@class ='value']");
    public String verifyShopingMethod(){
        return getTextFromElement(verifyShopingMethod);
    }
    //Verify Total is “$698.00”
    By verifyTotalPrice = By.xpath("//strong[@xpath ='1']");
    public String verifyTotalPrice(){
        return getTextFromElement(verifyTotalPrice);
    }
    //Click on “CONFIRM”
    By clickOnConfirm = By.xpath("//button[contains(text(),'Confirm')]");
    public void clickOnConfirm (){
       clickOnElement(clickOnConfirm);
    }
    //Verify the Text “Thank You”
    By verifyTextThankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    public String verifyTextThankYou() {
        return getTextFromElement(verifyTextThankYou);
    }
    //  Verify the message “Your order has been successfully processed!”
    By verifySuccessfully = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    public String verifySuccessfully() {
        return getTextFromElement(verifySuccessfully);
    }
    //Click on “CONTINUE”
    By clickOnContinue4 = By.xpath("//button[@class='button-1 order-completed-continue-button']");
    public void clickOnContinue4(){
        clickOnElement(clickOnContinue4);
    }
    // Verify the text "Welcome to our store".
    By verifyWelcomeToOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    public String verifyWelcomeToOurStore() {
        return getTextFromElement(verifyWelcomeToOurStore);
    }
    //Click on logout link
    By clickOnLogout = By.xpath("//a[contains(text(),'Log out')]");
    public void clickOnLogout(){
        clickOnElement(clickOnLogout);
    }
//    //Verify the URL is “https://demo.nopcommerce.com/”
////        String expectedUrl = "https://demo.nopcommerce.com/";
////        String actualUrl = driver.getCurrentUrl();
////        Assert.assertEquals(expectedUrl, actualUrl);

    }