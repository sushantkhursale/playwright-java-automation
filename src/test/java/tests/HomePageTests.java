package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class HomePageTests extends BaseTest {

	
	@Test
	public void clickTopMenuTests() throws InterruptedException {
		homePage.clickTopMenuItem("Leaderboard");
		Thread.sleep(10000);
		
	}

}
