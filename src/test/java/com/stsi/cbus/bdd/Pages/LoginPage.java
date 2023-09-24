package com.stsi.cbus.bdd.Pages;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.stsi.cbus.bdd.BrowerControls.BasePageSetup.webdriver;

public class LoginPage  {

    public LoginPage() {

        PageFactory.initElements(webdriver, this);

    }

    public String xpath = "//span[text()='%s']";

    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;



    public WebElement returnWebElement(String str){

        String webxpath =  String.format(xpath,str);
        System.out.println(webxpath);
       return webdriver.findElement(By.xpath(webxpath));
    }

}


