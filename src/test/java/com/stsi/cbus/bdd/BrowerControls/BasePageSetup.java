package com.stsi.cbus.bdd.BrowerControls;


import com.stsi.cbus.bdd.Pages.PageInitializer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class BasePageSetup extends PageInitializer {
    public  static WebDriver  webdriver;

    public  void initialization(String browser) throws Exception {

        if (browser.equalsIgnoreCase("Chrome")) {


            WebDriverManager.chromedriver().setup();
           WebDriver driver = new ChromeDriver();




        }else if(browser.equalsIgnoreCase("Firefox")){

            System.setProperty("webdriver.gecko.driver", (System.getProperty("user.dir") + File.separator +"src/test/resources/Drivers/Firefox/Windows/geckodriver.exe"));
            webdriver = new FirefoxDriver();
            webdriver.manage().window().maximize();
            webdriver.manage().deleteAllCookies();

            PageInitializer init = new PageInitializer();
            init.initializeAllPages();
        }
    }


    public static void CloseBrowser() throws InterruptedException {
        Thread.sleep(5000);
        webdriver.quit();
    }
}