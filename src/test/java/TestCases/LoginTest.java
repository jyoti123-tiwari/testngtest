package TestCases;
import BaseClass.BaseClassSetup;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class LoginTest extends BaseClassSetup{

    @Test(groups = {"Sanity","Master"})
    public void loginfordata() {
        try {

            logger.info("login info");
            HomePage hp = new HomePage(driver);
            hp.clickerLogin();


            //for login
            LoginPage lp=new LoginPage(driver);
            lp.setLOGINid(p.getProperty("id"));
            lp.setLOGIPass(p.getProperty("pass"));
            Thread.sleep(5000);
            lp.clickLOGIN();

            //Home page
            MyAccountPage mp=new MyAccountPage(driver);
            boolean exp=mp.setMyaccount();

            //for logout


            Assert.assertEquals(exp, true,"Login failed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
