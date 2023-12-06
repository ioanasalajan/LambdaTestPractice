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
            driver.findElement(simpleFormDemoLink).click();     // Use the constant locator
            simpleFormPage.enterTextInTextField("Test");
            simpleFormPage.clickOnGetCheckedValueButton();
            String actualResult = driver.findElement(By.id("message")).getText();
            //String actualResult = driver.findElement(By.cssSelector("#message")).getText();
            System.out.println(actualResult);
            //sout e optional si afiseaza in chenarul cu erori de jos,
            //ce am introdus noi in field (Test),click colt stg-jos pe "enterMessageAndClickGetCheckedValue"
            Assert.assertTrue(actualResult.contains("Test"));
        }



    // Exercitii - sa le facem individual - de ex. cum testam daca introducem in field:
                             //1. caractere speciale (ex meu: @)
                             //2. cifre (ex meu: 5)
                             //3. spatii ("")
    // deci cate un @Test pt fiecare din cele 3 ex, si vom schimba doar denumirea actiunii =
    // scrisa cu albastru, respectiv vom schimba in 2 locuri ce e intre ghilimele= scris cu verde:
        @Test (priority=3)             // (priority=1) etc. merge doar daca numerotam absolut toate @Test
        public void enterSpecialCharactersAndClickGetCheckedValue() {
            driver.findElement(simpleFormDemoLink).click();
            simpleFormPage.enterTextInTextField("@");
            simpleFormPage.clickOnGetCheckedValueButton();
            String actualResult = driver.findElement(By.id("message")).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains("@"));
        }
        @Test (priority=2)
        public void enterNumbersAndClickGetCheckedValue() {
            driver.findElement(simpleFormDemoLink).click();
            simpleFormPage.enterTextInTextField("5");
            simpleFormPage.clickOnGetCheckedValueButton();
            String actualResult = driver.findElement(By.id("message")).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains("5"));
        }
        @Test (priority=4)
        public void enterSpaceAndClickGetCheckedValue() {
                driver.findElement(simpleFormDemoLink).click();
                simpleFormPage.enterTextInTextField(" ");
                simpleFormPage.clickOnGetCheckedValueButton();
                String actualResult = driver.findElement(By.id("message")).getText();
                System.out.println(actualResult);
                Assert.assertTrue(actualResult.contains(""));
        }



        //Exercitiu - tema:
        //adaugati 3 teste pentru Two Input Fields:
        @Test
        public void enterTwoInputsAndClickOnGetSum() {
            driver.findElement(simpleFormDemoLink).click();
            simpleFormPage.enterValueInFirst("11");
            simpleFormPage.enterValueInSecond("15");
            simpleFormPage.clickOnGetSumButton();
            String actualResult = driver.findElement(By.cssSelector("#addmessage")).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains("26"));
        }
        @Test
        public void enterTwoNegativeValuesAndClickOnGetSum(){
            driver.findElement(simpleFormDemoLink).click();
            simpleFormPage.enterValueInFirst("-1");
            simpleFormPage.enterValueInSecond("-10");
            simpleFormPage.clickOnGetSumButton();
            String actualResult= driver.findElement(By.cssSelector("#addmessage")).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains("-11"));
        }
        @Test
        public void enterZeroAndNegativeValueAndClickOnGetSum(){
            driver.findElement(simpleFormDemoLink).click();
            simpleFormPage.enterValueInFirst("0");
            simpleFormPage.enterValueInSecond("-100");
            simpleFormPage.clickOnGetSumButton();
            String actualResult=driver.findElement(By.cssSelector("#addmessage")).getText();
            System.out.println(actualResult);
            Assert.assertTrue(actualResult.contains("-100"));
        }
        }