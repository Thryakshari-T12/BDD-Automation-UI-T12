package com.stsi.cbus.bdd.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.stsi.cbus.bdd.BrowerControls.BasePageSetup.webdriver;

public class AmazonPage {

    public AmazonPage() {

        PageFactory.initElements(webdriver, this);

    }

    @FindBy(xpath = "//div[text()='Get to Know Us']")
    public WebElement gettoKnowUsLink;


    @FindBy(xpath = "//div[@id='draggable']")
    public WebElement sourceElement;


    @FindBy(xpath = "//div[@id='droppable']")
    public WebElement targetElement;

    @FindBy(xpath = "//iframe[@class='demo-frame']")
    public WebElement iframe;


}
