package testpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.MoviesSectionPage;

public class PopularMoviesTestClass {
		
		public static void main(String[] args) {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
			driver.manage().window().maximize();
			
			
			HomePage _homepage = new HomePage(driver);
			_homepage.clickOnMoviesButton();
			
			MoviesSectionPage _moviesSectionPage = new MoviesSectionPage(driver);
			_moviesSectionPage.clickOnPopularMovies();
			
			MoviesSectionPage _moviesSectionPage1 = new MoviesSectionPage(driver);
			_moviesSectionPage.clickOnPixarMovies();
			
		}
	
}
