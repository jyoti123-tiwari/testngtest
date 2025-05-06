package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
	      
	public RegisterPage(WebDriver driver) {
		super(driver);
	}
   @FindBy(xpath="//input[@id='form1_Name']")
   WebElement uname;
   
   @FindBy(xpath="//input[@id='form1_phone']")
   WebElement uPhoneNo;
   @FindBy(xpath="//button[normalize-space()='Get Free Membership']")
   WebElement clickbtn;
   
   @FindBy(xpath="//input[@id='form1_otp']")
   WebElement otpenter;
   
   @FindBy(xpath="//p[normalize-space()='Invalid OTP']")
	WebElement otp;
   
   @FindBy(xpath="//button[@id='form1_submit_otp']")
   WebElement subotp;
   
   public void setUserName(String unamef) {
	   uname.sendKeys(unamef);
   }
   public void setUserPhoneNo(String phoneNo) {
	   uPhoneNo.sendKeys(phoneNo);
   }
   public void clickregbtn() {
	   clickbtn.click();
   }
   public void otpe(String myotp) {
	   otpenter.sendKeys(myotp);
   }
   public void submitotp() {
	   subotp.click();
   }
   
   public String otpcon() {
	   try {
			return (otp.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}
   
}
