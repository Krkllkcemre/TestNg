package tests.day11_POM_assertions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.ZeroPage;
import unilities.ConfigReader;
import unilities.Driver;
import unilities.ReusableMethods;

import javax.security.auth.login.Configuration;

public class C06_SoftAssert
{
    @Test
    public void webapp() throws InterruptedException {
        //1. “http://zero.webappsecurity.com/” Adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("zeroUrl"));
        // 2. Sign in butonuna basin
        ZeroPage zeroPage=new ZeroPage();
        zeroPage.ilkSingButon.click();
        // 3. Login kutusuna “username” yazin
        zeroPage.userName.sendKeys("username");
        // 4. Password kutusuna “password” yazin
        zeroPage.password.sendKeys("password");
        // 5. Sign in tusuna basin
        zeroPage.singBUtton.click();
        Driver.driver.navigate().back();
        // 6. Online banking menusu icinde Pay Bills sayfasina gidin
        zeroPage.onlınBank.click();
        // 7. “Purchase Foreign Currency” tusuna basin
        zeroPage.transferFunLink.click();
        zeroPage.payBills.click();
        zeroPage.pForCur.click();
        // 8. “Currency” drop down menusunden Eurozone’u secin
        Select select=new Select(zeroPage.curreancDropDown);
        ReusableMethods.bekle(3);
        select.selectByVisibleText("Eurozone (euro)");
        // 9. soft assert kullanarak "Eurozone (euro)" secildigini test edin

        // 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin "Select One",
        // "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)","Denmark (krone)",
        // "Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)",
        // "Norway (krone),"New Zealand (dollar)","Sweden (krona)","Singapore (dollar)","Thailand (baht)"



    }
}
