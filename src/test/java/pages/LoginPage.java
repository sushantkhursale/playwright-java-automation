package pages;

import java.util.concurrent.TimeUnit;

import com.microsoft.playwright.Page;

public class LoginPage {
	
	private Page page;
	
	// 1. String Locators
	private String loginButtonIframe = "//iframe[@title=\"Sign in with Google Button\"]";
	private String loginButton = "div span:nth-of-type(1)";
	private String usernameLocator = "#identifierId";
	private String passwordLocator = "input[type=\"password\"]";
	private String nextButton = "//span[text()='Next']";
	
	
	// 2. page constructor:
	public LoginPage(Page page) {
		this.page = page;
	}
	
	// 3. page actions/methods:
	public String getLoginPageTitle() {
		return page.title();
	}
	
	public void clickLoginButton() throws InterruptedException {
//		Page loginPopup = page.waitForPopup(() ->{
//			page.frameLocator(loginButtonIframe).locator("div span:nth-of-type(1)").click();
//		});
//		
//		this.page = loginPopup;
//		page.waitForLoadState();
//		System.out.println(page.title());	
	}
	
	public Page enterCredentials(String username,String password) {
		Page loginPopup = page.waitForPopup(() ->{
			page.frameLocator(loginButtonIframe).locator(loginButton).click();
		});
		
		loginPopup.locator(usernameLocator).fill(username);
		loginPopup.locator(nextButton).click();
		loginPopup.locator(passwordLocator).fill(password);
		loginPopup.locator(nextButton).click();
		
		
		page.waitForLoadState();
		return page;
		
	}
	
	

}
