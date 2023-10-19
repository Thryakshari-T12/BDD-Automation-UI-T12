package com.stsi.cbus.bdd.StepsImp;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.FacebookLoginPage;
import org.junit.Assert;

public class FacebookLoginStepsImp extends BasePageSetup {

    public FacebookLoginPage facebookLoginPage;

    public FacebookLoginStepsImp (){
        facebookLoginPage =  new FacebookLoginPage();
    }

    public void fbvalidateLoginPageIsDisplayed() throws InterruptedException {

        Thread.sleep(5000);
        Assert.assertTrue(facebookLoginPage.fbuserNameInputField.isDisplayed());

    }

    public void fbenterValidUserNameAndValidPassword() throws InterruptedException{

        facebookLoginPage.fbuserNameInputField.sendKeys("7842692208");
        facebookLoginPage.fbpasswordInputField.sendKeys("mohan143");
    }

    public void clickOnLoginButton() throws InterruptedException{

        facebookLoginPage.fbloginButton.click();
    }

    public void fbvalidateDahsboardIconIsDisplayed() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(facebookLoginPage.fbmsgAfterLogin.isDisplayed());
    }


}
