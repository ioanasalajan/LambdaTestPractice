import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.InputFormDemoPage;
import org.testng.Assert;
import io.qameta.allure.Description;
public class InputFormDemoTests extends BasePage {
    private InputFormDemoPage inputFormDemoPage;
    private final By InputFormDemoLink = By.linkText("Input Form Submit");
    @BeforeMethod
    public void setUp() {
        super.setUp();
        inputFormDemoPage = new InputFormDemoPage(driver);
    }
    @Description ("Fill all the fields with valid data and click on the submit button")
    @Test
    public void FirstTestOfThePageInputFormDemoSubmit() {   //this is a happy case
        driver.findElement(InputFormDemoLink).click();
        inputFormDemoPage.enterTextInTextFieldName("Alex");
        inputFormDemoPage.enterTextInTextFieldEmail("alex@gmail.com");
        inputFormDemoPage.enterTextInTextFieldPassword("Alexander1234");
        inputFormDemoPage.enterTextInTextFieldCompany("AlexCompany");
        inputFormDemoPage.enterTextInTextFieldWebsite("www.alex.com");
        //inputFormDemoPage.selectTextInTextFieldCountry("Romania");    //why doesn't work?
        Select country = new Select(driver.findElement(By.name("country")));
        country.selectByVisibleText("Romania");
        inputFormDemoPage.enterTextInTextFieldCity("Satu Mare");
        inputFormDemoPage.enterTextInTextFieldAddress1("Address 1");
        inputFormDemoPage.enterTextInTextFieldAddress2("Address 2");
        inputFormDemoPage.enterTextInTextFieldState("RO");
        inputFormDemoPage.enterTextInTextFieldZip("440007");
        inputFormDemoPage.clickOnSubmit();
        String actualResultForButton = driver.findElement(By.cssSelector(".mt-20 > button[type=submit]")).getAttribute("innerText");
        System.out.println(actualResultForButton);
        Assert.assertEquals(actualResultForButton, "Submit");
        String actualResultForSuccessfulFormValidation = driver.findElement(By.cssSelector(".mt-20 > .success-msg")).getText();
        System.out.println(actualResultForSuccessfulFormValidation);
        Assert.assertEquals(actualResultForSuccessfulFormValidation, "Thanks for contacting us, we will get back to you shortly.");
            }
    @Description("Fill with an invalid email and the other fields with valid data, and click the submit button")
    // negative case
            @Test
        public void SecondTestOfThePageInputFormDemoSubmit() {
            driver.findElement(InputFormDemoLink).click();
            inputFormDemoPage.enterTextInTextFieldName("Alex");
            inputFormDemoPage.enterTextInTextFieldEmail("alex.com");
            inputFormDemoPage.enterTextInTextFieldPassword("Alexander1234");
            inputFormDemoPage.enterTextInTextFieldCompany("AlexCompany");
            inputFormDemoPage.enterTextInTextFieldWebsite("www.alex.com");
            Select countryname = new Select(driver.findElement(By.name("country")));
            countryname.selectByVisibleText("Romania");
            inputFormDemoPage.enterTextInTextFieldCity("Satu Mare");
            inputFormDemoPage.enterTextInTextFieldAddress1("Address 1");
            inputFormDemoPage.enterTextInTextFieldAddress2("Address 2");
            inputFormDemoPage.enterTextInTextFieldState("RO");
            inputFormDemoPage.enterTextInTextFieldZip("");
            inputFormDemoPage.clickOnSubmit();
            String actualResult = driver.findElement(By.cssSelector(".mt-20 > button[type=submit]")).getAttribute("innerText");
            System.out.println(actualResult);
            Assert.assertFalse(actualResult.contains("Thanks for contacting us, we will get back to you shortly."));
        }
    }

