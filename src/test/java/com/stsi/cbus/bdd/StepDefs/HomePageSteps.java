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

    @Then("I Click on {string} on the Lift side Menu Bar")
    public void i_Click_on_My_Info_on_the_Lift_side_Menu_Bar(String menuIcon) throws InterruptedException {

        homePageStepsImp.clickOnLeftMenuIcon(menuIcon);
    }

    @Then("I Validate Personal Details Header is displayed")
    public void i_Validate_Personal_Details_Header_is_displayed() throws InterruptedException {

            homePageStepsImp.validatePersonalDetails();
    }

    @Then("I enter all the Personal Details and click on Save Button")
    public void i_enter_all_the_Personal_Details_and_click_on_Save_Button() throws InterruptedException {

            homePageStepsImp.enterPersonalDetailsAndClickOnSaveButton();
    }




}
