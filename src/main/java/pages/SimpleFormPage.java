package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SimpleFormPage extends BasePage{
    //-------------------------------------------------------------------
    public SimpleFormPage(WebDriver driver) {
                super(driver);
        PageFactory.initElements(driver, this);
    }
    //------------------------------------------------------------------
    @FindBy(css= "input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterTextInTextField(String text){
        textField.sendKeys(text);
    }
    @FindBy(id="showInput")
    private WebElement getCheckedValueButton;
    public void clickOnGetCheckedValueButton(){
        getCheckedValueButton.click();
    }
    @FindBy (id="message")
    private WebElement checkMessage;
    public void checkYourMessage(){
        checkMessage.getText();
    }

    //Ex. Two Input Fields:

}
