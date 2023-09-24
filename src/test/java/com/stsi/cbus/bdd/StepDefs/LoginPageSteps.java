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

import java.util.Map;

public class LoginPageSteps extends BasePageSetup {

   public LoginPageStepsImp loginPageStepsImp;

   public LoginPageSteps(){
       loginPageStepsImp =  new LoginPageStepsImp();

   }



    @Given("I Navigate to Orange HRM URL")
    public void I_Navigate_to_Orange_HRM_URL() throws Exception {
        webdriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }




}
