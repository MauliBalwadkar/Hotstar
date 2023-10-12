package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AsiaCupSection {


	@FindBy (xpath="(//div[@class='_3UnJoe5cHtOh3q0zTEfCDh'])[4]")
	private WebElement  asiaCupVideo;
 
	private WebDriver driver;

	//constructor
	
	public AsiaCupSection(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void clickOnAsiaCupVideo()
	{
		driver.navigate().refresh();
		Actions act=new Actions(driver);
		
		act.moveToElement(asiaCupVideo).click().perform();
	}
}
