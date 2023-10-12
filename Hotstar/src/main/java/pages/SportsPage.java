package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportsPage {
	
	@FindBy(xpath="//img[@alt='Football']")
	 private WebElement footballSection;
	
	@FindBy (xpath="(//div[contains(@class,'_3HPUeVARpLs_XmMk1c07bN')])[1]")
	private WebElement cricketSection; 
	  
	@FindBy (xpath="//h2[text()='Asia Cup']")
	private WebElement asiaCupSection;
	
	 private WebDriver driver;
	 private Actions action;
	
	public SportsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		action = new Actions(driver);
	}
	
	public void clickOnFootbalSection()
	{
		//Actions act=new Actions(driver);
		
		action.moveToElement(footballSection).click().perform();
	}
	
	public void clickOnCricketSection()
	{
		action.moveToElement(cricketSection).click().perform();
	}
	
	public void clickOnTopReplaysSection()
	{
//		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
//		javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", asiaCupSection);
		
		 asiaCupSection.click();
	}
	
	
	
	
	

}
