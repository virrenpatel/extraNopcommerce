package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class New extends Utility {

    By computerMenu = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By desktopTab = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]");
    By sortByPosition = By.xpath("//select[@id='products-orderby']");
    By selectPosition = By.xpath("//option[contains(text(),'Name: A to Z')]");
    By addToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By verifyTextBuildYourOwnComputer = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By sortProcessor = By.xpath("//select[@id='product_attribute_1']");
    By selectProcessor = By.xpath("//option[@data-attr-value ='1']");
    By selectRam = By.xpath("//select[@data-attr ='2']");
    By select8Gb = By.xpath("//option[@data-attr-value ='5']");
    By selectHddRadio = By.xpath("//label[@for ='product_attribute_3_7']");
    By selectOSradio = By.xpath("//input[@id ='product_attribute_4_9']");
    By selectMicrosoftOffice = By.xpath("//input[@id ='product_attribute_5_10']");
    By selectTotalCommander = By.xpath("//input[@id ='product_attribute_5_12']");
    By verifyPrice = By.xpath("//span[@id ='price-value-1']");
    By clickOnAddToCart = By.xpath("//button[@id ='add-to-cart-button-1']");
    By verifyTheMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    By verifyShoppingCartMessage = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By mouseHoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By clickOnGoToCart = By.xpath("//button[@class='button-1 cart-button']");
    By verifyMessageShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By clearText = By.xpath("//input[@value='1']");
    By sendTextToQuantity = By.xpath("//input[@value='1']");
    By clickOnUpdateShoppingCart = By.xpath("//button[@id='updatecart']");
    By verifyTotal = By.xpath("//tbody/tr[1]/td[6]/span[1]");
    By clickOnCheckbox = By.xpath("//input[@id='termsofservice']");
    By clickOnCheckout = By.xpath("//button[@id='checkout']");
    By VerifyTextWelcome,PleaseSignIn = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By clickOnCheckoutAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
    By sendTextToFirstName = By.id("BillingNewAddress_FirstName");
    By sendTextToLastName = By.id("BillingNewAddress_LastName");
    By sendTextToEmail = By.id("BillingNewAddress_Email");
//    Select country = new Select(driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']")));
//        country.selectByVisibleText("United Kingdom");
    By sendTextToCity = By.xpath("//input[@id='BillingNewAddress_City']");
    By sendTextToAddress1 = (By.cssSelector("#BillingNewAddress_Address1"));
    By sendTextToPostalCode = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By sendTextToPhoneNumber = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By clickOnContinue = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");
    By clickOnNextDayAir = By.xpath("//input[@id='shippingoption_1']");
    By clickOnContinueTab = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");
    By clickOnCreditCard = By.xpath("//input[@id='paymentmethod_1']");
    By clickOnMasterCard = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
//    Select card = new Select(driver.findElement(By.xpath("//select[@id='CreditCardType']")));
//        card.selectByVisibleText("Master card");
    By sendTextToCardholderName = By.xpath("//input[@id='CardholderName']");
    By sendTextToCardNumber = By.xpath("//input[@id='CardNumber']");
//    Select month = new Select(driver.findElement(By.xpath("//select[@id='ExpireMonth']")));
//        month.selectByVisibleText("10");
//    Select year = new Select(driver.findElement(By.xpath("//select[@id='ExpireYear']")));
//        year.selectByVisibleText("2025");
    By sendTextToCardCode = By.xpath("//input[@id='CardCode']");
    //Click on “CONTINUE”
    By clickOnContinue1 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");
    By verifyPaymentMethod = By.xpath("//span[contains(text(),'Credit Card')]");
    By verifyNextDayAir = By.xpath("//span[@class ='value']");
    By verifyTotalAmount = By.xpath("//strong[@xpath ='1']");
    By clickOnConfirm = By.xpath("//button[contains(text(),'Confirm')]");
    By verifyThankYou = By.xpath("//h1[contains(text(),'Thank you')]");
    By verifyYourOrderMessage = By.xpath("//strong[@xpath ='1']");
    By clickOnContinueButton = By.xpath("//button[contains(text(),'Continue')]");
    // Verify the text “Welcome to our store”
    By verifyTextWelcomeToOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");
}
