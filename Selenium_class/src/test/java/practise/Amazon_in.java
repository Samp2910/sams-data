package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_in {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new EdgeDriver();                           // - launch Edge browser
		
		driver.manage().window().maximize();                            // - window maximized
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));              // - globally declared implicit wait
		
		driver.get("https://www.amazon.in/");                          // - hit url of amazon.in
		System.out.println(driver.getTitle());                         // - to get title of webpage 
		
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();     // - go to register page
		
		driver.navigate().back();                                       // - return to main page
		
		WebElement searchbar = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));     // - searchbar elememt - assign as local variable
		
		searchbar.click();                                            // - to click searchbar
		searchbar.sendKeys("Mobiles under 15000");                    // - to enter text in searchbox
		
		driver.findElement(By.id("nav-search-submit-button")).click();  // - to click on search button
		
		Thread.sleep(5000);                                            // extends time 5 sec to load webpage
		
		
		
		
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
