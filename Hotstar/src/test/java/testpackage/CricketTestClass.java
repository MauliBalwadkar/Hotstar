package testpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CricketVideosPage;
import pages.FootballVideos;
import pages.HomePage;
import pages.PremierLeaguePage;
import pages.SportsPage;

public class CricketTestClass {
	
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.manage().window().maximize();
		
		
		HomePage _homepage = new HomePage(driver);
		_homepage.clickOnSportsButton();
		
		SportsPage _sportsPage = new SportsPage(driver);
		_sportsPage.clickOnCricketSection();
		
		
		CricketVideosPage _cricketVideosPage = new CricketVideosPage(driver);
		_cricketVideosPage.clickOnCricketMatchVideo();
		
		
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
//		PremierLeaguePage _premierLeaguePage=new PremierLeaguePage(driver);
//		WebElement premierLeagueLink=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@title='Premier League 2023/24']")));
		
		
		
		
		
		
	}

}
