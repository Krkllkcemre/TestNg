package tests.day11_POM_assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C04_HardAssert_SoftAssert
{
    @Test
    public void hardAssertionTesti()
    {
        Assert.assertTrue(5>8);
        Assert.assertFalse(8==8);
        Assert.assertEquals(5,9);

        Assert.assertNotEquals(6,6);

    }

    @Test
    public void softAssertionTesti()
    {
        /*
        JUnit 'deki Assert class'i TestNG'de de vardır
        Ancak bir test method'unda birden fazla failed olan assertion varsa
        ilk failed olan assrtion' da çalışmayı durdurup exception fırlattıgından
        tum hatayı bir defa görüp, hepsini düzeltme şansımız olmaz

        TestNG bunun için bir alternatif oluşturup
        o obje uzerinden istedigimiz testleri yapıyoruz
        safttassert objesi ile yapılan assertion'lar faild olsa da testimiz çalışmaya devam eder

        ancak testlerin sonucunu görmek istedigimizde
        softassert.assertAll() ile tum yaptıgı tetleri raporlamasını soyle
         */

        SoftAssert softAssert=new SoftAssert();

        softAssert.assertTrue(5>8,"True testi failde");
        softAssert.assertFalse(8==8,"False testi failde");
        softAssert.assertEquals(5,9,"Equals testi failde");
        softAssert.assertNotEquals(6,6,"noEquals testi failde");


        softAssert.assertAll();

    }
}
