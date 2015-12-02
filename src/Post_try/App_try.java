package Post_try;



import java.util.List;
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


public class App_try {
  public WebDriver driver;
  public String baseUrl;
  public boolean acceptNextAlert = true;
  public StringBuffer verificationErrors = new StringBuffer();
  public String try_title="地毯app活动-11/25-";
  public String start_time1="11:00";
  public String end_time1="14:00";
  public String start_time2="14:00";
  public String end_time2="15:00";
  public String start_time3="15:00";
  public String end_time3="16:00";
  public String start_time4="16:00";
  public String end_time4="17:00";
  public String start_time5="17:00";
  public String end_time5="18:00";
  public String start_time6="18:00";
  public String end_time6="19:00";
  public String start_time7="19:00";
  public String end_time7="20:00";
  public String start_time8="21:00";
  public String end_time8="22:00";
  
  public String[] step = {"选择地毯","打开淘宝首页","搜索“地毯”"};
  public String[] stepUrl = {"http://m.taobao.com","http://s.m.taobao.com/h5?q=%E5%9C%B0%E6%AF%AF&search=%E6%8F%90%E4%BA%A4","https://detail.m.tmall.com/item.htm?spm=0.0.0.0.qmRO1N&id=521470708082&sid=74cd19a32a7eb2cc25562c2d15de4564&rn=459d0aef6976903d54d6fc0505b43b7e&abtest=11"};
 

  public int j=1;
  public int try_number=0+j;
  public boolean joided_buyer_limits = true;
  public int is_change_type = 1;
  
  
  @Before
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:/Users/lt/AppData/Local/Google/Chrome/Application/chromedriver.exe");
	driver = new ChromeDriver();
//	System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//	driver = new FirefoxDriver();
    
    baseUrl = "http://www.sk.com";
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    driver.get(baseUrl + "/");	  
    driver.findElement(By.linkText("登录")).click();
    driver.findElement(By.id("J_userName")).clear();
    driver.findElement(By.id("J_userName")).sendKeys("zxczxc");
    driver.findElement(By.id("J_pwd")).clear();
    driver.findElement(By.id("J_pwd")).sendKeys("zxc123");
    driver.findElement(By.id("J_submit")).click();
    driver.findElement(By.cssSelector("b.no2")).click();
//    driver.get("user.sk6.com/seller/tryings/add_try_pay/2023074");
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
  }

  @Test
  public void testWebtest1() throws Exception {

    
    //发布活动
    for(;j<=try_number;j++)
    {
    	String try_title_1=try_title+j;
    	if(is_change_type ==0 )
    	{
          driver.findElement(By.linkText("发布试用活动")).click();
          driver.findElement(By.id("rdTypeApp")).click();
          driver.findElement(By.id("buyRequire")).sendKeys(step[0]);
    	}

         driver.findElement(By.id("rdTm")).click();

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
         driver.findElement(By.id("Price")).sendKeys("0.01");
         driver.findElement(By.id("DateNum_app")).sendKeys("3");
         
         //设定活动时段
         //时段1
         driver.findElement(By.name("quantity_section[0][start_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(start_time1);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[0][end_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(end_time1);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[0][quantity]")).sendKeys("10");

         //时段二.
         driver.findElement(By.className("add")).click();
         driver.findElement(By.name("quantity_section[1][start_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(start_time2);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[1][end_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(end_time2);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[1][quantity]")).sendKeys("9");

         //时段三
         driver.findElement(By.className("add")).click();
         driver.findElement(By.name("quantity_section[2][start_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(start_time3);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[2][end_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(end_time3);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[2][quantity]")).sendKeys("14");
         
         //时段四
         driver.findElement(By.className("add")).click();
         driver.findElement(By.name("quantity_section[3][start_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(start_time4);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[3][end_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(end_time4);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[3][quantity]")).sendKeys("8");
         
         //时段五
         driver.findElement(By.className("add")).click();
         driver.findElement(By.name("quantity_section[4][start_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(start_time5);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[4][end_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(end_time5);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[4][quantity]")).sendKeys("8");
         
         //时段6
         driver.findElement(By.className("add")).click();
         driver.findElement(By.name("quantity_section[5][start_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(start_time6);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[5][end_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(end_time6);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[5][quantity]")).sendKeys("9");
         
         //时段7
         driver.findElement(By.className("add")).click();
         driver.findElement(By.name("quantity_section[6][start_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(start_time7);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[6][end_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(end_time7);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[6][quantity]")).sendKeys("14");
         
         //时段8
         driver.findElement(By.className("add")).click();
         driver.findElement(By.name("quantity_section[7][start_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(start_time8);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[7][end_time]")).click();
         new Select(driver.findElement(By.id("timeSelectSingle_a"))).selectByVisibleText(end_time8);
         driver.findElement(By.id("timeSelectSingle_btn")).click();
         driver.findElement(By.name("quantity_section[7][quantity]")).sendKeys("9");
         

         driver.findElement(By.id("mobile_step_one")).sendKeys(step[1]);
         driver.findElement(By.id("mobile_step_one_href")).sendKeys(stepUrl[0]);
         driver.findElement(By.id("mobile_step_two")).sendKeys(step[2]);
         driver.findElement(By.id("mobile_step_two_href")).sendKeys(stepUrl[1]);
         driver.findElement(By.id("mobile_step_order_href")).sendKeys(stepUrl[2]);
         
         if(is_change_type == 1)
             driver.findElement(By.id("app_Require")).sendKeys(step[0]);
         
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
              Process process2=Runtime.getRuntime().exec("E:/Autolt/selectimg1.exe");
              process2.waitFor();
         }

              driver.findElement(By.id("btnSubmit")).click();
              while(true)
              {
            	  if(driver.getCurrentUrl().contains("add_try_pay"))
            		  	break;
              }

              
              //支付担保金
 
    }
     

//    driver.findElement(By.xpath("//input[@id='password' and @type='password']"));
    //上线活动
//    apply_try();
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
 	 driver.findElement(By.id("rdTypeApp")).click();
      driver.findElement(By.id("DateNum_app")).clear();
      driver.findElement(By.id("Title")).clear();
      driver.findElement(By.id("Price")).clear();
      driver.findElement(By.id("mobile_step_one")).clear();
      driver.findElement(By.id("mobile_step_one_href")).clear();
      driver.findElement(By.id("mobile_step_two")).clear();
      driver.findElement(By.id("mobile_step_two_href")).clear();
      driver.findElement(By.id("mobile_step_order_href")).clear();
      List<WebElement>  list = driver.findElements(By.xpath("//span[contains(text(),'删除')]"));
      
      if(list.size()>1)
      {
    	  int j = list.size();
    	  for(;j>1;j--)
    		  driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div/form/div[3]/ul/li[8]/div/div/div[1]/p[1]/span["+j+"]")).click();
    		  
      }
		
	}
  
}
 