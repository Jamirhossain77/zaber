package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ForumPage {
WebDriver dr;

public ForumPage(WebDriver dr) {
	this.dr=dr;
	PageFactory.initElements(dr,this);
	}

public InterviewPage ClickOnInterviewQuestion() {
	
	
	return new InterviewPage(dr);
}



}
