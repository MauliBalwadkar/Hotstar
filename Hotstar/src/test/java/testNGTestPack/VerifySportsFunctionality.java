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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Base.BrowserLaunch;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AsiaCupSection;
import pages.CricketVideosPage;
import pages.FootballVideos;
import pages.HomePage;
import pages.PremierLeaguePage;
import pages.SportsPage;

public class VerifySportsFunctionality extends BrowserLaunch{
	
	private WebDriver driver;
	private HomePage _homepage;
	private SportsPage _sportsPage;
	private CricketVideosPage _cricketVideosPage;
	private PremierLeaguePage _premierLeaguePage;
	private FootballVideos  _footballVideos;
	private AsiaCupSection _asiaCupSection;
	
	@Parameters ("browser")
	@BeforeTest
	public void launchBrowser (String browserName)
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
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
	}
	
	
	@BeforeClass
	public void createPOMPObject()
	{
		_homepage = new HomePage(driver);
		_sportsPage = new SportsPage(driver);
		_cricketVideosPage = new CricketVideosPage(driver);
		_premierLeaguePage=new PremierLeaguePage(driver);
		_footballVideos=new  FootballVideos(driver);
		_asiaCupSection = new AsiaCupSection(driver);
		
	}
	
	@BeforeMethod
	public void openSportsSection()
	{
		driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
		_homepage.clickOnSportsButton();
	}
	
	@Test (priority = 1)
	public void verifyCricketFunctionality()
	{
		_sportsPage.clickOnCricketSection();
		
		_cricketVideosPage.clickOnCricketMatchVideo();
	}
	
	@Test (priority=2)
	public void verifyFootBallFunctionality()
	{
		_sportsPage.clickOnFootbalSection();
		_premierLeaguePage.clickOnPremierLeagueLink();
		_footballVideos.clickOnFootballVideo();
	}
	
	@Test (priority=3)
	public void verifyAsiaCupFunctonality()
	{
		_sportsPage.clickOnTopReplaysSection();
		_asiaCupSection.clickOnAsiaCupVideo();
	}	
		
	@AfterClass
	public void clearObject()
	{
		_homepage = null;
		_sportsPage = null;
		_cricketVideosPage = null;
		_premierLeaguePage = null;
		_footballVideos = null;
		_asiaCupSection  = null;
	}
	
	
	@AfterTest
	public void closeTheBrowser()
	{
		
		driver.quit();
		driver = null;
		System.gc();
	}
		
		
		
	}


