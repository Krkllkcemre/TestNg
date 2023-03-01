package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import unilities.Driver;

public class ZeroPage
{
    public  ZeroPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//i[@class='icon-signin']")
    public WebElement ilkSingButon;

    @FindBy(xpath = "//input[@name='user_login']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement password;

    @FindBy(xpath = "//input[@value='Sign in']")
    public WebElement singBUtton;

    @FindBy(xpath = "//a[@id='online-banking']")
    public WebElement onlınBank;

    @FindBy(xpath = "//span[@id='transfer_funds_link']")
    public WebElement transferFunLink;
    @FindBy(xpath = "//a[text()='Pay Bills']")
    public WebElement payBills;

    @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
    public WebElement pForCur;

    @FindBy(xpath = "//select[@id='pc_currency']")
    public WebElement curreancDropDown;
}
