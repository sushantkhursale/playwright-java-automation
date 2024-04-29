package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LeaderboardPage;

public class LeaderboardTests extends BaseTest {
	
	@Test
	public void selectDuration() {
		LeaderboardPage leaderboardPage = new LeaderboardPage(homePage.getPage());
		leaderboardPage.selectLeaderboardDuration("Month");
	}

}
