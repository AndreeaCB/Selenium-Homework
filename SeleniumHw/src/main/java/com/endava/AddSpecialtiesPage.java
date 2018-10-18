package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AddSpecialtiesPage {
    private WebElement addSpecialty;
    private List<WebElement> specialtiesList;
    private List<WebElement> editList;
    private List<WebElement>deleteList;
    private WebElement addField;
    private WebElement saveFieldButton;

    public AddSpecialtiesPage(WebDriver webDr){
        addSpecialty = webDr.findElement(By.xpath("//button[contains(text(),'Add')]"));
        specialtiesList = webDr.findElements(By.xpath("//table/tbody/tr/td[1]"));
        editList = webDr.findElements(By.xpath("//button[contains(text(),'Edit')]"));
        deleteList = webDr.findElements(By.xpath("//button[contains(text(),'Delete')]"));
    }
    public void completeFieldSpecial(WebDriver webDr){
        addField = webDr.findElement(By.id("name"));
        saveFieldButton =webDr.findElement(By.xpath("//button[contains(text(),'Save')]"));
        addField.sendKeys("Another new Specialty");
        saveFieldButton.click();
    }
    public List<WebElement> petList() {
        return specialtiesList;
    }

    public List<WebElement> editList() {
        return editList;
    }

    public List<WebElement> deleteList() {
        return deleteList;
    }

    public void clickAdd(){
        addSpecialty.click();
    }

    public void editSpecialtyList(String specialtyName) {
        int poz = -1;
        for(int i = 0;i < specialtiesList.size(); i++) {
            if (specialtyName.equals(specialtiesList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value"))) {
                poz=i;
            }
        }
        editList.get(poz).click();
        //System.out.println(poz);
    }
    public void clearField(WebDriver webDr){
        addField = webDr.findElement(By.id("name"));
        addField.clear();
    }

//    public void deleteSpecialtyList(String specialtyName){
//        int poz = -1;
//        for(int i = 0;i < specialtiesList.size(); i++) {
//            if (specialtyName.equals(specialtiesList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value"))) {
//                poz=i;
//            }
//        }
//        deleteList.get(poz).click();
//    }
    public void deleteSpecialtyList(String specialtyName) {
        //int poz = -1;
        List<Integer> myList = new ArrayList<Integer>();

        for (int i = 0; i < specialtiesList.size(); i++) {
            if (specialtyName.equals(specialtiesList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value"))) {
                myList.add(i);
            }
        }
        for (int i = 0; i < myList.size(); i++) {
            //System.out.println(myList.get(myList.get(i)));
            deleteList.get(myList.get(i)).click();
        }
    }
}
