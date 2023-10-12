package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PremierLeaguePage {

	@FindBy (xpath="//h2[@title='Premier League 2023/24']")
	private WebElement premierLeagueLink;
	
	private WebDriver driver;
	
	public PremierLeaguePage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
		this.driver=driver;
	}
	
	public void clickOnPremierLeagueLink()
	{
		Actions act=new Actions(driver);
		act.moveToElement(premierLeagueLink).click().perform();
	}
	
}
