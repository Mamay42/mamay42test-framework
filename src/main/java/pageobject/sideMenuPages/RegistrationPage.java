package pageobject.sideMenuPages;

import common.LogFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import pageobject.SideMenu;

public class RegistrationPage extends SideMenu {

    private static final Logger LOG = LogFactory.getLogger(RegistrationPage.class);


    @FindBy(id = "name_3_firstname")
    protected WebElement firstNameInput;

    @FindBy(id = "name_3_lastname")
    protected WebElement lastNameInput;

   @FindBy(xpath = "//input[@value = 'single']")
   protected WebElement singleRadio;

    @FindBy(xpath = "//input[@value = 'married']")
    protected WebElement marriedRadio;

    @FindBy(xpath = "//input[@value = 'divorced']")
    protected WebElement divorcedRadio;

    @FindBy(xpath = "//input[@value = 'dance']")
    protected WebElement danceCheckbox;

    @FindBy(xpath = "//input[@value = 'reading']")
    protected WebElement readingCheckbox;

    @FindBy(xpath = "//input[@value = 'cricket ']")
    protected WebElement cricketChecbox;

    @FindBy(id = "dropdown_7")
    protected WebElement countryDropdown;

    @FindBy(id = "mm_date_8")
    protected WebElement monthDropdown;

    @FindBy(id = "dd_date_8")
    protected WebElement dayDropdown;

    @FindBy(id = "yy_date_8")
    protected WebElement yearDropdown;

    @FindBy(id = "phone_9")
    protected WebElement phoneNumberInput;

    @FindBy(id = "username")
    protected WebElement usernameInput;

    @FindBy(id = "email_1")
    protected WebElement emailInput;

    @FindBy(id = "description")
    protected WebElement descriptionInput;

    @FindBy(id = "password_2")
    protected WebElement passwordInput;

    @FindBy(id = "confirm_password_password_2")
    protected WebElement confirmPasswordInput;

    @FindBy(xpath = "//input[@name = 'pie_submit']")
    protected WebElement submitButton;

    private WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }
    public RegistrationPage fillFirstNameInput(String input) {
        firstNameInput.clear();
        firstNameInput.sendKeys(input);
        LOG.info("Filled first name input with text: " + input);
        return this;

    }
    public RegistrationPage fillLastNameInput(String input) {
        lastNameInput.clear();
        lastNameInput.sendKeys(input);
        LOG.info("Field last name input with text: " + input);
        return this;
    }

    public RegistrationPage singleStatus(){
        singleRadio.click();
        LOG.info("Single status selected");
        return this;
    }
    public RegistrationPage marriedStatus(){
        marriedRadio.click();
        LOG.info("Married status selected");
        return this;
    }
    public RegistrationPage divorcedStatus(){
        divorcedRadio.click();
        LOG.info("Divorced status selected");
        return this;
    }
    public RegistrationPage danceHobby(){
        danceCheckbox.click();
        LOG.info("Dance hobby selected");
        return this;
    }
    public RegistrationPage readingHobby(){
        readingCheckbox.click();
        LOG.info("reading hobby selected");
        return this;
    }
    public RegistrationPage cricketHobby(){
        cricketChecbox.click();
        LOG.info("Cricket hobby selected");
        return this;
    }

    public RegistrationPage countryDropdownList(String value){
        Select countrySelect = new Select(countryDropdown);
        countrySelect.selectByValue(value);
        LOG.info("Selected country: "+ value);
        return this;
    }
    public RegistrationPage monthDropdownList(String value){
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByValue(value);
        LOG.info("Month selected: "+ value);
        return this;
    }
    public RegistrationPage dayDropdownList(String value){
        Select daySelect = new Select(dayDropdown);
        daySelect.selectByValue(value);
        LOG.info("Day selected: "+ value);
        return this;
    }
    public RegistrationPage yearDropdownList(String value){
        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByValue(value);
        LOG.info("Year selected: "+ value);
        return this;
    }
    public RegistrationPage fillPhoneNumberInput(String input) {
        phoneNumberInput.clear();
        phoneNumberInput.sendKeys(input);
        LOG.info("Field phone number input with text: " + input);
        return this;
    }
    public RegistrationPage fillUsernameInput(String input) {
        usernameInput.clear();
        usernameInput.sendKeys(input);
        LOG.info("Field username input with text: " + input);
        return this;
    }
    public RegistrationPage fillEmailInput(String input) {
        emailInput.clear();
        emailInput.sendKeys(input);
        LOG.info("Field email input with text: " + input);
        return this;
    }
    public RegistrationPage fillAboutYourselfInput(String input) {
        descriptionInput.clear();
        descriptionInput.sendKeys(input);
        LOG.info("Field about yourself input with text: " + input);
        return this;
    }
    public RegistrationPage fillPasswordInput(String input) {
        passwordInput.clear();
        passwordInput.sendKeys(input);
        LOG.info("Field password input with text: " + input);
        return this;
    }
    public RegistrationPage fillConfirmPasswordInput(String input) {
        confirmPasswordInput.clear();
        confirmPasswordInput.sendKeys(input);
        LOG.info("Field confirm password input with text: " + input);
        return this;
    }
    public RegistrationPage clickSubmitButtom(){
        submitButton.click();
        LOG.info("Submit button is clicked");
        return this;
    }

}
