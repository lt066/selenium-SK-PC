package Post_try;



import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//手淘搜索活动
public class TaoSearch_try {

	
	  public WebDriver driver;
	  public String baseUrl;
	  public boolean acceptNextAlert = true;
	  public StringBuffer verificationErrors = new StringBuffer();
	  public int j=1;
	  public int try_number=0+j;
	  public String try_title = "天猫手淘搜索活动-";
	  public String order_url = "https://detail.m.tmall.com/item.htm?spm=0.0.0.0.qmRO1N&id=521470708082&sid=74cd19a32a7eb2cc25562c2d15de4564&rn=459d0aef6976903d54d6fc0505b43b7e&abtest=11";
	  public String shopname = "雅帝旗舰店";
	  public String key_one = "地毯";
 	  public String key_two = "销量优先";
	  public boolean joided_buyer_limits = false;
	  public int is_change_type = 1;
	
	  
	  @Before
	  public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:/Users/lt/AppData/Local/Google/Chrome/Application/chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//		driver = new FirefoxDriver();
	    
	    baseUrl = "http://www.sk4.com";
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    driver.get(baseUrl + "/");	  
	    driver.findElement(By.linkText("登录")).click();
	    driver.findElement(By.id("J_userName")).clear();
	    driver.findElement(By.id("J_userName")).sendKeys("suser002");
	    driver.findElement(By.id("J_pwd")).clear();
	    driver.findElement(By.id("J_pwd")).sendKeys("zxc123");
	    driver.findElement(By.id("J_submit")).click();
	    driver.findElement(By.cssSelector("b.no2")).click();
//	    driver.get("user.sk6.com/seller/tryings/add_try_pay/2023074");
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	  }
	  
	  @Test
	  public void testWebtest1() throws Exception {

	    
	    
	    //发布活动
	    for(;j<=try_number;j++)
	    {
	    	String try_title_1=try_title+j;
	    	if(is_change_type == 0)
	    	{
		         driver.findElement(By.linkText("发布试用活动")).click();
		         driver.findElement(By.id("rdTypeTaoSearch")).click();
		         driver.findElement(By.id("buyRequire")).sendKeys("随意试用品信息"); 
	    	}

	         driver.findElement(By.id("rdTm")).click();
	         driver.findElement(By.id("DateNum")).sendKeys("10");
	         driver.findElement(By.id("rbTk2")).click();
	         driver.findElement(By.id("Title")).sendKeys(try_title_1);
	         new Select(driver.findElement(By.id("cate_cid"))).selectByVisibleText("--- 裙子");
	         WebElement im1 = driver.findElement(By.id("uploadify"));
	         im1.click();
	         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	         Process process=Runtime.getRuntime().exec("E:/Autolt/f.exe");
	         process.waitFor();
	         Actions action = new Actions(driver);
	         action.sendKeys("13");
	    //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	         driver.findElement(By.id("GrantNum")).sendKeys("50");
	         driver.findElement(By.id("Price")).sendKeys("0.01");
	         driver.findElement(By.id("url_order")).sendKeys(order_url);
	         driver.findElement(By.id("shopname")).sendKeys(shopname);

	         driver.findElement(By.id("mobile_tao_one")).sendKeys(key_one); 
	         driver.findElement(By.id("mobile_tao_two")).sendKeys(key_two); 


	         if(joided_buyer_limits)
		         driver.findElement(By.id("buyer-limits")).click();

	         driver.findElement(By.id("uploadify2")).click();
	         driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	         Process process1=Runtime.getRuntime().exec("E:/Autolt/g.exe");
	         process1.waitFor();
	         action.sendKeys("13");
	         Actions action1 = new Actions(driver);
	         action1.sendKeys("13");
	         boolean d = wait1();
	         while(d)
	         {
	    	      driver.findElement(By.id("uploadify2")).click();
	              Process process2=Runtime.getRuntime().exec("E:/Autolt/g.exe");
	              process2.waitFor();
	         }

	         driver.findElement(By.id("btnSubmit")).click();
             while(true)
             {
           	  if(driver.getCurrentUrl().contains("add_try_pay"))
           		  	break;
             }

	    }
	  }
	    
	    @After
	    public void tearDown() throws Exception {
	      driver.quit();
	      String verificationErrorString = verificationErrors.toString();
	      if (!"".equals(verificationErrorString)) {
	        fail(verificationErrorString);
	      }
	    }
	    
	    public boolean wait1()
	    {
	  	  try
	  	  {
	  		  driver.findElement(By.className("onError"));
	  		  
	  		  return true;
	  	  }
	  	  catch(NoSuchElementException e)
	  	  {

	  		  return false;
	  	  }
	    }
	    
	    public void clear(){
	    	 driver.findElement(By.id("rdTypeTaoSearch")).click();
	         driver.findElement(By.id("DateNum")).clear();
	         driver.findElement(By.id("Title")).clear();
	         driver.findElement(By.id("GrantNum")).clear();
	         driver.findElement(By.id("Price")).clear();
	         driver.findElement(By.id("url_order")).clear();
	         driver.findElement(By.id("shopname")).clear();
//	         driver.findElement(By.id("buyRequire")).clear();
	         driver.findElement(By.id("mobile_tao_one")).clear();
	         driver.findElement(By.id("mobile_tao_two")).clear();
			
		}
	
}
