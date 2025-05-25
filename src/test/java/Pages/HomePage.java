package Pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.playwrite.utils.*;

public class HomePage {

    private Page page;

    public HomePage(){
        this.page = BrowserManager.getPage();
    }
    
    public void NavigateToURL(String URL){
        page.navigate(URL);
        
    }
    public String verifyTitle(){
        System.out.println("Title of page is "+ page.title());
        return page.title();
    }
    
    public int verifyCourseCount(){
       page.waitForSelector("//div[@class = 'course-card row']"); 
       int count = page.locator("//div[@class = 'course-card row']").count();
       System.out.println("Total no. of courses are "+ count);
       return count;
    }

    public int verifyFooterIconsCount(){
        Locator footerIconsLocator = page.locator("//div[@class = 'social-btns']//a");
      return footerIconsLocator.count();
    }  
}
