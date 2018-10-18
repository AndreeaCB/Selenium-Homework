package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AddNewPet {
    private WebElement addPetButton;
    private List<WebElement> petList;
    private List<WebElement> editList;
    private List<WebElement>deleteList;
    private WebElement addField;
    private WebElement saveFieldButton;
    private WebElement homeButton;

    public AddNewPet(WebDriver webDr) {
        addPetButton = webDr.findElement(By.xpath("//button[contains(text(),'Add')]"));
        petList = webDr.findElements(By.xpath("//table/tbody/tr/td[1]"));
        editList = webDr.findElements(By.xpath("//button[contains(text(),'Edit')]"));
        deleteList = webDr.findElements(By.xpath("//button[contains(text(),'Delete')]"));

    }

    public void completeField(WebDriver webDr){
        addField = webDr.findElement(By.id("name"));
        saveFieldButton =webDr.findElement(By.xpath("//button[contains(text(),'Save')]"));
        addField.sendKeys("Calut de Mare Nou");
        saveFieldButton.click();
    }
    public List<WebElement> petList() {
        return petList;
    }

    public List<WebElement> editList() {
        return editList;
    }

    public List<WebElement> deleteList() {
        return deleteList;
    }

    public void clickAdd(){
        addPetButton.click();
    }

    public void editPetList(String petName) {
        int poz = -1;
            for(int i = 0;i < petList.size(); i++) {
                if (petName.equals(petList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value"))) {
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

    public void deletePetList(String petName) {
        //int poz = -1;
        List<Integer> myList = new ArrayList<Integer>();

        for (int i = 0; i < petList.size(); i++) {
            if (petName.equals(petList.get(i).findElement(By.id(String.valueOf(i))).getAttribute("value"))) {
                myList.add(i);
            }
        }
        for (int i = 0; i < myList.size(); i++) {
            //System.out.println(myList.get(myList.get(i)));
            deleteList.get(myList.get(i)).click();
        }
    }
    public void homeButtonClick(WebDriver webDr){
        homeButton = webDr.findElement(By.xpath("//button[contains(text(),'Home')]"));
        homeButton.click();
    }

}
