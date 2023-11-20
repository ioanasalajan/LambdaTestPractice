import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SimpleFormPage;
    public class SimpleFormTests extends BasePage {

        private SimpleFormPage simpleFormPage;
        private final By simpleFormDemoLink = By.linkText("Simple Form Demo"); // Define the constant locator

        @BeforeMethod
        public void setUp() {
            super.setUp();
            simpleFormPage = new SimpleFormPage(driver);
        }

        @Test (priority = 1)
        public void enterMessageAndClickGetCheckedValue() {
            driver.findElement(simpleFormDemoLink).click(); // Use the constant locator
            simpleFormPage.enterTextInTextField("Test");
            simpleFormPage.clickOnGetCheckedValueButton();

            String actualResult = driver.findElement(By.id("message")).getText();
            System.out.println(actualResult);  //sout este optional,doar asa poti da click in stg-jos
            //pe enterMessage... si atunci afiseaza textul introdus in field (ex. Test)
            Assert.assertTrue(actualResult.contains("Test"));
        }

//Exercitii (individual):
        //1. caractere speciale
        //2. cifre
        //3. spatii
        @Test (priority=3)  // (priority=1) etc.  merge doar daca numerotam absolut toate @Test !
        public void enterMessageAndClickGetCheckedValue1() {
            driver.findElement(simpleFormDemoLink).click();
            simpleFormPage.enterTextInTextField("@");
            simpleFormPage.clickOnGetCheckedValueButton();
            String actualResult = driver.findElement(By.id("message")).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains("@"));
        }
        @Test (priority=2)
        public void enterMessageAndClickGetCheckedValue2() {
            driver.findElement(simpleFormDemoLink).click();
            simpleFormPage.enterTextInTextField("5");
            simpleFormPage.clickOnGetCheckedValueButton();
            String actualResult = driver.findElement(By.id("message")).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains("5"));
        }
        @Test (priority=4)
        public void enterMessageAndClickGetCheckedValue3() {
                driver.findElement(simpleFormDemoLink).click();
                simpleFormPage.enterTextInTextField(" ");
                simpleFormPage.clickOnGetCheckedValueButton();
                String actualResult = driver.findElement(By.id("message")).getText();
                System.out.println(actualResult);
                Assert.assertTrue(actualResult.contains(""));
        }
            //Exercitiu:
        //adaugati 3 teste pentru Two Input Fields

        }
