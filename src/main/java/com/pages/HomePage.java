package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver dr;
	@FindBy(xpath="//*[@id=\"ftco-nav\"]/ul/li[7]/a")WebElement LoginButton;
	public HomePage(WebDriver dr) {
	this.dr=dr;	
		PageFactory.initElements(dr,this);	
		
	}
	
public void urlVarify() {
	dr.get("http://www.osaconsultingtech.com/");
	String expectedUrl="http://www.osaconsultingtech.com/";
	String actualUrl=dr.getCurrentUrl();
	if(expectedUrl.equals(actualUrl)) {
		System.out.println("pass");
		}
	else {
		System.out.println("fail");
	}
}	
public void titleVarify() {
	String expectedTitle="OSA Consulting Tech Corp || Best Available Resources For ...";
	String actualTitle=dr.getTitle();
	if(expectedTitle.equals(actualTitle)) {
	System.out.println(actualTitle);
	System.out.println("pass");
	}
}
public LoginPage ClickOnForumButton() {
	LoginButton.click();
	return new LoginPage(dr);
}
}
