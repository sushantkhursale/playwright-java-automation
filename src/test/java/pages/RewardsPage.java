package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class RewardsPage {
	
	private Page page;
	
	private String merchandiseNames = "div.Qb4tmiZLRH15iKImnDrU";

	public RewardsPage(Page page) {
		this.page = page;
	}
	
	
	public void getAllAvailableRewards() {
		Locator allRewards = page.locator(merchandiseNames);
		allRewards.last().waitFor();
		for(int i=0;i<allRewards.count();i++) {
			System.out.println(allRewards.nth(i).textContent());
		}
	}
	

}
