
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath="(//span[@class='LHDmaByQeS8uy1wgLgxz_'])[6]")
	private WebElement sportsButton;
	
	@FindBy(xpath="(//span[@class='LHDmaByQeS8uy1wgLgxz_'])[4]")
	private WebElement tvButton;
	
	@FindBy(xpath="(//span[@class='LHDmaByQeS8uy1wgLgxz_'])[5]")
	private WebElement moviesButton;
	
	@FindBy (xpath="//span[text()='Home']")
	private WebElement homeButton;
	
	
	private WebDriver driver;
	
	private Actions action;
	//constructor
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		action=new Actions(driver);
	}
	
	//methods
	
	public void clickOnSportsButton()
	{
		
		action.moveToElement(sportsButton).click().perform();
		
	}
	
	public void clickOnTvButton()
	{
     
		
		action.moveToElement(tvButton).click().perform();
	}
	
	public void clickOnMoviesButton()
	{
		action.moveToElement(moviesButton).click().perform();
	}
	
	public void clickOnHomeButton()
	{
		homeButton.click();
	}

}
