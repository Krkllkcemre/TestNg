package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unilities.Driver;

public class FacebookPages
{
    public FacebookPages()
    {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@type='text']")
    public WebElement emailKutusu ;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButonu;
    @FindBy(xpath = "//div[@class='_9ay7']")
    public WebElement girisYapilamadiYaziElementi;
}
