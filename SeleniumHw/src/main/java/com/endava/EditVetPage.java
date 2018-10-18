package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditVetPage {
    private WebElement firstNameEdit;
    private WebElement lastNameEdit;
    private WebElement typeVetEdit;
    private WebElement typeVetSelection1Edit;
    private WebElement typeVetSelection2Edit;
    private WebElement typeVetSelection3Edit;
    private WebElement saveVetButton;

    public EditVetPage(WebDriver webDr){
        firstNameEdit = webDr.findElement(By.id("firstName"));
        lastNameEdit = webDr.findElement(By.id("lastName"));
        typeVetEdit = webDr.findElement(By.xpath("(//*[contains(@class, 'mat-select-value')])[2]"));
        //typeVetEdit= webDr.findElement(By.className("mat-input-flex mat-form-field-flex"));

        saveVetButton = webDr.findElement(By.xpath("//button[contains(text(),'Save Vet')]"));
    }

    public void editFields(){
        firstNameEdit.clear();
        lastNameEdit.clear();
        firstNameEdit.sendKeys("First Name Something new");
        lastNameEdit.sendKeys("Last Name Something new");
    }
    public void clickType(WebDriver webDr){
        typeVetEdit.click();
        typeVetSelection1Edit = webDr.findElement(By.xpath("(//*[contains(@class, 'mat-option-text')])[1]"));
        typeVetSelection2Edit = webDr.findElement(By.xpath("(//*[contains(@class, 'mat-option-text')])[2]"));
        typeVetSelection3Edit = webDr.findElement(By.xpath("(//*[contains(@class, 'mat-option-text')])[3]"));

    }

    public void clickSelection1(){
        typeVetSelection1Edit.click();

    }
    public void clickSelection2(){
        typeVetSelection2Edit.click();

    }
    public void clickSelection3(){
        typeVetSelection3Edit.click();
    }
    public void saveButton(){
        saveVetButton.submit();
        saveVetButton.submit();
    }
}
