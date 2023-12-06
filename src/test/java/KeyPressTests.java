import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.KeyPressPage;
public class KeyPressTests extends BasePage {
    private KeyPressPage keyPressPage;
    private static final By KEY_PRESS_LINK_TEXT = By.linkText("Key Press"); // Define the constant locator
    @BeforeMethod
    public void setUp() {
        super.setUp();
        keyPressPage = new KeyPressPage(driver);
    }
    @Description("Write a letter and check the result")
    @Test
    public void writeALetterAndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInTheTextField("T");
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: T");
    }


        //exercitiu - individual:
    @Description ("Press a number and check the result")
    @Test
    public void pressANumberAndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInTheTextField("8");
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertTrue(actualResult.contains("8"));
    }


    //tema Lab 17: adaugam teste (1 la alegere):
    // !!!incepand cu aceasta tema, sa nu mai ADD zip file cu File>Export Project to Zip,
    // ci cu Git, Commit, Push...si apoi din GITHUB, de pe Code=verde, copy linkul (intr-un txt) si-l vede Florin:

    @Description ("Press 'Ctrl' and check the result")
    @Test
    public void pressCtrlAndCheckTheResult(){
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInCtrlKey();
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: CONTROL");
    }
    @Description ("Press ALT key and check the result")
    @Test
    public void typeAltAndCheckTheResult() {
        driver.findElement(KEY_PRESS_LINK_TEXT).click();
        keyPressPage.typeInAltKey();
        String actualResult = driver.findElement(By.id("result")).getText();
        System.out.println(actualResult);
        Assert.assertEquals(actualResult, "You entered: ALT");
    }
}
