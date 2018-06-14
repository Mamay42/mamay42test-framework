import common.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Description;

public class TestRegistration extends TestBase {

    @DataProvider(name = "userData")
    public static Object[][] credentials() {
        return new Object[][]{
                {"Vitalia1", "Vitaliaaaa1","Ukraine", "3","23","1995", "0678884422",
                        "vitalik12", "tt69661611@gmail.com","some description ", "votalik123"}};
    }


    @Test(dataProvider = "userData")
    @Description("If test fail, change user data")
    public void testRegistration(String firstName, String lastName, String country,
                                 String month, String day, String year, String phoneNumber,
                                 String username, String email, String description,
                                 String password){
        homePage
                .clickRegistrationButton()
                .fillFirstNameInput(firstName)
                .fillLastNameInput(lastName)
                .singleStatus()
                .readingHobby()
                .danceHobby()
                .countryDropdownList(country)
                .monthDropdownList(month)
                .dayDropdownList(day)
                .yearDropdownList(year)
                .fillPhoneNumberInput(phoneNumber)
                .fillUsernameInput(username)
                .fillEmailInput(email)
                .fillAboutYourselfInput(description)
                .fillPasswordInput(password)
                .fillConfirmPasswordInput(password)
                .clickSubmitButtom();


//        Assert.assertTrue(driver.findElement(By.xpath("//p[@class = 'piereg_message']")).
//         getText().equals("Thank you for your registration"));

//----------If you use the same data-------------
        Assert.assertTrue(driver.findElement(By.xpath("//p[@class='piereg_login_error']/strong")).isDisplayed());



    }

}
