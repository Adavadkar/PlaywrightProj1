package PageTests;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.playwrite.utils.BrowserManager;

import Pages.HomePage;

public class HomePageTest {

   HomePage hm;
    //BrowserManager bm;

   @BeforeClass
    public void setup(){
        BrowserManager.LaunchPage();
         hm = new HomePage();   
    }
    
   @Test
   public void TestHomePageURL(){
    hm.NavigateToURL("https://freelance-learn-automation.vercel.app/");
    String currentURL = BrowserManager.getPage().url(); // or use page.url() if available
    Assert.assertEquals(currentURL, "https://freelance-learn-automation.vercel.app/");
   }

   @Test
   public void TestHomePageTitle(){
    String pageTitle = hm.verifyTitle();
    Assert.assertEquals(pageTitle, "Learn Automation Courses");
   }

   @Test
   public void TestCourseCount(){
    Assert.assertEquals(hm.verifyCourseCount(),8);
   }

   @Test
   public void TestHomeFooter(){
    Assert.assertEquals(hm.verifyFooterIconsCount(),4 );
   }

   @AfterClass
   public void teardown(){
    BrowserManager.close();
   }
}
