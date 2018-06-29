package rashi.gmail;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login1 { 
	
		WebDriver driver;
		
		public Login1(WebDriver driver) {
			
			this.driver=driver;
			
			
		}
		
		private WebElement getUsertext() {
			return this.driver.findElement(By.id("username"));
		}
		
		private WebElement getUserPassword() {
			return this.driver.findElement(By.id("password"));
		}
	
		
		
		private void EnterDetails(String username, String password) {
			getUsertext().clear();
			getUsertext().sendKeys(username);
			getUserPassword().clear();
			getUserPassword().sendKeys(password);
			getUsertext().submit();
		
		}
		
		public Inbox Valid_Crendentials(String username, String password) {
			EnterDetails(username, password);
			return new Inbox(driver);
		}
		
		
		

	}
	