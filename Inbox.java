package rashi.gmail;
import org.openqa.selenium.WebDriver;
public class Inbox {

	
		
		WebDriver driver;
		
		public Inbox(WebDriver driver) {
			this.driver=driver;
		}
		
		public boolean isloginpage() {
			return this.driver.getCurrentUrl().equals("https://webmail.qainfotech.com:8443/#1");
		}
		

	}


	