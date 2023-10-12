package testpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.StarPlusShows;
import pages.TvPage;

public class StratPlusTvShowTestClass {
	
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	driver.manage().window().maximize();
	
	
	HomePage _homepage = new HomePage(driver);
	_homepage.clickOnTvButton();
	
	
    TvPage _tvPage = new TvPage (driver);
	_tvPage.clickStarPlusSection();
			
    StarPlusShows _starPlusShows = new StarPlusShows(driver);
    _starPlusShows.clickOnvideoInStarPlusSection();
    _starPlusShows.clickOnwatchNowButton();
    
    
    
}
}