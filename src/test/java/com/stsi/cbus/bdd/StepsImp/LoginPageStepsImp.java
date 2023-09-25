package com.stsi.cbus.bdd.StepsImp;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.LoginPage;
import com.stsi.cbus.bdd.Utils.WebDriverUtils;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

import java.util.List;

public class LoginPageStepsImp extends BasePageSetup {

    public  LoginPage loginPage;

    public LoginPageStepsImp (){
        loginPage =  new LoginPage();
    }



    public void validateLoginPageIsDisplayed() throws InterruptedException {

        Thread.sleep(5000);
        Assert.assertTrue(loginPage.userNameInputField.isDisplayed());

    }

    public void enterValidUserNameAndValidPassword(){

        loginPage.userNameInputField.sendKeys("Admin");
        loginPage.passwordInputField.sendKeys("admin123");
    }


    public void clickOnLoginButton(){

        loginPage.loginButton.click();
    }

    public void validateDahsboardIconIsDisplayed() throws InterruptedException {
        Thread.sleep(3000);
       Assert.assertTrue(loginPage.dashboardIcon.isDisplayed());
    }
}
