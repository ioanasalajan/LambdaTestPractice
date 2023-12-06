package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RadioButtonsPage extends BasePage{
    //=======================
    public RadioButtonsPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    //===============================================================
    //example:
    @FindBy(xpath = "/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[1]")
    private WebElement maleRadio;
    public void selectMaleRadio() {
        maleRadio.click();
    }
    //

@FindBy (xpath= "/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/label[2]")
private WebElement femaleRadio;
public void selectFemaleRadio() {
    femaleRadio.click();

}
/*
@FindBy (xpath = )
private WebElement radioButtonDemo;
    public void clickOnRadioButtonsDemo() {
        radioButtonDemo.click();
    }*/
@FindBy (xpath= "/html/body/div[1]/div/section[1]/div/div/h1")
private WebElement getValue;
        public void checkGetValue() {
            getValue.click();

    }
@FindBy (xpath=  "/html/body/div[1]/div/section[2]/div/div/div/div[1]/div/p[2]")
private WebElement selectedMaleMessage;
    public void getSelectedMaleMessage() {
        selectedMaleMessage.click();
    }
@FindBy (xpath= " /html/body/div[1]/div/section[2]/div/div/div/div[1]/div/p[2]")
private WebElement selectedFemaleMessage;
    public void getSelectedFemaleMessage() {
        selectedFemaleMessage.click();
    }
/*
    public void selectCheckbox1() {
    }
    public void selectCheckbox2() {
    }
    public void selectCheckbox3() {
    }

     /* @FindBy (linkText="Radio Buttons Demo")
    private WebElement radioButtonsDemoLink;
    @FindBy(xpath="html/body/div[1]/div/div/div/div[1]/div/label")*/
}
