package practise;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
		//WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		
        driver.manage().window().maximize();
        
        
        
        driver.get("https://www.amazon.in/");
        driver.navigate().refresh();
		System.out.println(driver.getTitle());
		
		WebElement Searchbox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		Searchbox.click();
		Searchbox.sendKeys("Mobiles under 10,000");
		System.out.println(Searchbox.getAttribute("value"));
		driver.findElement(By.id("nav-search-submit-button")).click();		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.linkText("About Us")).click();
		
		js.executeScript("window.history.back()");
		driver.navigate().back();
		
		driver.navigate().forward();
		
		
		
		
		
		
		//driver.close();
		
		
		
		

	}

}
