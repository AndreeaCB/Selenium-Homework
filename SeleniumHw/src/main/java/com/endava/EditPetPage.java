package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditPetPage {
    private WebElement updateField;
    private WebElement updateButton;

    public EditPetPage(WebDriver webDr){
        updateField = webDr.findElement(By.id("name"));
        updateButton = webDr.findElement(By.xpath("//button[contains(text(),'Update')]"));
    }
    public void completeUpdate(){
        updateField.sendKeys("Calut Mare Update");
        updateButton.click();
    }
}
