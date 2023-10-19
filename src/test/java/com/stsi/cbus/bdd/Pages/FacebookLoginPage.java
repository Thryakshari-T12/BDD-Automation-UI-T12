package com.stsi.cbus.bdd.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.stsi.cbus.bdd.BrowerControls.BasePageSetup.webdriver;

public class FacebookLoginPage {
    public FacebookLoginPage() {

        PageFactory.initElements(webdriver, this);

    }


    //input[@autocomplete = \"username\"]
    @FindBy(xpath = "//input[@autocomplete = 'username']")
    public WebElement fbuserNameInputField;


    //input[@name= 'pass']
    @FindBy(xpath = "//input[@name= 'pass']")
    public WebElement fbpasswordInputField;


    //button[text() = 'Log in']
    @FindBy(xpath = "//button[text() = 'Log in']")
    public WebElement fbloginButton;


    //div[text()="The password that you've entered is incorrect. "]/child::a
    @FindBy(xpath = "//div[text()=\"The password that you've entered is incorrect. \"]/child::a")
    public WebElement fbinvalidCrediantialsMsg;


    //span[contains( text(),"What's on your mind")]
    @FindBy(xpath = "//span[contains( text(),\"What's on your mind\")]")
    public WebElement fbmsgAfterLogin;

//    public WebElement returnWebElement(String str){
//
//        String webxpath =  String.format(xpath,str);
//        System.out.println(webxpath);
//        return webdriver.findElement(By.xpath(webxpath));
//    }
}
