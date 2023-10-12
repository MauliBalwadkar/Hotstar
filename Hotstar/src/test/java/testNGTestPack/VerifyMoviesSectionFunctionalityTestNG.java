package testNGTestPack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BrowserLaunch;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.MoviesSectionPage;

public class VerifyMoviesSectionFunctionalityTestNG extends BrowserLaunch{
	
	private WebDriver driver;
	private HomePage _homepage;
	private MoviesSectionPage _moviesSectionPage;
	
	
	@BeforeTest
	public void launchBrowser(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			driver=launchChrome();
		}
		if(browserName.equals("Edge"))
		{
			
			driver=launchEdge();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}
	@BeforeClass
	public void createPomObject()
	{
		_homepage = new HomePage(driver);
		_moviesSectionPage = new MoviesSectionPage(driver);
		
	}

	
	@BeforeMethod
	public void openTheApplication()
	{
		driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
		_homepage.clickOnMoviesButton();
	}
	
	@Test
	public void verifyPopularMoviesSection()
	{
		_moviesSectionPage.clickOnPopularMovies();
	}
	
//	@Test
//	public void verifyPixarMoviesSection()
//	{
//		MoviesSectionPage _moviesSectionPage = new MoviesSectionPage(driver);
//		_moviesSectionPage.clickOnPixarMovies();
//	}
//	
//	@AfterMethod
//	public void goBackToMoviesSection()
//	{
//		driver.navigate().back();
//	}
	
	@AfterClass
	public void clearObject()
	{
		_homepage = null;
		_moviesSectionPage = null;
		
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		driver = null;
		System.gc();
	}

}
