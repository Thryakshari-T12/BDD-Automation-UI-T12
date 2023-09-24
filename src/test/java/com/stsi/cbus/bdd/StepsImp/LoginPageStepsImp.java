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


}
