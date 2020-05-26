package br.com.sicredi.steps;

import br.com.sicredi.Utils.Customer;
import br.com.sicredi.pageobjects.BootstrapV4ThemePageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BootstrapV4ThemeSteps {

    private WebDriver driver;
    private BootstrapV4ThemePageObject bootstrapV4ThemePageObject;

    public BootstrapV4ThemeSteps(WebDriver driver, BootstrapV4ThemePageObject bootstrapV4ThemePageObject) {
        this.driver = driver;
        this.bootstrapV4ThemePageObject = bootstrapV4ThemePageObject;
    }

    public Customer createCustomer(){
        Customer customer = new Customer();
        customer.setFirstName("Teste Sicredi");
        customer.setLastName("Teste");
        customer.setContactFirstName("Daniel");
        customer.setPhone("51 9999-9999");
        customer.setAddresLine1("Av Assis Brasil, 3970");
        customer.setAddressLine2("Torre D");
        customer.setCity("Porto Alegre");
        customer.setState("RS");
        customer.setPostalCode("91000-000");
        customer.setCountry("Brasil");
        customer.setEmployeer("Fixter");
        customer.setCreditLimit("200");

        return customer;
    }

    public void fillAddCustomerForm(Customer customer){

        bootstrapV4ThemePageObject.getCustomerNameField().sendKeys(customer.getFirstName());
        bootstrapV4ThemePageObject.getCostumerLastNameField().sendKeys(customer.getLastName());
        bootstrapV4ThemePageObject.getContactFirstNameField().sendKeys(customer.getContactFirstName());
        bootstrapV4ThemePageObject.getPhoneField().sendKeys(customer.getPhone());
        bootstrapV4ThemePageObject.getAddressLine1Field().sendKeys(customer.getAddresLine1());
        bootstrapV4ThemePageObject.getAddressLine2Field().sendKeys(customer.getAddressLine2());
        bootstrapV4ThemePageObject.getCityField().sendKeys(customer.getCity());
        bootstrapV4ThemePageObject.getStateField().sendKeys(customer.getState());
        bootstrapV4ThemePageObject.getPostalCodeField().sendKeys(customer.getPostalCode());
        bootstrapV4ThemePageObject.getCountryField().sendKeys(customer.getCountry());
        bootstrapV4ThemePageObject.getEmployeerButton().click();
        bootstrapV4ThemePageObject.getEmployeerTextField().click();
        bootstrapV4ThemePageObject.getEmployeerTextField().sendKeys(customer.getEmployeer());
        bootstrapV4ThemePageObject.getEmployeerTextField().sendKeys(Keys.ENTER);
        bootstrapV4ThemePageObject.getCreditLimitField().sendKeys(customer.getCreditLimit());
        bootstrapV4ThemePageObject.getSaveButton().click();
        new WebDriverWait(driver, 15);
    }

    public String getSucceedMessage(){
        return bootstrapV4ThemePageObject.getSucceedMessage().getText();
    }

    public HomePageSteps clickAtBackToTheListButton(){
        bootstrapV4ThemePageObject.getGoBackToTheListLink().click();
        return new HomePageSteps(driver);
    }

    public void validateSucceedMessage(String message){
        Assert.assertEquals("Your data has been successfully stored into the database. Edit Customer or Go back to list", message);

    }
}


