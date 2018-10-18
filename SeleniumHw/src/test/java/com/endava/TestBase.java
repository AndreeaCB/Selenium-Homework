package com.endava;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver webDr;

    @Before
    public void init(){
        webDr = new ChromeDriver();//ii spunem cu ce browser sa lucreze
        webDr.get("http://bhdtest.endava.com/petclinic/welcome");
        webDr.manage().window().maximize();//browser maximizat
        webDr.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(){
        webDr.quit();
    }

}
