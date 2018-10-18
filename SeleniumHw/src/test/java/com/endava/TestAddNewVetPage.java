package com.endava;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class TestAddNewVetPage extends TestBase {
    public MenuPage menu;
    public AddNewVetPage vet;

    //adding a new vet
    @Test
    public void addVetFormTest(){
        menu = new MenuPage(webDr);
        menu.clickVeterinarians();
        menu.ClickAddVet();
        vet = new AddNewVetPage(webDr);
        vet.completeFormVet();
        vet.chooseType1();
        vet.clickSaveVet();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //edit new vet

    @Test
    public void editVetTest(){
        menu = new MenuPage(webDr);
        menu.clickVeterinarians();
        menu.ClickAddVet();
        vet = new AddNewVetPage(webDr);
    }
}
