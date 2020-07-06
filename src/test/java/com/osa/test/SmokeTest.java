package com.osa.test;


import org.testng.annotations.Test;
import com.pages.ForumPage;
import com.pages.HomePage;
import com.pages.LoginPage;
public class SmokeTest extends BaseTest {
	ForumPage fp;
    LoginPage lp;


    @Test
    public void Test() throws InterruptedException {
	
	HomePage hp =new HomePage(dr);
	hp.titleVarify();
	hp.urlVarify();
	lp=hp.ClickOnForumButton();
	fp=lp.ClickOnForumButton();

	
}	
    
    @Test
    void add() {}
	
	
	
}
