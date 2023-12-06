package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SimpleFormPage extends BasePage{
    //===============================================
    public SimpleFormPage(WebDriver driver) {
                super(driver);
        PageFactory.initElements(driver, this);
    }
    //===============================================
    @FindBy (css= "input[placeholder='Please enter your Message']")
    private WebElement textField;
    public void enterTextInTextField(String text){
        textField.sendKeys(text);
    }
    @FindBy (id="showInput")
    private WebElement getCheckedValueButton;
    public void clickOnGetCheckedValueButton(){
        getCheckedValueButton.click();
    }
    @FindBy (id="message")
    private WebElement checkMessage;
    public void checkYourMessage(){
        checkMessage.getText();
    }




    //Exercitiu - tema:
    //adaugati 3 teste pentru Two Input Fields:  (Deci sunt 4 locatori => 4 @FindBy + actiunea la fiecare)
    @FindBy (id="sum1")
    private WebElement twoInputFieldsEnterFirst;
    public void enterValueInFirst(String valueA) {twoInputFieldsEnterFirst.sendKeys(valueA);   }
    // or: enterValueInA   enterValueInB   etc. but not:  Value1, Value2...
    @FindBy (id= "sum2")
    private WebElement twoInputFieldsEnterSecond;
    public void enterValueInSecond(String valueB) {twoInputFieldsEnterSecond.sendKeys(valueB);}
    @FindBy (css= "#gettotal > button")
    private WebElement getSumButton;
    public void clickOnGetSumButton() {getSumButton.click();    }
    //Or:
    //@FindBy (xpath = "//*[@id='gettotal']/button")
    //private WebElement getSumButtonAnotherPossibility;
    //public void clickOnGetSumButtonAnotherPossibility() {getSumButtonAnotherPossibility.click();}
    @FindBy (id="addmessage")
    private WebElement checkSum;
    public void checkResult(){
        checkSum.getText();
    }
}