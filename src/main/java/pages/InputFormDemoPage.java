package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class InputFormDemoPage extends BasePage {
    public InputFormDemoPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
/*  @FindBy (id="name")
    private WebElement inputFormEnterA;
    public void enterValueInA(String valueA){inputFormEnterA.sendKeys(valueA);}
    @FindBy (css="input[placeholder='Email']")
    private WebElement inputFormEnterB;
    public void enterValueInB(String valueB){inputFormEnterB.sendKeys(valueB);}
    @FindBy (css="input[placeholder=\"Password\"]")
    private WebElement inputFormEnterC;
    public void enterValueInC (String valueC){inputFormEnterC.sendKeys(valueC);}
    @FindBy (css="input[placeholder='Company']")
    private WebElement inputFormEnterD;
    public void enterValueInD (String valueD){inputFormEnterD.sendKeys(valueD);}
    @FindBy (id="website name")
    private WebElement inputFormEnterE;
    public void enterValueInE (String valueE){inputFormEnterE.sendKeys(valueE);}
    @FindBy (xpath="/html/body/div[1]/div/section[2]/div/div/div/div/form/div[3]/div[1]/select") //?country locator
    private WebElement inputFormEnterF;
    public void enterValueInF (String valueF){inputFormEnterF.sendKeys(valueF);}
    @FindBy (id="inputCity")
    private WebElement inputFormEnterG;
    public void enterValueInG (String valueG){inputFormEnterG.sendKeys(valueG);}
    @FindBy (id="inputAddress1")
    private WebElement inputFormEnterH;
    public void enterValueInH (String valueH){inputFormEnterH.sendKeys(valueH);}
    @FindBy (id="inputAddress2")
    private WebElement inputFormEnterI;
    public void enterValueInI (String valueI){inputFormEnterI.sendKeys(valueI);}
    @FindBy (id="inputState")
    private WebElement inputFormEnterJ;
    public void enterValueInJ (String valueJ){inputFormEnterJ.sendKeys(valueJ);}
    @FindBy ( id="inputZip")
    private WebElement inputFormEnterK;
    public void enterValueInK (String valueK) {inputFormEnterK.sendKeys(valueK);}
    @FindBy (    )   // ?submit button locator
    private WebElement SubmitButton;
    public void clickOnSubmitButton (){SubmitButton.click();}
} */

    @FindBy(id = "name")
    private WebElement nameField;
    public void enterTextInTextFieldName(String name) {
        nameField.sendKeys(name);
    }
    @FindBy(id = "inputEmail4")
    private WebElement emailField;
    public void enterTextInTextFieldEmail(String email) {
        emailField.sendKeys(email);
    }
    @FindBy(id = "inputPassword4")
    private WebElement passwordField;
    public void enterTextInTextFieldPassword(String pass) {
        passwordField.sendKeys(pass);
    }
    @FindBy(id = "company")
    private WebElement companyField;
    public void enterTextInTextFieldCompany(String comp) {
        companyField.sendKeys(comp);
    }
    @FindBy(id = "websitename")
    private WebElement websiteField;
    public void enterTextInTextFieldWebsite(String web) {
        websiteField.sendKeys(web);
    }
    @FindBy(css = "option[value=RO]")
    private WebElement countryDropdownField;
    public void selectTextInTextFieldCountry(String country) {
        countryDropdownField.sendKeys(country);
    }
    @FindBy(id = "inputCity")
    private WebElement cityField;
    public void enterTextInTextFieldCity(String city) {
        cityField.sendKeys(city);
    }
    @FindBy(id = "inputAddress1")
    private WebElement address1Field;
    public void enterTextInTextFieldAddress1(String address1) {
        address1Field.sendKeys(address1);
    }
    @FindBy(id = "inputAddress2")
    private WebElement address2Field;
    public void enterTextInTextFieldAddress2(String address2) {
        address2Field.sendKeys(address2);
    }
    @FindBy(id = "inputState")
    private WebElement stateField;
    public void enterTextInTextFieldState(String state) {
        stateField.sendKeys(state);
    }
    @FindBy(id = "inputZip")
    private WebElement zipField;
    public void enterTextInTextFieldZip(String zip) {
        zipField.sendKeys(zip);
    }
    @FindBy(css = ".mt-20 > button[type=submit]")
    private WebElement submitButton;
    public void clickOnSubmit()
    {
        submitButton.click();
    }
}
