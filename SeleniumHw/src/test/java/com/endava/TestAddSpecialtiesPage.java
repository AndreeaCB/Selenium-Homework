package com.endava;

import org.junit.Test;

public class TestAddSpecialtiesPage extends TestBase {
    public AddSpecialtiesPage addSpecialty;
    public MenuPage menu;
    public EditSpecialtiesPage editSpecialty;

    @Test
    public void addSpecialtyTest(){
        menu = new MenuPage(webDr);
        menu.clickSpecialities();
        addSpecialty = new AddSpecialtiesPage(webDr);
        addSpecialty.clickAdd();
        addSpecialty.completeFieldSpecial(webDr);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void updateSpecialtyTest(){
        menu = new MenuPage(webDr);
        menu.clickSpecialities();
        addSpecialty = new AddSpecialtiesPage(webDr);
        //searching for the edit button related to "Another new Specialty" element
        addSpecialty.editSpecialtyList("Another new Specialty");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //clearing the field in order to add another Specialty element
        addSpecialty.clearField(webDr);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //updating the name field
        editSpecialty = new EditSpecialtiesPage(webDr);
        editSpecialty.completeUpdateFields();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deleteSpecialtyTest(){
        menu = new MenuPage(webDr);
        menu.clickSpecialities();
        addSpecialty = new AddSpecialtiesPage(webDr);
        //searching for the delete button related to "Another new Specialty" element
        addSpecialty.deleteSpecialtyList("ortopedy");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
