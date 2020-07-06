package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver dr;
@FindBy(id="username")WebElement username;
@FindBy(id="password")WebElement password;
@FindBy(xpath="//*[@id=\"login_button\"]")WebElement LoginButton;


public LoginPage(WebDriver dr) {
	this.dr=dr;
	PageFactory.initElements(dr,this);
	
	}
public ForumPage ClickOnForumButton() throws InterruptedException {
	Thread.sleep(3000);
	username.sendKeys("md.hossain@osaconsultingtech.com");
    password.sendKeys("6530Md1977");
	LoginButton.click();
	return new ForumPage(dr);

}
}
