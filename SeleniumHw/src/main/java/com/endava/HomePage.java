package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebElement home_title;
    private WebElement header_title;
    private WebElement image;

    public HomePage(WebDriver webDr){
        home_title = webDr.findElement(By.xpath("//h1[contains(text(),'Welcome to Petclinic')]"));
        header_title = webDr.findElement(By.xpath("//h2[contains(text(),'Welcome')]"));
        image = webDr.findElement(By.className("img-responsive"));
    }

    public boolean isHomeTitle(){
        return home_title.isDisplayed();
    }

    public boolean isHeaderTitle(){
        return header_title.isDisplayed();
    }
    public boolean isImage(){
        return image.isDisplayed();
    }

}
