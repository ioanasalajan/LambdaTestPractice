import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RadioButtonsPage;
public class RadioButtonsTests extends BasePage {
    private RadioButtonsPage radioButtonsPage;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        radioButtonsPage=new RadioButtonsPage(driver);
    }
    @Test
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
/*
        radioButtonsPage.selectCheckbox1();
        radioButtonsPage.selectCheckbox2();
        radioButtonsPage.selectCheckbox3();*/
    }
}
