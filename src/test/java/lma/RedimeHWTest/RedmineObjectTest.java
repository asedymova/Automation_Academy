package lma.RedimeHWTest;

import RedmineHW.RedmineHomePage;
import RedmineHW.RedmineLoginPage;
import RedmineHW.RedmineRegisterPage;
import org.testng.annotations.Test;
import java.util.Random;


@Test
public class RedmineObjectTest extends RedmineObjectTestAbstract {

    @Test
    public void RedmineObjectTest() {

        Random rand = new Random();
        int n = rand.nextInt(1000);

        getDriver().get("http://www.redmine.org/");

        RedmineHomePage redmineHomePage = new RedmineHomePage(getDriver());
        redmineHomePage.clickOnRegister();

        RedmineRegisterPage redmineRegisterPage = new RedmineRegisterPage(getDriver());
        redmineRegisterPage.userLogin("Java" + n);
        redmineRegisterPage.userPassword("Heslo123");
        redmineRegisterPage.userPasswordConfirmation("Heslo123");
        redmineRegisterPage.userFirstname("Krestni");
        redmineRegisterPage.userLastname("Prijmeni");
        redmineRegisterPage.userMail(n + "@aaa.cz");
        redmineRegisterPage.userLanguageSelect();
        redmineRegisterPage.userIrcNick("123456");
        redmineRegisterPage.clickRegisterButton();

        RedmineLoginPage redmineLoginPage = new RedmineLoginPage(getDriver());
        redmineLoginPage.usernameLogin("Java" + n);
        redmineLoginPage.usernamePassword("Heslo123");
        redmineLoginPage.clickLoginButton();
    }
}