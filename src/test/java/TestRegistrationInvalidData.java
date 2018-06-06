import common.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageobject.sideMenuPages.RegistrationPage;

public class TestRegistrationInvalidData extends TestBase {

    RegistrationPage registrationPage;

    @BeforeClass
    public void openRegistrationPage(){
        registrationPage = homePage.clickRegistrationButton();
    }

    @Test
    public void testRegstrationInvalidData(){
        registrationPage.clickSubmitButtom();

        Assert.assertTrue((registrationPage.errorName).isDisplayed());
        Assert.assertTrue((registrationPage.errorHobby).isDisplayed());
        Assert.assertTrue((registrationPage.errorPhoneNumber).isDisplayed());
        Assert.assertTrue((registrationPage.errorUsername).isDisplayed());
        Assert.assertTrue((registrationPage.errorEmail).isDisplayed());
        Assert.assertTrue((registrationPage.errorPasword).isDisplayed());
        Assert.assertTrue((registrationPage.errorConfirmPassword).isDisplayed());

    }
}
