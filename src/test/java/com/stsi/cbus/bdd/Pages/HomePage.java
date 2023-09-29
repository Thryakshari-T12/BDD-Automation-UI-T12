package com.stsi.cbus.bdd.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.stsi.cbus.bdd.BrowerControls.BasePageSetup.webdriver;

public class HomePage {

    public HomePage() {

        PageFactory.initElements(webdriver, this);

    }

    public String xpath = "//span[text()='%s']";


    @FindBy(xpath = "//h6[text()='Personal Details']")
    public WebElement personalDetailsheadder;


    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement firstNameInputField;


    public WebElement returnWebElement(String str){

        String webxpath =  String.format(xpath,str);
        System.out.println(webxpath);
        return webdriver.findElement(By.xpath(webxpath));
    }

}
