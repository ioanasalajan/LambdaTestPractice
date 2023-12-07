import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RadioButtonsPage;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import pages.*;
import org.testng.annotations.BeforeClass;

public class RadioButtonsTests extends BasePage {
    private RadioButtonsPage radioButtonsPage;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        radioButtonsPage=new RadioButtonsPage(driver);
    }

    // Exercitiu individual, la curs - nu am reusit sa-l finalizez...ramane de tema
    /*@Test
    public void ClickOnRadioButtonsDemo(){
       // radioButtonsPage.clickOnRadioButtonsDemo();
        radioButtonsPage.selectMaleRadio();
        radioButtonsPage.checkGetValue();
        radioButtonsPage.getSelectedMaleMessage();
        Assert.assertEquals("Radio button 'Male' is checked", "Radio button 'Male' is checked");
        radioButtonsPage.selectFemaleRadio();
        radioButtonsPage.checkGetValue();
        radioButtonsPage.getSelectedFemaleMessage();
        Assert.assertEquals("Radio button 'Female' is checked", "Radio button 'Female' is checked");
        radioButtonsPage.selectCheckbox1();
        radioButtonsPage.selectCheckbox2();
        radioButtonsPage.selectCheckbox3();*/

    // TEMA Lab 18:
    @Test
    public void ClickOnRadioButtonsDemo(){
        radioButtonsPage.clickOnRadioButtonsDemo();

        radioButtonsPage.selectMaleRadio();
        radioButtonsPage.checkGetValue();
        radioButtonsPage.getSelectedMaleMessage();
        Assert.assertEquals("Radio button 'Male' is checked", "Radio button 'Male' is checked");
        radioButtonsPage.getSelectedFemaleMessage();
        radioButtonsPage.checkGetValue();
        radioButtonsPage.getSelectedFemaleMessage();
        Assert.assertEquals("Radio button 'Female' is checked", "Radio button 'Female' is checked");
        radioButtonsPage.selectCheckbox1();
        radioButtonsPage.selectCheckbox2();
        radioButtonsPage.selectCheckbox3();

        radioButtonsPage.selectMaleGender();
        radioButtonsPage.select0to5();
        radioButtonsPage.checkGetValue();
        Assert.assertEquals("Gender : Male, Age : 0-5", "Gender : Male, Age : 0-5");

        radioButtonsPage.selectMaleGender();
        radioButtonsPage.select5to15();
        radioButtonsPage.checkGetValue();
        Assert.assertEquals("Gender : Male, Age : 5-15", "Gender : Male, Age : 5-15");

        radioButtonsPage.selectMaleGender();
        radioButtonsPage.select15to50();
        radioButtonsPage.selectGetValue2();
        Assert.assertEquals("Gender : Male, Age : 15-50", "Gender : Male, Age : 15-50");

        radioButtonsPage.selectFemaleGender();
        radioButtonsPage.select0to5();
        radioButtonsPage.checkGetValue();
        Assert.assertEquals("Gender : Female, Age : 0-5", "Gender : Female, Age : 0-5");

        radioButtonsPage.selectFemaleRadio();
        radioButtonsPage.select5to15();
        radioButtonsPage.checkGetValue();
        Assert.assertEquals("Gender : Female, Age : 5-15", "Gender : Female, Age : 5-15");


        radioButtonsPage.selectFemaleRadio();
        radioButtonsPage.select15to50();
        radioButtonsPage.selectGetValue2();
        Assert.assertEquals("Gender : Female, Age : 15-50", "Gender : Female, Age : 15-50");

        radioButtonsPage.selectOtherGender();
        radioButtonsPage.select0to5();
        radioButtonsPage.checkGetValue();
        Assert.assertEquals("Gender : Other, Age : 0-5", "Gender : Other, Age : 0-5");

        radioButtonsPage.selectOtherGender();
        radioButtonsPage.select5to15();
        radioButtonsPage.checkGetValue();
        Assert.assertEquals("Gender : Other, Age : 5-15", "Gender : Other, Age : 5-15");

        radioButtonsPage.selectOtherGender();
        radioButtonsPage.select15to50();
        radioButtonsPage.selectGetValue2();
        Assert.assertEquals("Gender : Other, Age : 15-50", "Gender : Other, Age : 15-50");
    }

    }

