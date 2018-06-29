package rashi.gmail;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Gmailtest1 {
	 WebDriver driver;
	 Login1 login1;
	String user;
	String pass;
	public Gmailtest1()throws FileNotFoundException, IOException
	{
		Properties prop=new Properties();
		prop.load(new FileInputStream("db.properties"));
		user= prop.getProperty("username");
		pass=prop.getProperty("password");
		
	}
	 
	 @BeforeClass
	 public void launch() throws FileNotFoundException, IOException{
			System.setProperty("webdriver.chrome.driver","C:/rashi/chromedriver/chromedriver.exe");
			driver = (WebDriver)new ChromeDriver();
			driver.get("https://webmail.qainfotech.com:8443/#1");
			login1 = new Login1(driver);
			}
	 @Test
	 public void Correct_credientials_test() {	 
		 driver.findElement(By.id("username")).sendKeys(user);
		 driver.findElement(By.id("password")).sendKeys(pass);

         driver.findElement(By.className("ZLoginButton")).click();
	 }
	   
}