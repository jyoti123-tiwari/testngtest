package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import BaseClass.BaseClassSetup;

import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class RegistrationTestIdValidation extends BaseClassSetup {
	@Test(groups = {"Regression","Master"})
	public void registartionData() throws InterruptedException {
		logger.info("***hi**");
		//logger.debug("**hI debug**");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickForRegister();
		RegisterPage rg=new RegisterPage(driver);
		rg.setUserName(randomeString().toUpperCase());
		rg.setUserPhoneNo("98"+randomeNumber());
		rg.clickregbtn();
		Thread.sleep(2000);
		rg.otpe("1234");
		rg.submitotp();
		String otpvali=rg.otpcon();
		if(otpvali.equals("Invalid OTP")) {
			Assert.assertTrue(true);
			logger.info("***passed***");
		}
		else {
			Assert.assertTrue(false);
			
			//logger.debug("debug test cases");
			logger.info("***failed***");
		}
		}
		catch(Exception e) {
			logger.info("failed cases");
			logger.debug("debug test cases");
			logger.error("***failed***");
		}
		
		//Assert.assertEquals(otpvali, "OTP sent to your phone and whatsapp.");
	}

}
