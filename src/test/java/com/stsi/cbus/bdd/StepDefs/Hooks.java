package com.stsi.cbus.bdd.StepDefs;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.Duration;

public class Hooks extends BasePageSetup {

    @Before
    public void launchBrowser() throws Exception {
        initialization("Chrome");
        webdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @After
    public void quitBrowser() throws Exception {
        CloseBrowser();
    }
}


// @Before -- > Scenario1 -- > @After  -->@Before --> Scenario2 --> @After --> @Before --> Scenario3  --> @After