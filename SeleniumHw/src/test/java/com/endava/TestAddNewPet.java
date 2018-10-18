package com.endava;

import org.junit.Test;

public class TestAddNewPet extends  TestBase{
    public AddNewPet addPet;
    public MenuPage menu;
    public EditPetPage editPet;

    @Test
    public void AddAndUpdatePetTest(){
        menu = new MenuPage(webDr);
        menu.clickPetTypes();
        addPet = new AddNewPet(webDr);
        addPet.clickAdd();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //adding new pet
        addPet.completeField(webDr);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //searching for the edit button where the element "Calut de Mare" is situated and clicks on it
        addPet = new AddNewPet(webDr);
        addPet.editPetList("Calut de Mare");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //clearing the field in order to add another name
        addPet.clearField(webDr);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //updating the name field
        editPet = new EditPetPage(webDr);
        editPet.completeUpdate();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void deletePetTest(){
        menu = new MenuPage(webDr);
        menu.clickPetTypes();
        addPet = new AddNewPet(webDr);

        //searching for the delete button related to "Calut de Mare Nou" element
        addPet = new AddNewPet(webDr);
        addPet.deletePetList("Calut Mare Update");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void goHomeTest(){
        menu = new MenuPage(webDr);
        menu.clickPetTypes();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        addPet = new AddNewPet(webDr);
        addPet.homeButtonClick(webDr);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
