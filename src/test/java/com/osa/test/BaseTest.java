package com.osa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class BaseTest {
     WebDriver dr;

   @BeforeMethod
   public void OpenB() {
	System.setProperty("Webdriver.Chrome.driver","C:\\Users\\jamir\\Desktop\\chromedriver.exe");
	 dr=new ChromeDriver();	
	 dr.manage().window().maximize();
}
   
   @Test
   void add() {
	   
   }
}
