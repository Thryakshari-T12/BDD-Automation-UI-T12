package com.stsi.cbus.bdd.StepsImp;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.AmazonPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;


public class AmazonPageStepsImp extends BasePageSetup {

    public AmazonPage amazonPage;
    public AmazonPageStepsImp(){

        amazonPage= new AmazonPage();
    }


    public void validatebrokenLinks(){

        System.out.println("(+++++++++++++++++++++++++++++++++++)");
        List<WebElement> links = webdriver.findElements(By.tagName("a"));

        System.out.println(links.size());
        List<WebElement> activeLinks = new LinkedList<>();

        for(int i=0; i<links.size();i++){

            if(links.get(i).getAttribute("href")!=null){

                activeLinks.add(links.get(i));
            }
        }

        System.out.println(activeLinks.size());

        for(int i=0; i<activeLinks.size();i++){

            try {

                 if(!activeLinks.get(i).getAttribute("href").contains("javascript")){

                     HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(i).getAttribute("href")).openConnection();

                     connection.connect();

                     int resp = connection.getResponseCode();
                     String responseMessage = connection.getResponseMessage();

                     System.out.println(activeLinks.get(i).getAttribute("href") + "==>>" + resp + "==>>" + responseMessage);

                 }

            }catch (Exception e){

                e.printStackTrace();
            }

        }

    }



    public void scrollaPage() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) webdriver;

       for (int i=0; i<10; i++){

           Thread.sleep(1000);
           js.executeScript("window.scrollBy(0, 500)");
       }


        for (int i=0; i<10; i++){

            Thread.sleep(1000);
            js.executeScript("window.scrollBy(0, -500)");
        }
        Thread.sleep(1000);
        js.executeScript("arguments[0].scrollIntoView();",amazonPage.gettoKnowUsLink);
    }


    public void takeScreenshotOfApage() throws IOException {

        TakesScreenshot ts = (TakesScreenshot) webdriver;

        File file = ts.getScreenshotAs((OutputType.FILE));

       FileHandler.copy(file,new File("/Users/thryakshari/Documents/BDD-Automation-UI-T12/src/test/resources/amazon.png"));


    }


    public void performDragAndDrop() throws InterruptedException {

        Thread.sleep(3000);

        webdriver.switchTo().frame(amazonPage.iframe);

        Actions actions = new Actions(webdriver);

//            actions.moveToElement(amazonPage.sourceElement)
//                    .clickAndHold(amazonPage.sourceElement)
//                    .moveToElement(amazonPage.targetElement)
//                    .release()
//                    .build()
//                    .perform();


        actions.dragAndDrop(amazonPage.sourceElement, amazonPage.targetElement)
                .build()
                .perform();


    }



}
