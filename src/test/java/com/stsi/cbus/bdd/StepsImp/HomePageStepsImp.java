package com.stsi.cbus.bdd.StepsImp;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.HomePage;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

import java.util.List;

public class HomePageStepsImp extends BasePageSetup {

    public HomePage homePage;
    public HomePageStepsImp(){

        homePage= new HomePage();
    }


    public void validateAlltheMenuLinks(DataTable dataTable){

        List<String> list = dataTable.transpose().asList(String.class);

        for (int i=0; i< list.size(); i++){

            Assert.assertTrue(homePage.returnWebElement(list.get(i)).isDisplayed());
        }

    }
}
