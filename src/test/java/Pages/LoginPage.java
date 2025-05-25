package Pages;

import com.microsoft.playwright.Page;
import com.playwrite.utils.BrowserManager;

public class LoginPage {

    private Page page;
    
    public LoginPage(){
        this.page = BrowserManager.getPage();
    }

    public String verifyLoginPage(){
       return page.getByText("Sign In").textContent();
    }

    public void verifyEmail(String string){
        page.getByPlaceholder("Enter Email").fill(string);;

    }

    public void verifyPassword(String string){
        page.getByPlaceholder("Enter Password").fill(string);

    }

    public void verifySignInButton(){
        page.locator("button.submit-btn").click();
    }

    public int verifySocialLinks(){
      int Bttncount = page.locator("//div[@class = 'social']//a").count();
        return Bttncount;
    }
    
}
