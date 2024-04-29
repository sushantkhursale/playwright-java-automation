package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;

import base.BaseTest;

public class LoginTest extends BaseTest {
	
	
	@Test
	public Page login() throws InterruptedException {
		System.out.println(loginPage.getLoginPageTitle());
		Assert.assertEquals(loginPage.getLoginPageTitle(), "Coditas Clap");		
		Page homePageObject = loginPage.enterCredentials("sushant.khursale@coditas.com","kpsk4@25395");
		homePageObject.waitForLoadState();
		System.out.println(homePageObject.title());
		return homePageObject;
		
	}

}
