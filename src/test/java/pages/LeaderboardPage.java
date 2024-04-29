package pages;

import com.microsoft.playwright.Page;

public class LeaderboardPage {
	
	private Page page;

	public LeaderboardPage(Page page) {
		this.page = page;
	}
	
	public void selectLeaderboardDuration(String option) {
		
		page.locator("//div[@class='profile-content-container']//div[text()='"+option+"']").click();
		
	}
	
	

}
