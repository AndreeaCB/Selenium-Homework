package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddNewVetPage {

    private WebElement firstNameVet;
    private WebElement lastNameVet;
    private WebElement typeVet;
    private WebElement typeVetSelection1;
    private WebElement typeVetSelection2;
    private WebElement typeVetSelection3;
    private WebElement saveButtonVet;

    public AddNewVetPage(WebDriver webDr){
        firstNameVet = webDr.findElement(By.id("firstName"));
        lastNameVet = webDr.findElement(By.id("lastName"));
        typeVet = webDr.findElement(By.id("specialties"));
        typeVetSelection1 = webDr.findElement(By.xpath("//option[@value= \"0: Object\"]"));
        typeVetSelection2 = webDr.findElement(By.xpath("//option[@value= \"1: Object\"]"));
        typeVetSelection3 = webDr.findElement(By.xpath("//option[@value= \"2: Object\"]"));
        saveButtonVet = webDr.findElement(By.xpath("//button[contains(text(),'Save Vet')]"));
    }
    public void clickSaveVet(){
        saveButtonVet.submit();
    }

    public void completeFormVet(){
        firstNameVet.sendKeys("Andreea Test");
        lastNameVet.sendKeys("Test Andreea");
    }
    public void chooseType1(){
        typeVetSelection1.click();
    }
    public void chooseType2(){
        typeVetSelection2.click();
    }
    public void chooseType3(){
        typeVetSelection3.click();
    }

}
