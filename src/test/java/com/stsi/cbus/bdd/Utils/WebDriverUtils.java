package com.stsi.cbus.bdd.Utils;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebDriverUtils extends BasePageSetup {

    public static void waitforElementTobeVisible(WebElement element){
        new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitforAllElementsTobeVisible(List<WebElement> element){
        new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElements(element));

    }

    public static void waitforelementToBeClickable(WebElement element){
        new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void sendKeys(WebElement webelement, String text){
        webelement.clear();
        webelement.sendKeys(text);

    }


    public static void waitforElementTobeVisible(String xpath, String substring){
        String elementxpath = String.format(xpath,substring);
        new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpath)));
    }


    public static void jsClick(WebElement element){

        JavascriptExecutor executor = (JavascriptExecutor)webdriver;
        executor.executeScript("arguments[0].click();", element);

    }



    public static void jsSendKeys(WebElement element, String text ){

        JavascriptExecutor js = (JavascriptExecutor) webdriver;
        js.executeScript("arguments[0].value='"+text+"'", element);
    }


    public static void actionsClick(WebElement element){

        Actions actions= new Actions(webdriver);
        actions.moveToElement(element)
                .click(element)
                .build()
                .perform();


    }


    public static WebElement returnWebElement(String locator, String str){
        String elementxpath = String.format(locator,str);
        new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpath)));
        return webdriver.findElement(By.xpath(elementxpath));
    }

    public static List<WebElement> returnListOfWebElements(String locator, String str) throws InterruptedException {
        String elementxpath = String.format(locator,str);
        Thread.sleep(3000);
        new WebDriverWait(webdriver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(elementxpath)));
        return webdriver.findElements(By.xpath(elementxpath));
    }



public static void scrollIntoView(WebElement element){

    JavascriptExecutor js = (JavascriptExecutor) webdriver;
    js.executeScript("arguments[0].scrollIntoView(true);",element);
}


}
