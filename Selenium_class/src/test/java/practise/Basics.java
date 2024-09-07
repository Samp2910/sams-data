package practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basics {

	public static void main(String[] args) {
		
		// to launch the browser, we have to create the object.
		
		WebDriver driver = new EdgeDriver();
		
		// there are some methods present in webdriver interface.
		// 1. get method - to hit url/website
		
		driver.get("https://www.amazon.in/");
		
		// 2. getTitle - to capture the title of current webpage in console
		
		driver.getTitle();
		
		// 3. getCurrentUrl - to capture url of current webpage in console.
		
		driver.getCurrentUrl();
		
		// 4. get page source - to capture source code (html)
		
		driver.getPageSource();
		
		// 5. find element - use to identify web element
		
		driver.findElement(null);
		
		// 6. close - to close the window/webpage
		// driver.close();

		// 7. quit - to close multiple tabs at a time
		 // driver.quit();

		// 8. get windows handle - to capture parent (main) window id. in console (alphanumeric).
		driver.getWindowHandle();
		
		// 9. switch to - to switch from one window to another window
		driver.switchTo();
		
		// 10. navigate - to navigate the page (i.e. back, forward, refresh, url, etc)
        driver.navigate().refresh();
        
        // 11. manage - used to manage the window (e.g. maximize, minimize, etc)
        driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
