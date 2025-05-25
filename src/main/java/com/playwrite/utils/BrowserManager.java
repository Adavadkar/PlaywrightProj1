package com.playwrite.utils;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserManager {
    private static Playwright playwright;
    private static Browser browser;
    private static Page page;


    public static void LaunchPage(){
         playwright =  Playwright.create();
         browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(3000)); 
         page = browser.newPage();

    }

    public static Page getPage(){
        return page;
    }

    public static void close(){
        if(browser != null) browser.close();
        if(page != null)page.close();
    }

    public static void main(String[] args) {
        LaunchPage();
        close();
          
        };
        
    
}
