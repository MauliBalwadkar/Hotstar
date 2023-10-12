package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FootballVideos {

		@FindBy (xpath="(//div[@class='_3UnJoe5cHtOh3q0zTEfCDh'])[4]")
		private WebElement  footballMatchVideo;
     
		private WebDriver driver;

		//constructor
		
		public FootballVideos(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
			this.driver=driver;
		}
		
		public void clickOnFootballVideo()
		 {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(4));
			Actions act=new Actions(driver);
			act.moveToElement(footballMatchVideo).click().perform();
		 }
		
}


//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
//PremierLeaguePage _premierLeaguePage=new PremierLeaguePage(driver);
//WebElement premierLeagueLink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@title='Premier League 2023/24']")));