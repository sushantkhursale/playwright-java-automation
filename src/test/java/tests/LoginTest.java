package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;

import base.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void login() throws InterruptedException {
		Assert.assertEquals(homePage.getPage().title(),"Coditas Clap");
	}

}
