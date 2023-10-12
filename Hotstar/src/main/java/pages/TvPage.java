package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TvPage {

	@FindBy (xpath="//h2[text()='StarPlus Shows']")
	private WebElement starPlusSection;
	
	@FindBy (xpath="//h2[text()='Star Bharat Shows']")
	private WebElement starBharatSection;
	
	private WebDriver driver;
	
	private Actions action;
	
	
	public TvPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		action= new Actions(this.driver);
	}
	
	public void clickStarPlusSection()
	{
		 JavascriptExecutor _javascriptExecutor = (JavascriptExecutor)driver;
		 _javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",starPlusSection );
		 _javascriptExecutor.executeScript("window.scrollBy(0,-100)");
		 action.moveToElement(starPlusSection).click().perform();
	}
	
	public void clickOnStarBharatSection()
	{
		 JavascriptExecutor _javascriptExecutor = (JavascriptExecutor)driver;
		 _javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",starBharatSection );
		action.moveToElement(starBharatSection).click().perform();
	}
	
	
	
	
	
}
