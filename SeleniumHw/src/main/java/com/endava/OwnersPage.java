package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.ArrayList;

    public class OwnersPage {
        private List<WebElement> ownersList;
        WebDriverWait wait;
        private WebElement add_button;


    public OwnersPage(WebDriver webDr){
        wait = new WebDriverWait(webDr, 5000);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ownerFullName")));
        ownersList = webDr.findElements(By.className("ownerFullName"));
        add_button =webDr.findElement(By.xpath("//button[contains(text(),'Add Owner')]"));
    }

    public List<WebElement> ownersList(){

        return ownersList;
    }

    public boolean getOwnersList(String ownerName){
        List<String> textList = new ArrayList<String>();
        for(WebElement we : ownersList()){
            //System.out.println(we.getText());
            textList.add(we.getText());
        }

        return textList.contains(ownerName);
    }
    public void clickButton(){
        add_button.click();
    }

//        public boolean getLastInsertion(){
//            List<String> textList = new ArrayList<String>();
//            for(WebElement we : ownersList){
//                textList.add(we.getText());
//            }
//            String e= textList.get(textList.size()-1);
//            for (String smth : textList){
//                if(smth.equals(e)){
//                    return true;
//                }
//            }
//            return  false;
//        }


}
