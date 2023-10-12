package testpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AsiaCupSection;
import pages.HomePage;
import pages.SportsPage;

public class AsiaCupTestClass {
public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com/in/home?ref=%2Fin");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.manage().window().maximize();
		
		
		HomePage _homepage = new HomePage(driver);
		_homepage.clickOnSportsButton();
		
		SportsPage _sportsPage = new SportsPage(driver);
		_sportsPage.clickOnTopReplaysSection();
		
		AsiaCupSection _asiaCupSection = new AsiaCupSection(driver);
		_asiaCupSection.clickOnAsiaCupVideo();
		
		
}

}
