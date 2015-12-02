package Buser;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;



import org.openqa.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

public class Report_edit {
	public WebDriver driver;
	public String baseUrl;
	public int b;
	public String try_title = "天猫手淘搜索活动-0";
	public String buname = "user170"; 
	
	@Before
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/lt/AppData/Local/Google/Chrome/Application/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		baseUrl="http://www.sk.com";
	}

	@Test
	public void edit() throws Exception
	{
		driver.get(baseUrl);
	    driver.findElement(By.linkText("登录")).click();
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("J_userName")).clear();
	    driver.findElement(By.id("J_userName")).sendKeys(buname);
	    driver.findElement(By.id("J_pwd")).clear();
	    driver.findElement(By.id("J_pwd")).sendKeys("zxc123");
	    driver.findElement(By.id("J_submit")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("我的联盟")).click();
	    driver.findElement(By.id("a_try")).click();
	    
        b=sql_que(try_title,buname);
        System.out.println(b);
        String text ="//a[contains(@href,'"+b+"')  and contains(text(),'写试用报告')]";
        System.out.println(text);
	    driver.findElement(By.xpath(text)).click();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	  //Store the current window handle     
//	    String winHandleBefore = driver.getWindowHandle();     
//	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);             
	    //Switch to new window opened


	    while(true)
	    {
	    	
		    String[] handles = new String[driver.getWindowHandles().size()];
	    	if(handles.length<=1)
	    		continue;
	    	else
	    	{

	            for(String winHandle : driver.getWindowHandles())
	            {     
	                System.out.println("+++" + winHandle);     
	                driver.switchTo().window(winHandle);
	        	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            } 
	            break;
	    	}
	            
	    }
	    // Close the original window     
//	    driver.switchTo().window(winHandleBefore);     
	    
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.findElement(By.id("report-title")).clear();
	    driver.findElement(By.id("report-title")).sendKeys("selenium测试报告标题-11/25");
	    driver.findElement(By.xpath("//div[@id='degreeStart']/i[5]")).click();
	    WebElement framel=driver.findElement(By.className("ke-edit-iframe"));
	    driver.switchTo().frame(framel);
	    driver.findElement(By.className("ke-content")).clear();
	    driver.findElement(By.className("ke-content")).sendKeys("非常好的宝贝，值得收藏，值得购买,希望支持");
        driver.switchTo().defaultContent();
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	    //体验过程图片与评语
            driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[7]/div[2]/div[1]/div/object")).click();
            Process process=Runtime.getRuntime().exec("E:/Autolt/a.exe");
            process.waitFor();
            
            Actions action = new Actions(driver);
            action.sendKeys("13");
            
      	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[7]/div[2]/div[2]/ul/li[1]/div[2]/textarea")).sendKeys("宝贝很好，值得收藏，性价比高");
    
            
            driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[7]/div[2]/div[1]/div/object")).click();
            Process process1=Runtime.getRuntime().exec("E:/Autolt/b.exe");
            process1.waitFor();
            
//            Actions action1 = new Actions(driver);
            action.sendKeys("13");
            
    	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[7]/div[2]/div[2]/ul/li[2]/div[2]/textarea")).sendKeys("商家很好说话，值得收藏，性价比高");

    	    
            driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[7]/div[2]/div[1]/div/object")).click();
            Process process2=Runtime.getRuntime().exec("E:/Autolt/c.exe");
            process2.waitFor();
            
//            Actions action2 = new Actions(driver);
            action.sendKeys("13");
            
    	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	    driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[7]/div[2]/div[2]/ul/li[3]/div[2]/textarea")).sendKeys("下次就去商家那里买东东了，值得收藏，性价比高");

        
        
        
        //细节展示图片与评语
              driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
              driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[8]/div[2]/div[1]/div/object")).click();
              Process process3=Runtime.getRuntime().exec("E:/Autolt/a.exe");
              process3.waitFor();
              
//              Actions action3 = new Actions(driver);
              action.sendKeys("13");
              
      	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
              driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[8]/div[2]/div[2]/ul/li[1]/div[2]/textarea")).sendKeys("无色差，做工好，值得收藏，性价比高");

      	    
              driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[8]/div[2]/div[1]/div/object")).click();
              Process process4=Runtime.getRuntime().exec("E:/Autolt/b.exe");
              process4.waitFor();
              
//              Actions action4 = new Actions(driver);
              action.sendKeys("13");
              
    	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	      driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[8]/div[2]/div[2]/ul/li[2]/div[2]/textarea")).sendKeys("与图片描述一致，值得收藏，性价比高");


	    
        
        //分享链接
        driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[9]/div[2]/div[1]/input")).sendKeys("http://www.douban.com/accounts/login?redir=http%3A//www.douban.com/people/134190207/status/1722198447/");
        driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[9]/div[2]/div[2]/input")).sendKeys("http://guang.taobao.com/detail/index.htm?spm=2013.1.0.0.ON6K65_0.0.0.0.xTOBPh&uid=522386761&sid=7540474486");
        driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[9]/div[2]/div[3]/input")).sendKeys("http://www.duitang.com/people/mblog/446978722/detail/");

        driver.findElement(By.id("submitone")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("/html/body/div[1]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[2]/td[2]/div/div/p[3]/a")).click();
	}
	
	  @After
	  public void tearDown() throws Exception {
	    driver.quit();

	  }
	  
	  public int sql_que(String try_title1,String buname)
	  {
		  int a = 0; 
		  try
		  {
	            //调用Class.forName()方法加载驱动程序
	            Class.forName("com.mysql.jdbc.Driver");
	            System.out.println("成功加载MySQL驱动！");
	      }
		  catch(ClassNotFoundException e)
		  {
	            System.out.println("找不到MySQL驱动!");
	            e.printStackTrace();
	      }
	        
	        String url="jdbc:mysql://192.168.0.207:3306/shikee";    //JDBC的URL    
	        //调用DriverManager对象的getConnection()方法，获得一个Connection对象
	        Connection conn;
	        try 
	        {
	            conn = DriverManager.getConnection(url,"root","JTr5nNUBwduNZfxw");
	            //创建一个Statement对象
	            Statement stmt = conn.createStatement(); //创建Statement对象
	            System.out.println("成功连接到数据库！");

	            String sql ="select jid from sk_join where title='"+try_title1+"' and buyer_uname = '"+buname+"'" ;
	             //要执行的SQL
	            //String sql1 = sql0.concat(try_title);
	            System.out.println(sql);
	            ResultSet rs = stmt.executeQuery(sql);
	            if(rs.next())
	                 {
	                      a=rs.getInt(1);
	                 }
	         
	       }
	        catch (SQLException e)
	        {
	            e.printStackTrace();
	        }
	        System.out.println(a);
	        return a;
	  }
	  
	  public boolean isFind ()
	  {
		    try
		        {
			        driver.findElement(By.className("close-ad"));
			        return true;
			    }
			    catch(Exception e)
			    {
				    return false;
			    }
	  }
}
