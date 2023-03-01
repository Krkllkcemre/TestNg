package tests.day11_POM_assertions;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import unilities.ConfigReader;
import unilities.Driver;

import java.security.Key;

public class C05_SoftAssert
{
    @Test
    public void amazonTesti()
    {
        /*
        Genel olarak test edin denirse Hard assert ,
        Dogrulayın denirse Soft Assert kullanılır
         */
        //amazon ana sayfaya gidip dogru sayfaya gittigimizi dogrulayın(verify)
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedIcerik="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedIcerik));

        //Nutella için arama yapıp sonuçların nutella içerdigini test edin
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        expectedIcerik="Nutella";
        String actualAramaSunucYazısı=amazonPage.aramaSonucElementi.getText();

        softAssert.assertTrue(actualAramaSunucYazısı.contains(expectedIcerik));
        //ilk urune tıklayıp , urun isminde Nutella geçtigini dogrulayın
        amazonPage.ilkUrun.click();
        expectedIcerik="Nutella";
        String actulaİlkÜrünİsim=amazonPage.ilkUrunIsimElementi.getText();

        softAssert.assertTrue(actulaİlkÜrünİsim.contains(expectedIcerik));

        softAssert.assertAll();

        Driver.closeDriver();
    }
}
