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
    public String try_title = "�޶���滮 "; 
	
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
	    driver.findElement(By.linkText("��¼")).click();
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("J_userName")).clear();
	    driver.findElement(By.id("J_userName")).sendKeys("user170");
	    driver.findElement(By.id("J_pwd")).clear();
	    driver.findElement(By.id("J_pwd")).sendKeys("zxc123");
	    driver.findElement(By.id("J_submit")).click();
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("�ҵ�����")).click();
	    driver.findElement(By.id("a_try")).click();
	    
        b=sql_que(try_title);
        System.out.println(b);
        String text ="//a[contains(@onclick,'"+b+"')  and contains(text(),'д������')]";
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
	            //����Class.forName()����������������
	            Class.forName("com.mysql.jdbc.Driver");
	            System.out.println("�ɹ�����MySQL������");
	      }
		  catch(ClassNotFoundException e)
		  {
	            System.out.println("�Ҳ���MySQL����!");
	            e.printStackTrace();
	      }
	        
	        String url="jdbc:mysql://192.168.0.207:3306/shikee";    //JDBC��URL    
	        //����DriverManager�����getConnection()���������һ��Connection����
	        Connection conn;
	        try 
	        {
	            conn = DriverManager.getConnection(url,"root","JTr5nNUBwduNZfxw");
	            //����һ��Statement����
	            Statement stmt = conn.createStatement(); //����Statement����
	            System.out.println("�ɹ����ӵ����ݿ⣡");

	            String sql ="select tid from sk_try where title='"+try_title1+"'";
	             //Ҫִ�е�SQL
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
