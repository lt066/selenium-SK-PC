package Post_try;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialize_test {
	
	  public WebDriver driver0;
	  public String baseUrl;
	  public String seller_uanme;
	  public String passwd;
	  
	  public Initialize_test(String baseUrl,String seller_uanme,String passwd)
	  {
		  this.baseUrl = baseUrl;
		  this.seller_uanme = seller_uanme;
		  this.passwd = passwd;
	  }

	  public WebDriver setUp(){
		System.setProperty("webdriver.chrome.driver","C:/Users/lt/AppData/Local/Google/Chrome/Application/chromedriver.exe");
		driver0 = new ChromeDriver();
//		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//		driver = new FirefoxDriver();
	    
	    baseUrl = "http://www.sk.com";
	    driver0.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver0.get(baseUrl + "/");	  
	    driver0.findElement(By.linkText("µÇÂ¼")).click();
	    driver0.findElement(By.id("J_userName")).clear();
	    driver0.findElement(By.id("J_userName")).sendKeys(seller_uanme);
	    driver0.findElement(By.id("J_pwd")).clear();
	    driver0.findElement(By.id("J_pwd")).sendKeys(passwd);
	    driver0.findElement(By.id("J_submit")).click();
	    driver0.findElement(By.cssSelector("b.no2")).click();
//	    driver.get("user.sk6.com/seller/tryings/add_try_pay/2023074");
	    driver0.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    
	    return driver0;
	  }
	
}
