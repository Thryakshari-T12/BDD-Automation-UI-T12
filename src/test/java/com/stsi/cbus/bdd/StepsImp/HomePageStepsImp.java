package com.stsi.cbus.bdd.StepsImp;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.HomePage;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

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


    public void clickOnLeftMenuIcon(String menuIcon) throws InterruptedException {

        Thread.sleep(2000);

        homePage.returnWebElement(menuIcon).click();

    }

    public void validatePersonalDetails() throws InterruptedException {

        Thread.sleep(2000);
        Assert.assertTrue(homePage.personalDetailsheadder.isDisplayed());
    }

    public void enterPersonalDetailsAndClickOnSaveButton(){

        Actions actions = new Actions(webdriver);

        actions.moveToElement(homePage.firstNameInputField)
                .click(homePage.firstNameInputField)
                .sendKeys(Keys.TAB)
                .sendKeys("Petet")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("MICKEY")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("9834729837948")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("YES")
                .build()
                .perform();


    }


}
