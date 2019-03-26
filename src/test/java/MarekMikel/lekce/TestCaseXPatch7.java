package MarekMikel.lekce;

import marek.pageObject_lection7.RedmineHelpPageXPath;
import marek.pageObject_lection7.RedmineHomePageXPath;
import marek.pageObject_lection7.RedmineLoginPageXPath;
import marek.pageObject_lection7.RedmineMainPageXPatch;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

@Test
public class TestCaseXPatch7 extends TestAbstract{


    @Test
    public void TestCaseXPatch7() {
        getDriver().get("http://www.redmine.org");

//        RedmineHomePage8 redmineHomePageXPath = new RedmineHomePage8(getDriver());
//        redmineHomePageXPath.SearchLoginAnchor();

        //z nove lekce pro zjednoduseni vrsku
        new RedmineHomePageXPath(getDriver())
                .clickOnLoginAnchor(getDriver());






        RedmineLoginPageXPath redmineLoginPageXPath = new RedmineLoginPageXPath(getDriver());
        redmineLoginPageXPath.SearchUserLogin("pepe5565");
        redmineLoginPageXPath.SearchUserPassword("PXPkehadBWX97Y9");
        redmineLoginPageXPath.SearchLogin();

        RedmineMainPageXPatch redmineMainPageXPatch = new RedmineMainPageXPatch(getDriver());
        redmineMainPageXPatch.clickOnHelpAnchore();

        RedmineHelpPageXPath redmineHelpPageXPath = new RedmineHelpPageXPath(getDriver());
        redmineHelpPageXPath.ClickSpentTimeReport();

        getWait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@name='Redmine-Timelog-Report']/following::h1")));
        assertEquals("Redmine Timelog Report",
        getDriver().findElement(By.xpath("//a[@name='Redmine-Timelog-Report']/following::h1")).getText());



    }
}