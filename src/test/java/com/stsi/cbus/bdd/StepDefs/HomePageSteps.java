package com.stsi.cbus.bdd.StepDefs;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.StepsImp.HomePageStepsImp;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;


public class HomePageSteps extends BasePageSetup {

    public HomePageStepsImp homePageStepsImp;

    public HomePageSteps(){
        homePageStepsImp =  new HomePageStepsImp();

    }

    @Then("I Validate all the Menu Links are Displayed")
    public void validate_all_the_Menu_Links_are_Displayed(DataTable dataTable){

        homePageStepsImp.validateAlltheMenuLinks(dataTable);

    }

}
