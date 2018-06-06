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
    public WebElement firstNameInput;

    @FindBy(id = "name_3_lastname")
    public WebElement lastNameInput;

    @FindBy(xpath = "//input[@value = 'single']")
    public WebElement singleRadio;

    @FindBy(xpath = "//input[@value = 'married']")
    public WebElement marriedRadio;

    @FindBy(xpath = "//input[@value = 'divorced']")
    public WebElement divorcedRadio;

    @FindBy(xpath = "//input[@value = 'dance']")
    public WebElement danceCheckbox;

    @FindBy(xpath = "//input[@value = 'reading']")
    public WebElement readingCheckbox;

    @FindBy(xpath = "//input[@value = 'cricket ']")
    public WebElement cricketChecbox;

    @FindBy(id = "dropdown_7")
    public WebElement countryDropdown;

    @FindBy(id = "mm_date_8")
    public WebElement monthDropdown;

    @FindBy(id = "dd_date_8")
    public WebElement dayDropdown;

    @FindBy(id = "yy_date_8")
    public WebElement yearDropdown;

    @FindBy(id = "phone_9")
    public WebElement phoneNumberInput;

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "email_1")
    public WebElement emailInput;

    @FindBy(id = "description")
    public WebElement descriptionInput;

    @FindBy(id = "password_2")
    public WebElement passwordInput;

    @FindBy(id = "confirm_password_password_2")
    public WebElement confirmPasswordInput;

    @FindBy(xpath = "//input[@name = 'pie_submit']")
    public WebElement submitButton;

//    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[1]//span")
    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[1]/div[1]/div[2]/span")
    public WebElement errorName;
    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[3]//span")
    public WebElement errorHobby;
    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[6]//span")
    public WebElement errorPhoneNumber;
    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[7]//span")
    public WebElement errorUsername;
    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[8]//span")
    public WebElement errorEmail;
    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[11]//span")
    public WebElement errorPasword;
    @FindBy(xpath ="//*[@id=\"pie_register\"]/li[12]//span")
    public WebElement errorConfirmPassword;



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

    public RegistrationPage singleStatus() {
        singleRadio.click();
        LOG.info("Single status selected");
        return this;
    }

    public RegistrationPage marriedStatus() {
        marriedRadio.click();
        LOG.info("Married status selected");
        return this;
    }

    public RegistrationPage divorcedStatus() {
        divorcedRadio.click();
        LOG.info("Divorced status selected");
        return this;
    }

    public RegistrationPage danceHobby() {
        danceCheckbox.click();
        LOG.info("Dance hobby selected");
        return this;
    }

    public RegistrationPage readingHobby() {
        readingCheckbox.click();
        LOG.info("reading hobby selected");
        return this;
    }

    public RegistrationPage cricketHobby() {
        cricketChecbox.click();
        LOG.info("Cricket hobby selected");
        return this;
    }

    public RegistrationPage countryDropdownList(String value) {
        Select countrySelect = new Select(countryDropdown);
        countrySelect.selectByValue(value);
        LOG.info("Selected country: " + value);
        return this;
    }

    public RegistrationPage monthDropdownList(String value) {
        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByValue(value);
        LOG.info("Month selected: " + value);
        return this;
    }

    public RegistrationPage dayDropdownList(String value) {
        Select daySelect = new Select(dayDropdown);
        daySelect.selectByValue(value);
        LOG.info("Day selected: " + value);
        return this;
    }

    public RegistrationPage yearDropdownList(String value) {
        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByValue(value);
        LOG.info("Year selected: " + value);
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

    public RegistrationPage clickSubmitButtom() {
        submitButton.click();
        LOG.info("Submit button is clicked");
        return this;
    }

}
