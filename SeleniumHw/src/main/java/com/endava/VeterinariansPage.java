package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class VeterinariansPage {

    private List<WebElement> vetList;
    WebDriverWait wait;
    private List<WebElement> edit_button_list;
    private List<WebElement> delete_button_list;


    public VeterinariansPage(WebDriver webDr) {
        wait = new WebDriverWait(webDr, 5000);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("vets")));
        vetList = webDr.findElements(By.xpath("//table/tbody/tr/td[1]"));
        edit_button_list = webDr.findElements(By.xpath("//button[contains(text(),'Edit')]"));
        delete_button_list = webDr.findElements(By.xpath("//button[contains(text(),'Delete')]"));
    }

    public List<WebElement> vetList() {
        return vetList;
    }

    public List<WebElement> edit_button_list() {
        return edit_button_list;
    }

    public List<WebElement> delete_button_list() {
        return delete_button_list;
    }

    public void editVetsList(String vetName) {
        int position = -1;
        List<String> textList = new ArrayList<String>();
        for (WebElement vet : vetList) {
            textList.add(vet.getText());
        }
        for (String nameVet : textList) {
            if (nameVet.equals(vetName)) {
                position = textList.indexOf(vetName);
            }
        }
        edit_button_list.get(position).click();
    }

    public void deleteVetsList(String vetName) {
        int position = -1;
        List<String> textList = new ArrayList<String>();
        for (WebElement vet : vetList) {
            textList.add(vet.getText());
        }
        for (String nameVet : textList) {
            if (nameVet.equals(vetName)) {
                position = textList.indexOf(vetName);
            }
        }
        delete_button_list.get(position).click();
    }

    public boolean searchForVet(String vetName) {
        List<String> textList = new ArrayList<String>();
        for (WebElement vet : vetList) {
            textList.add(vet.getText());
        }
//
        return textList.contains(vetName);
       // return false;
    }
}

