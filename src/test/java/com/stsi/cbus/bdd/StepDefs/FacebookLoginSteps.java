package com.stsi.cbus.bdd.StepDefs;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.StepsImp.FacebookLoginStepsImp;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FacebookLoginSteps extends BasePageSetup {

    public FacebookLoginStepsImp facebookLoginStepsImp;

    public FacebookLoginSteps(){
        facebookLoginStepsImp =  new FacebookLoginStepsImp();

    }

    @Given("I Navigate to Facebook URL")
    public void i_Navigate_to_Facebook_URL() {

        webdriver.get("https://www.facebook.com/login/");

    }

    @Then("I Validate Facebook Login page is Displayed")
    public void i_Validate_Facebook_Login_page_is_Displayed() throws InterruptedException {

        facebookLoginStepsImp.fbvalidateLoginPageIsDisplayed();

    }


    @When("I Enter Valid Facebook User Name and Valid Password")
    public void i_Enter_Valid_Facebook_User_Name_and_Valid_Password() throws InterruptedException{

        facebookLoginStepsImp.fbenterValidUserNameAndValidPassword();

    }

    @And("I Click On Facebook Login Button")
    public void i_Click_On_Facebook_Login_Button() throws InterruptedException{

        facebookLoginStepsImp.clickOnLoginButton();

    }


    @Then("I Validate Facebook Application Logged In Successfully")
    public void i_Validate_Facebook_Application_Logged_In_Successfully() throws InterruptedException{

        facebookLoginStepsImp.fbvalidateDahsboardIconIsDisplayed();

    }
}
