package com.stsi.cbus.bdd.Pages;

import org.openqa.selenium.support.PageFactory;

import static com.stsi.cbus.bdd.BrowerControls.BasePageSetup.webdriver;

public class AmazonPage {

    public AmazonPage() {

        PageFactory.initElements(webdriver, this);

    }

}
