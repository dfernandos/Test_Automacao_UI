package br.com.sicredi.steps;

import br.com.sicredi.pageobjects.HomePageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class HomePageSteps {

    private WebDriver driver;
    private HomePageObject homePageObject;

    public HomePageSteps(WebDriver driver) {
        this.driver = driver;
        homePageObject = new HomePageObject(driver);
    }

    public void selectBootstrapV4Theme(){
        homePageObject.getSelectedItem().click();
    }

    public BootstrapV4ThemeSteps clickAtAddCustomer(){
        return new BootstrapV4ThemeSteps(driver, homePageObject.getButtonAddCostumer()) ;
    }

    public void findCustomer(String customerName){
        homePageObject.getInputCustomerName().sendKeys(customerName);
    }

    public void clickAtMoreButton(){
        homePageObject.getMoreButton().click();
    }

    public void clickAtDeleteLink(){
        homePageObject.getDeleteLink().click();
    }

    public void clickAtModalDeleteButton(){
        homePageObject.getDeleteButton().click();
    }

    public String getDeletedMessageText(){
        return homePageObject.getDeletedMessage().getText();
    }

    public void validateDeletedMessage(String deletedMessageText){
        Assert.assertEquals(deletedMessageText, "Your data has been successfully deleted from the database.");

    }
}
