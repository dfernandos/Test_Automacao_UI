package br.com.sicredi.pageobjects;

import br.com.sicredi.Utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BootstrapV4ThemePageObject {

    private WebDriver driver;

    public BootstrapV4ThemePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getCustomerNameField(){
        WaitElement.visibilityOfElementLocated(driver, By.id("field-customerName"));
        return driver.findElement(By.id("field-customerName"));
    }

    public WebElement getCostumerLastNameField(){
        WaitElement.visibilityOfElementLocated(driver, By.id("field-contactLastName"));
        return driver.findElement(By.id("field-contactLastName"));
    }

    public WebElement getContactFirstNameField(){
        WaitElement.visibilityOfElementLocated(driver, By.id("field-contactFirstName"));
        return driver.findElement(By.id("field-contactFirstName"));
    }

    public WebElement getPhoneField(){
        WaitElement.visibilityOfElementLocated(driver, By.id("field-phone"));
        return driver.findElement(By.id("field-phone"));
    }

    public WebElement getAddressLine1Field(){
        WaitElement.visibilityOfElementLocated(driver, By.id("field-addressLine1"));
        return driver.findElement(By.id("field-addressLine1"));
    }

    public WebElement getAddressLine2Field(){
        WaitElement.visibilityOfElementLocated(driver, By.id("field-addressLine2"));
        return driver.findElement(By.id("field-addressLine2"));
    }

    public WebElement getCityField(){
        WaitElement.visibilityOfElementLocated(driver, By.id("field-city"));
        return driver.findElement(By.id("field-city"));
    }

    public WebElement getStateField(){
        WaitElement.visibilityOfElementLocated(driver, By.id("field-state"));
        return driver.findElement(By.id("field-state"));
    }

    public WebElement getPostalCodeField(){
        WaitElement.visibilityOfElementLocated(driver, By.id("field-postalCode"));
        return driver.findElement(By.id("field-postalCode"));
    }

    public WebElement getCountryField(){
        WaitElement.visibilityOfElementLocated(driver, By.id("field-country"));
        return driver.findElement(By.id("field-country")); }

    public WebElement getEmployeerButton() {
        WaitElement.visibilityOfElementLocated(driver, By.xpath("//span[text()='Select from Employeer']"));
        return driver.findElement(By.xpath("//span[text()='Select from Employeer']"));
    }
    public WebElement getEmployeerTextField() {
        WaitElement.visibilityOfElementLocated(driver, By.xpath("//input[@autocomplete='off']"));
        return driver.findElement(By.xpath("//input[@autocomplete='off']")); }

    public WebElement getCreditLimitField() {
        WaitElement.visibilityOfElementLocated(driver, By.id("field-creditLimit"));
        return driver.findElement(By.id("field-creditLimit"));
    }

    public WebElement getSaveButton() {
        WaitElement.visibilityOfElementLocated(driver, By.id("form-button-save"));
        return driver.findElement(By.id("form-button-save"));
    }

    public WebElement getSucceedMessage() {
        WaitElement.visibilityOfElementLocated(driver,By.xpath("//div[@id='report-success']/p"));
        return driver.findElement(By.xpath("//*[@id='report-success']/p"));
    }

    public WebElement getGoBackToTheListLink() {
        WaitElement.elementToBeClickable(driver, By.xpath("//a[@href='/demo/bootstrap_theme_v4/']"));
        return driver.findElement(By.xpath("//a[@href='/demo/bootstrap_theme_v4/']"));
    }
}