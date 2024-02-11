package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntrataDemoVideoPO {

	WebDriver driver2;
	By WatchDemo= By.xpath("//a[text()='Watch Demo']");
	By f_name= By.id("FirstName");
	By l_name= By.id("LastName");

	By g_mail= By.id("Email");

	By company= By.id("Company");

	By phone= By.id("Phone");

	By title= By.id("Title");

	
	public EntrataDemoVideoPO(WebDriver dr)
	{
		driver2= dr;
	}
	public void watch_demo() {
		driver2.findElement(WatchDemo).click();
	}
	public void first_nme(String name) {
		driver2.findElement(f_name).sendKeys(name);
	}
	public void last_nme(String name2) {
		driver2.findElement(l_name).sendKeys(name2);
	}
	public void mail(String gmail) {
		driver2.findElement(g_mail).sendKeys(gmail);
	}
	public void comp(String compny) {
		driver2.findElement(company).sendKeys(compny);
	}
	public void mob(String mobile) {
		driver2.findElement(phone).sendKeys(mobile);
	}
	public void titl_e(String titl) {
		driver2.findElement(title).sendKeys(titl);
	}
	
}
