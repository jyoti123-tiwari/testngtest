package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//li[@class='nav-item']//a[@class='mobile-padd'][normalize-space()='Get Free Account']")
	WebElement clkNreg;

	@FindBy(xpath = "(//a[normalize-space()='Log In'])")
	WebElement login;
	
	public void clickForRegister(){
		clkNreg.click();
	}
	public void clickerLogin(){login.click();}
}
