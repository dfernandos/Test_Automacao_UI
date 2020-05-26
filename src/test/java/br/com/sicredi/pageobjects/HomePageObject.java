package br.com.sicredi.pageobjects;

import br.com.sicredi.Utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {

    private WebDriver driver;

    public HomePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSelectComboBox(){
        return driver.findElement(By.id("switch-version-select"));
    }

    public WebElement getSelectedItem(){
        return driver.findElement(By.xpath("//option[@value='bootstrap_theme_v4']"));
    }

    public WebElement getButtonClassName(){
        return driver.findElement(By.className("floatL t5"));
    }

    public BootstrapV4ThemePageObject getButtonAddCostumer(){
            driver.findElement(By.xpath("//a[@href='/demo/bootstrap_theme_v4/add']")).click();
        return new BootstrapV4ThemePageObject(driver);
    }

    public WebElement getInputCustomerName(){
        return driver.findElement(By.xpath("//input[@name=('customerName')]"));
    }

    public WebElement getMoreButton(){
        WaitElement.elementToBeClickable(driver, By.className("btn-group"));
        return driver.findElement(By.className("btn-group"));
    }

    public WebElement getDeleteLink(){
        return driver.findElement(By.xpath("//*[@id='gcrud-search-form']/div[2]/table/tbody/tr/td[2]/div[1]/div/div/a[3]/i"));
    }

    public WebElement getDeleteButton(){
        return driver.findElement(By.xpath("//button[text()='Delete']"));
    }

    public WebElement getDeletedMessage(){
        WaitElement.visibilityOfElementLocated(driver, By.xpath("//p[text()='Your data has been successfully deleted from the database.']"));
        return driver.findElement(By.xpath("//p[text()='Your data has been successfully deleted from the database.']"));
    }
}
