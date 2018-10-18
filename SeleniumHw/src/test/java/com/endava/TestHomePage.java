package com.endava;

import org.junit.Assert;
import org.junit.Test;

public class TestHomePage extends TestBase {
    public HomePage home;
    public OwnersPage all;
    public MenuPage menu;
    public AddNewOwnerPage addOwn;

    @Test
    public void homeSuccessTest(){
        home = new HomePage(webDr);
        home.isHomeTitle();
        home.isHeaderTitle();
        home.isImage();
        Assert.assertTrue("in case of error", home.isHomeTitle());
        Assert.assertTrue("in case of error", home.isHeaderTitle());
        Assert.assertTrue("in case of error", home.isImage());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }




}
