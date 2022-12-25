package HomePage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountriesDropDown 
{
//	@FindBy(xpath="ul") private List<WebElement> countries;
//	
//	CountriesDropDown(WebDriver driver)
//	{
//		PageFactory.initElements(driver, this);
//	}
//	
//	public void selectCountry()
//	{
//		int Csize = countries.size();
//		System.out.println("Total number of countries : "+Csize);
//		countries.get(5).click();
//	}
	
	@Test
	public void c()
	{
		//System.setProperty("", null);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		String expTittle = "Facebook";
		String actTittle = driver.getTitle();
		Assert.assertEquals(expTittle, actTittle);
	}

}
