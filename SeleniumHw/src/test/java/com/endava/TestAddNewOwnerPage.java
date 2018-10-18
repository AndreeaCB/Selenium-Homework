package com.endava;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestAddNewOwnerPage extends TestBase {

    public OwnersPage allOwners;
    public MenuPage menu;
    public AddNewOwnerPage addOwn;
    WebDriverWait wait;


    //adding a new owner with wrong characters in the telephone field
    @Test
    public void FormAddOwnerTest(){
        menu = new MenuPage(webDr);
        menu.clickOwners();
        menu.clickAll();
        allOwners= new OwnersPage(webDr);
        allOwners.clickButton();
        addOwn = new AddNewOwnerPage(webDr);
        addOwn.completeForm();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //error message for telepgone field -> characters not numbers
    @Test
    public void errorMessTest(){
        menu = new MenuPage(webDr);
        menu.clickOwners();
        menu.clickAll();
        allOwners= new OwnersPage(webDr);
        allOwners.clickButton();
        addOwn = new AddNewOwnerPage(webDr);
        Assert.assertTrue(addOwn.msgErr(webDr));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //delete the wrong characters and submit the form for adding owner
    @Test
    public void deleteSaveTest(){
        menu = new MenuPage(webDr);
        menu.clickOwners();
        menu.clickAll();
        allOwners= new OwnersPage(webDr);
        allOwners.clickButton();
        addOwn = new AddNewOwnerPage(webDr);
        addOwn.completeForm();
        addOwn.deleteCharacterTel();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        addOwn.clickAddOwnBtn();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    //checks if it goes on the Owners Page trying to search for Harold
//        wait = new WebDriverWait(webDr, 5000);
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ownerFullName")));
        allOwners = new OwnersPage(webDr);
        Assert.assertTrue(allOwners.getOwnersList("Harold Davis"));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
