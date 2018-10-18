package com.endava;

import org.junit.Assert;
import org.junit.Test;

public class TestOwnersPage extends TestBase{
    public OwnersPage allOwners;
    public MenuPage menu;

    //check if the owner is present
    @Test
    public void ownerSuccessTest(){
        menu = new MenuPage(webDr);
        menu.clickOwners();
        menu.clickAll();
        allOwners = new OwnersPage(webDr);
        Assert.assertTrue(allOwners.getOwnersList("Harold Davis"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //clicking the ADD OWNER button from the Owners Page
    @Test
    public void AddOwnerTest(){
        menu = new MenuPage(webDr);
        menu.clickOwners();
        menu.clickAll();
        allOwners= new OwnersPage(webDr);
        allOwners.clickButton();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //going through the whole table of owners and checking if there is the added owner
    @Test
    public void deleteSaveCheckTest(){
        String firstName = "Owner first name";
        String lastName = "Owner last name";

        menu = new MenuPage(webDr);
        menu.clickOwners();
        menu.clickAll();
        allOwners= new OwnersPage(webDr);

        Assert.assertTrue(allOwners.getOwnersList(firstName+" "+lastName));
    }

}
