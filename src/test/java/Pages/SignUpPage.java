package Pages;

import java.util.List;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.SelectOption;
import com.playwrite.utils.BrowserManager;

public class SignUpPage {
    
    private Page page;

    public SignUpPage(){
        this.page = BrowserManager.getPage();
    }

    public String verifySignUpPageTitle(){
       return page.getByText("Sign Up").textContent();
    }
    public void verifyName(String string){
        page.getByPlaceholder("Name").fill(string); 
    }

    public void verifyEmail(String string){
        page.getByPlaceholder("Email").fill(string);
    }
    public void verifyPassword(String string){
        page.getByPlaceholder("Password").fill(string);
    }
    public int verifyInterestsCount(){
      return  page.locator("label.interest").count();
        
    }
    public void verifyInterestSelection(List<String> InterestSelected){
        for(String interest : InterestSelected){
            Locator chkbx = page.locator("//input[@class = 'form-check-input']" );
            chkbx.click();
        }
        
    }
    public void verifyGenderSelection(String string){
        Locator genderbtn = page.locator("//input[@name = 'gender']");
        genderbtn.click();
        
    }
    public void verifyStateSelection(String string){

        page.locator("#state").selectOption(new SelectOption().setValue(string));
        
    }
    public void verifyHobbiesSelection(String ... hobbies){
        page.locator("#hobbies").selectOption(hobbies);
    }
    public void verifySignUpButton(){
        page.locator("button.submit-btn").click();

    }

    
}
