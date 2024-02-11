package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EntrataHomePO {

	WebDriver driver2;
	By confirmCookies= By.id("rcc-confirm-button");
	By hoverProducts= By.xpath("(//div[@class='main-nav-link'])[1]");
	By hoverPropertyM= By.xpath("(//a[@class='fat-nav-header'])[1]");
	By clickBI= By.xpath("(//a[@class='fat-nav-header'])[1]");
	
	public EntrataHomePO(WebDriver dr)
	{
		driver2= dr;
	}
	public void Confirm_Cookies()
	{
		driver2.findElement(confirmCookies).click();
	}
	
	/*
	 * public WebElement Hover_Products() {
	 * 
	 * driver2.findElement(By.xpath("(//div[@class='main-nav-link'])[1]")); Actions
	 * act = new Actions(driver2); act.moveToElement(e).perform(); return
	 * driver2.findElement(hoverProducts); }
	 */
	/*
	 * public void HoverProperty()
	 * 
	 * { driver2.findElement(hoverPropertyM).getText(); }
	 */
	public void ClickBI()
	{
		driver2.findElement(clickBI).click();
	}
}
