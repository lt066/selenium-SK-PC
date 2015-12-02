package Login_moblie;




import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class login_mobiles {
	  public WebDriver driver;
	  public String baseUrl;
	  @Before
	  public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:/Users/lt/AppData/Local/Google/Chrome/Application/chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//		driver = new FirefoxDriver();
	    
	    baseUrl = "http://www.sk.com";
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testWebtest1() throws Exception {
		String[] mobiles={"15055884621","15120077721","15278987656","15399656685","15454654654","15577196173",
				"15679846545","15777147138","15896588555","15986589655",
				"13077661163","13155624789","13784456132","13356982365",
				"13471158384","13589658965","13658958658","13737737533",
				"13807807727","13988995688","17056155621","17744444444",
				"18074908409","18156235623","18277101111","18356235623",
				"18476769653","18507710818","18677061580","18777164651","18878777515","18977982266"};
	    driver.get(baseUrl + "/");	  
	    driver.findElement(By.linkText("登录")).click();
	    driver.findElement(By.id("J_userName")).clear();
	    driver.findElement(By.id("J_userName")).sendKeys(mobiles[0]);
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("J_pwd")).clear();
	    driver.findElement(By.id("J_pwd")).sendKeys("17744444444");
	    driver.findElement(By.id("J_submit")).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    String error_text0=driver.findElement(By.className("login-msg-error-ico")).getText();
	    System.out.println(error_text0);
	    if(error_text0.equals("请输入验证码！"))
	    	need_code(mobiles);
	    
	    else
	    	natural(mobiles);
//	        need_code(mobiles);
	  }
	  public void need_code(String[] date1)
	  {
		    for(int i=0;i<32;i++)
		    {
		         driver.findElement(By.id("J_userName")).clear();
		         driver.findElement(By.id("J_userName")).sendKeys(date1[i]);
		         driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		         driver.findElement(By.id("J_pwd")).clear();
		         driver.findElement(By.id("J_pwd")).sendKeys("17744444444");
	    	     driver.findElement(By.id("J_authCode")).clear();
	    	     driver.findElement(By.id("J_authCode")).sendKeys("adcs");
	    	     driver.findElement(By.id("J_submit")).click();
	    	     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    	     String error_text=driver.findElement(By.className("login-msg-error-ico")).getText();
	    		 System.out.println(error_text);
	    	          if(error_text.equals("此账号不存在，请重新输入！"))
	    	          {
	    	    	      System.out.println("判断存在的手机号失败");
	    	          }
	    	              else if(error_text.equals("密码错误，请重新输入！"))
	    	          {
	    	    	      continue;
	    	          }
//	    	              else
//	    	              {
//	    	            	  System.out.println(date1[i]);
//	    	            	  break;
//	    	              }
		    }
	  }
	  
	  public void natural(String[] date1)
	  {
		    for(int i=0;i<32;i++)
		    {
		         driver.findElement(By.id("J_userName")).clear();
		         driver.findElement(By.id("J_userName")).sendKeys(date1[i]);
		         driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		         driver.findElement(By.id("J_pwd")).clear();
		         driver.findElement(By.id("J_pwd")).sendKeys("17744444444");
	    	     driver.findElement(By.id("J_submit")).click();
	    	     driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    	     String error_text=driver.findElement(By.className("login-msg-error-ico")).getText();
	    	     
	    		    System.out.println(error_text);
	    	          if(error_text.equals("此账号不存在，请重新输入！"))
	    	          {
	    	    	      System.out.println("判断存在的手机号失败");
	    	          }
	    	              else if(error_text.equals("密码错误，请重新输入！"))
	    	          {
	    	    	      continue;
	    	          }
	    	              else
	    	              {
	    	            	  System.out.println(date1[i]);
	    	            	  break;
	    	              }
	    	            	  

		    }
	  }
	  
	  @After
	  public void tearDown() throws Exception {
//	    driver.quit();

	  }
}
