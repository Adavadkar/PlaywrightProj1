package PageTests;
import org.testng.Assert;

import Pages.LoginPage;

public class LoginPageTest {
    LoginPage login = new LoginPage();

    public void TestLoginPageLaunch(){
        Assert.assertEquals(login.verifyLoginPage(), "Sign In");
    
    }

    public void TestEnterEmail(){
        login.verifyEmail("admin@email.com");
    }

    public void TestEnterPassword(){
        login.verifyPassword("admin123");

    }

    public void TestSocialBttnCount(){
       int SocialBttnCount = login.verifySocialLinks();
        Assert.assertEquals(SocialBttnCount,5);
    }

    public void TestSignIn(){
        login.verifySignInButton();
        
        

    }

    

}
