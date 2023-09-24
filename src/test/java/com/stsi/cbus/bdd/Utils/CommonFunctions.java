package com.stsi.cbus.bdd.Utils;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CommonFunctions extends BasePageSetup {


    public static void SelectValueFromDropDown(List<WebElement> list, String ExpectedValue) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println("+++++++++++++++++" + list.get(i).getText());
            if (list.get(i).getText().trim().equals(ExpectedValue)) {
                list.get(i).click();
                break;

            }
        }
    }





}
