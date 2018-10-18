package com.endava;

import org.junit.Assert;
import org.junit.Test;

public class TestVeterinariansPage extends TestBase {

    public MenuPage menu;
    public VeterinariansPage vets;
    public EditVetPage editVet;

    @Test
    public void editVetTest(){
        menu = new MenuPage(webDr);
        menu.clickVeterinarians();
        menu.clickAllVets();
        vets = new VeterinariansPage(webDr);
        vets.editVetsList("Simo Stanciu");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        editVet = new EditVetPage(webDr);
        editVet.editFields();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        editVet.clickType(webDr);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        editVet.clickSelection1();
        editVet.clickSelection3();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        editVet.saveButton();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    //assumption that the element is in the tabel and deletes it. after that it checks if it is still in the tabel
    @Test
    public void deleteVetsListTest(){
        menu = new MenuPage(webDr);
        menu.clickVeterinarians();
        menu.clickAllVets();
        vets = new VeterinariansPage(webDr);
        vets.deleteVetsList("Simo Stanciu");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //check if the deleted element is still in the tabel
        vets = new VeterinariansPage(webDr);
        Assert.assertFalse(vets.searchForVet("Simo Stanciu"));

    }
}
