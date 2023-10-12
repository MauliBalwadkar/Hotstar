package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StarPlusShows {

	@FindBy (xpath="(//div[@data-testid='hs-image'])[1]")
	private WebElement videoInStarPlusSection;
	
	@FindBy (xpath= "//span[text()='Watch Now']")
	private WebElement watchNowButton;
	
	private WebDriver driver;
	
	public StarPlusShows(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	public void clickOnvideoInStarPlusSection()
	{
		Actions action = new Actions (driver);
		action.moveToElement(videoInStarPlusSection).click().perform();
	}
	public void clickOnwatchNowButton()
	{
		Actions action = new Actions (driver);
		action.moveToElement(watchNowButton).click().perform();
	}
	
	
	
	
	
}
