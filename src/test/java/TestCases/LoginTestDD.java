package TestCases;

import BaseClass.BaseClassSetup;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utility.DataProviders;

public class LoginTestDD extends BaseClassSetup {
    @Test(dataProvider = "dp", dataProviderClass= DataProviders.class)
   public void loginTestmethod(String id,String pass, String exp) throws InterruptedException {

           try {

               logger.info("login info");
               HomePage hp = new HomePage(driver);
               hp.clickerLogin();


               //for login
               LoginPage lp=new LoginPage(driver);
               lp.setLOGINid(id);
               lp.setLOGIPass(pass);
               Thread.sleep(5000);
               lp.clickLOGIN();

               //Home page
               MyAccountPage mp=new MyAccountPage(driver);
                 boolean targetPage=mp.setMyaccount();
               if(exp.equalsIgnoreCase("Valid"))
               {
                   if(targetPage==true)
                   {
                       logger.info("login success");
                       mp.logoutuser();
                       Assert.assertTrue(true);
                   }
                   else
                   {
                       Assert.assertTrue(false);
                   }
               }

               if(exp.equalsIgnoreCase("Invalid"))
               {
                   if(targetPage==true)
                   {
                       mp.logoutuser();
                       Assert.assertTrue(false);
                   }
                   else
                   {
                       Assert.assertTrue(true);
                   }
               }
           }
           catch(Exception e)
           {
               Assert.fail("An exception occurred: " + e.getMessage());
           }
     Thread.sleep(5000);
        logger.info("**** Finished TC_003_LoginDDT *****");
    }

}
