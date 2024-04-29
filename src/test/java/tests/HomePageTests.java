package tests;

import org.testng.annotations.Test;

import com.microsoft.playwright.Page;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import utilities.DataProviders;

public class HomePageTests extends BaseTest {


	/* Test to verify all top menu options are working fine
	 */
	@Test(dataProvider = "options",dataProviderClass = DataProviders.class)
	public void clickTopMenuTests(String option) throws InterruptedException {
		homePage.clickTopMenuItem(option);
	}

}
