package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class HomePage {
	
	protected Page page;

	private String postsLocator = "div[class^=uYoEFfcPW_usdw8Nxwwt]";
	private String topMenuLocator = ".navbarList-item a";
	
	public HomePage(Page page) {
		this.page = page;
	}
	
	public void clickTopMenuItem(String menuItemName) {
		
		Locator elementsOnTop = page.locator(topMenuLocator);
		elementsOnTop.first().waitFor();
		for(int i=0;i< elementsOnTop.count();i++) {
			if(elementsOnTop.nth(i).textContent().equals(menuItemName)) {
				elementsOnTop.nth(i).click();
			}
		}
		page.waitForLoadState();
		System.out.println("clicked on desired element");	
	}
	
	public Page getPage() {
		return page;
	}

	public boolean isFirstPostDisplayed(){
		return getPage().locator(postsLocator).first().isVisible();
	}


}
