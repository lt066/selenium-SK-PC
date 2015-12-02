package Buser;


import org.openqa.selenium.chrome.*;
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

public class Tro_edit {
	public WebDriver driver;
	public String baseUrl;
    public int b;
    public String try_title = "修订版规划 "; 
	
	@Before
	public void setUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/lt/AppData/Local/Google/Chrome/Application/chromedriver.exe");
		driver= new ChromeDriver();
		baseUrl="http://www.sk.com";
	}

	@Test
	public void edit() throws Exception
	{
		driver.get(baseUrl);
	    driver.findElement(By.linkText("登录")).click();
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("J_userName")).clear();
	    driver.findElement(By.id("J_userName")).sendKeys("user170");
	    driver.findElement(By.id("J_pwd")).clear();
	    driver.findElement(By.id("J_pwd")).sendKeys("zxc123");
	    driver.findElement(By.id("J_submit")).click();
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("我的联盟")).click();
	    driver.findElement(By.id("a_try")).click();
	    
        b=sql_que(try_title);
        System.out.println(b);
        String text ="//a[contains(@onclick,'"+b+"')  and contains(text(),'写订单号')]";
        System.out.println(text);
	    driver.findElement(By.xpath(text)).click();
	    driver.findElement(By.id("orderNo")).sendKeys("54545665tryyrtyfg");
	    driver.findElement(By.className("btn")).click();
	    boolean isfind = isFind();
	    if(isfind)
	    	driver.findElement(By.className("close-ad")).click();	

	}
	
	  @After
	  public void tearDown() throws Exception {
	    driver.quit();

	  }
	  
	  public int sql_que(String try_title1)
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

	            String sql ="select tid from sk_try where title='"+try_title1+"'";
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
