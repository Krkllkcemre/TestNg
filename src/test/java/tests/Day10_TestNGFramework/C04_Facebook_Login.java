package tests.Day10_TestNGFramework;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPages;
import unilities.Driver;
import unilities.ReusableMethods;

public class C04_Facebook_Login
{
    @Test
    public void facebookTesti() throws InterruptedException {
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin


        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();
        FacebookPages facebookPages= new FacebookPages();

        facebookPages.emailKutusu.sendKeys("abc"+faker.internet().emailAddress());
        facebookPages.passwordKutusu.sendKeys(faker.internet().password());
        ReusableMethods.bekle(3);
        facebookPages.loginButonu.click();
        //4- Basarili giris yapilamadigini test edin
        Assert.assertTrue(facebookPages.girisYapilamadiYaziElementi.isDisplayed());

        ReusableMethods.bekle(3);

        Driver.closeDriver();

    }
}
