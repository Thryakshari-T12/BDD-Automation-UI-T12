package com.stsi.cbus.bdd.StepDefs;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.StepsImp.AmazonPageStepsImp;
import com.stsi.cbus.bdd.StepsImp.HomePageStepsImp;
import io.cucumber.java.en.Given;

public class AmazonPageSteps  extends BasePageSetup {

    public AmazonPageStepsImp amazonPageStepsImp;

    public AmazonPageSteps(){
        amazonPageStepsImp =  new AmazonPageStepsImp();

    }


    @Given("I Navigate to Amazon URL")
    public void i_Navigate_to_Amazon_URL(){

        webdriver.get("https://www.amazon.in/");

    }

    @Given("I Validate Broken Links in the Web Page")
    public void i_Validate_Broken_Links_in_the_Web_Page(){

        amazonPageStepsImp.validatebrokenLinks();

    }


}
