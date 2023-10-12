package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CricketVideosPage {
	
	@FindBy (xpath="(//div[@class='_3UnJoe5cHtOh3q0zTEfCDh'])[4]")
	private WebElement  cricketMatchVideo;
 
	private WebDriver driver;

	//constructor
	
	public CricketVideosPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void clickOnCricketMatchVideo()
	{
		Actions act=new Actions(driver);
		
		act.moveToElement(cricketMatchVideo).click().perform();
	}
	

}
