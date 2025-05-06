package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage  extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@id='usr_email']")
    WebElement phonon;
    @FindBy(xpath = "//input[@id='pwd']")
    WebElement password;
    @FindBy(xpath = "//button[@id='doLogins']")
    WebElement signings;

    public void setLOGINid(String phonon){
        this.phonon.sendKeys(phonon);
    }
    public void setLOGIPass(String pass){
        password.sendKeys(pass);
    }

    public void clickLOGIN(){
        signings.click();
    }
}
