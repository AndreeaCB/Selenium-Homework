package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EditSpecialtiesPage {
    private WebElement updateField;
    private WebElement updateButton;

    public EditSpecialtiesPage(WebDriver webDr){
        updateField = webDr.findElement(By.id("name"));
        updateButton = webDr.findElement(By.xpath("//button[contains(text(),'Update')]"));
    }
    public void completeUpdateFields(){
        updateField.sendKeys("Another Specialty updated");
        updateButton.click();
    }
}
