package PageTests;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;

import Pages.SignUpPage;

public class SignUpPageTest {

    SignUpPage signUp = new SignUpPage();

    @Test
    public void TestSignUpTitle(){
        String t1 = signUp.verifySignUpPageTitle();
        Assert.assertEquals(t1, "Sign Up");
    }

    @Test
    public void TestEnterName(){
        signUp.verifyName("Dhriya");
        
    }

    @Test
    public void TestEnterEmail(){
        signUp.verifyEmail("dhriyaca@gmail.com");
    }

    @Test
    public void TestEnterPassword(){
        signUp.verifyEmail("Test12345");
    }

    @Test
    public void TestInterestValuesCount(){
        int c1 = signUp.verifyInterestsCount();
        Assert.assertEquals(c1, 9);
    }

    @Test
    public void TestInterestSelection(){
        List<String> interests = Arrays.asList("Java", "Selenium WebDriver", "Playwright2");
        signUp.verifyInterestSelection(interests );
    }

    @Test
    public void TestGenderSelection(){
        signUp.verifyGenderSelection("Female");
    }

    @Test
    public void TestStateSelection(){
        signUp.verifyGenderSelection("Goa");
    }

    @Test
    public void TestHobbiesSelection(){
        signUp.verifyHobbiesSelection("Reading","Swimming");
    }

    @Test
    public void TestSignUpClick(){
        signUp.verifySignUpButton();
    }


}
