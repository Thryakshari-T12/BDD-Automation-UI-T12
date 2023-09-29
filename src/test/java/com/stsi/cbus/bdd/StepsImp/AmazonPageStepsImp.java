package com.stsi.cbus.bdd.StepsImp;

import com.stsi.cbus.bdd.BrowerControls.BasePageSetup;
import com.stsi.cbus.bdd.Pages.AmazonPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

}
