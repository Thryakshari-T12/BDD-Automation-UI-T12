package com.stsi.cbus.bdd.StepDefs;


import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.LoginPage;
import com.stsi.cbus.bdd.Utils.CommonFunctions;
import com.stsi.cbus.bdd.Utils.WebDriverUtils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import com.stsi.cbus.bdd.StepsImp.LoginPageStepsImp;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginPageSteps extends BasePageSetup {

   public LoginPageStepsImp loginPageStepsImp;

   public LoginPageSteps(){
       loginPageStepsImp =  new LoginPageStepsImp();

   }


    @Given("I Navigate to Orange HRM URL")
    public void i_navigate_to_orange_hrm_url() {

       webdriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @Then("I Validate Login page is Disaplyed")
    public void i_validate_login_page_is_disaplyed() throws InterruptedException {

        loginPageStepsImp.validateLoginPageIsDisplayed();

    }
    @When("I Enter Valid User Name and Valid Password")
    public void i_enter_valid_user_name_and_valid_password() {

        loginPageStepsImp.enterValidUserNameAndValidPassword();
    }
    @When("I Click On Login Button")
    public void i_click_on_login_button() {

       loginPageStepsImp.clickOnLoginButton();

    }
    @Then("I Validate Application Logged In Successfully")
    public void i_validate_application_logged_in_successfully() throws InterruptedException {

        loginPageStepsImp.validateDahsboardIconIsDisplayed();
    }






}
