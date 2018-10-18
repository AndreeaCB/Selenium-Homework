package com.endava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewOwnerPage {

    private WebElement first_name;
    private WebElement last_name;
    private WebElement address;
    private WebElement city;
    private WebElement tel;
    private WebElement btn_add_own;
    private WebElement msg;


    public AddNewOwnerPage(WebDriver webDr){
        first_name= webDr.findElement(By.id("firstName"));
        last_name= webDr.findElement(By.id("lastName"));
        address= webDr.findElement(By.id("address"));
        city= webDr.findElement(By.id("city"));
        tel= webDr.findElement(By.id("telephone"));
       btn_add_own= webDr.findElement(By.xpath("//button[contains(text(),'Add Owner')]"));
    }

    public void completeForm(){
        first_name.sendKeys("Owner first name");
        last_name.sendKeys("Owner last name");
        address.sendKeys("Owner address");
        city.sendKeys("Owner city");
        tel.sendKeys("characters");
        //btn_add_own.submit();
    }

    public boolean msgErr(WebDriver webDr){
        tel.sendKeys("TelepghoneTest");
        msg= webDr.findElement(By.xpath("//span[contains(text(),'Phone number only accept digits')]"));
        return msg.isDisplayed();
    }


    public void deleteCharacterTel(){
        tel.clear();
        tel.sendKeys("123456789");
    }
    public void clickAddOwnBtn(){
        btn_add_own.submit();
    }

    public boolean checkForm(String firstName, String lastName, String address, String city, String tel){
        this.first_name.sendKeys(firstName);
        this.last_name.sendKeys(lastName);
        this.address.sendKeys(address);
        this.city.sendKeys(city);
        this.tel.sendKeys(tel);

        return true;
    }

}
