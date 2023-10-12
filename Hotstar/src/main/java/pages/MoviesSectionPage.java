package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoviesSectionPage {
	
	@FindBy (xpath="//h2[text()='Popular Movies']")
	private WebElement popularMovies;
	
	@FindBy (xpath="//h2[text()='Pixar Movies']")
	private WebElement pixarMovies;
	
	
	private WebDriver driver;
	
	private Actions action;
	
	//constructor
		public MoviesSectionPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver = driver;
			action=new Actions(driver);
		}
		
		public void clickOnPopularMovies()
		{
			JavascriptExecutor _javascriptExecutor = (JavascriptExecutor)driver;
			 _javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",popularMovies );
		
			 action.moveToElement(popularMovies).click().perform();
		}
	
		public void clickOnPixarMovies()
		{
			JavascriptExecutor _javascriptExecutor = (JavascriptExecutor)driver;
			 _javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)",pixarMovies );
		
			 action.moveToElement(pixarMovies).click().perform();
		}

}
