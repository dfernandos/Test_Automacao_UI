package br.com.sicredi.testcase;

import br.com.sicredi.Utils.Customer;
import br.com.sicredi.steps.BootstrapV4ThemeSteps;
import br.com.sicredi.steps.HomePageSteps;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomerTest {

    static WebDriver driver;
    static BootstrapV4ThemeSteps bootstrapV4ThemeSteps;
    static Customer customer = new Customer();

    @BeforeClass
    public static void beforeClass() {
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
    }

    @Before
    public void setup() {
        driver.get("https://www.grocerycrud.com/demo/bootstrap_theme");
        new WebDriverWait(driver, 15);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void addCustomerTest() {

        HomePageSteps homePageSteps = new HomePageSteps(driver);

        homePageSteps.selectBootstrapV4Theme();

        bootstrapV4ThemeSteps = homePageSteps.clickAtAddCustomer();

        customer = bootstrapV4ThemeSteps.createCustomer();

        bootstrapV4ThemeSteps.fillAddCustomerForm(customer);

        String message = bootstrapV4ThemeSteps.getSucceedMessage();

        bootstrapV4ThemeSteps.validateSucceedMessage(message);

        homePageSteps = bootstrapV4ThemeSteps.clickAtBackToTheListButton();

        homePageSteps.findCustomer(customer.getFirstName());

        homePageSteps.clickAtMoreButton();

        homePageSteps.clickAtDeleteLink();

        homePageSteps.clickAtModalDeleteButton();

        String deletedMessageText = homePageSteps.getDeletedMessageText();

        homePageSteps.validateDeletedMessage(deletedMessageText);

    }

}
