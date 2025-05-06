package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class MyAccountPage extends BasePage{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[@class='top-level-menu-a'][normalize-space()='My Account']")
    WebElement myaccount;
    @FindBy(xpath = "//a[normalize-space()='Log Out']")
    WebElement logout;

    public boolean setMyaccount(){
        try{
            return (myaccount.isDisplayed());
        } catch (Exception e) {
            return (false);
        }
    }
    public void logoutuser(){
        Actions act=new Actions(driver);
        act.moveToElement(myaccount).moveToElement(logout).click().build().perform();
    }
}
