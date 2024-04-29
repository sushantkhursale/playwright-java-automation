package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.RewardsPage;

public class RewardsTests extends BaseTest{
	
	@Test
	public void getAllMerchandise() {
		RewardsPage rewardsPage = new RewardsPage(homePage.getPage());
		homePage.clickTopMenuItem("Rewards");
		rewardsPage.getAllAvailableRewards();
	}

}
