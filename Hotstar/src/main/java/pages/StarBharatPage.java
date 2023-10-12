package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StarBharatPage {

	@FindBy (xpath="(//img[@decoding=\"async\"])[2]")
	private WebElement videoInStarBharat;
	
	@FindBy (xpath= "//span[text()='Watch Now']")
	private WebElement watchNowButton;
	
	private WebDriver driver;
	
	public StarBharatPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	public void clickOnvideoInStarBharatSection()
	{
		Actions action = new Actions (driver);
		action.moveToElement(videoInStarBharat).click().perform();
	}
	public void clickOnwatchNowButton()
	{
		Actions action = new Actions (driver);
		action.moveToElement(watchNowButton).click().perform();
	}
}