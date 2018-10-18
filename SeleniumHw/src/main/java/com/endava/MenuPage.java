package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuPage {
    private WebElement home;
    private WebElement owners;
    private WebElement veterinarians;
    private WebElement pet_types;
    private WebElement specialities;
    private WebElement all;
    private WebElement add_button;
    private WebElement addNewVet;
    private WebElement allVets;

    public MenuPage(WebDriver webDr){

        home = webDr.findElement(By.xpath("//span[text()='Home']"));
        owners = webDr.findElement(By.xpath("//a[text()='Owners']"));
        veterinarians = webDr.findElement(By.xpath("//a[text()='Veterinarians']"));
        pet_types =webDr.findElement(By.linkText("PET TYPES"));
        specialities =webDr.findElement(By.linkText("SPECIALTIES"));
        all =webDr.findElement(By.xpath("(//span[contains(text(),'All')])[1]"));
        addNewVet = webDr.findElement(By.xpath("(//span[text()=' Add New'])[2]"));
        allVets =webDr.findElement(By.xpath("(//span[contains(text(),'All')])[2]"));

    }

    public void clickHome(){
        home.click();
    }

    public void clickOwners(){
        owners.click();
    }

    public void clickVeterinarians(){
        veterinarians.click();
    }

    public void clickPetTypes(){
        pet_types.click();
    }
    public void clickSpecialities(){
        specialities.click();
    }

    public  void clickAll(){
        all.click();
    }

    public void ClickAddVet(){
        addNewVet.click();
    }
    public void clickAllVets(){
        allVets.click();
    }

}

