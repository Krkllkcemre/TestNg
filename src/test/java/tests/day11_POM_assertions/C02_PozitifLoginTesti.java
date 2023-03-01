package tests.day11_POM_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import unilities.ConfigReader;
import unilities.Driver;
import unilities.ReusableMethods;

public class C02_PozitifLoginTesti
{
    @Test
    public void pozitifLoginTesti() throws InterruptedException {
        // qd anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));

        //login linkine tıklayın
        QdPage qdPage=new QdPage();
        qdPage.ilkLoginLinki.click();


        //geçerli kullanıcı adı ve password ile giriş yapın

        qdPage.cookiesButon.click();
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));

        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        ReusableMethods.bekle(4);

        qdPage.loginButonu.click();
        //basarılı birşekilde giriş yaptıgını test edin

        Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());

        Driver.closeDriver();



    }
}
