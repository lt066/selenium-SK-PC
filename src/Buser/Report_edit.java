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
	public String try_title = "��è���������-0";
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
	    driver.findElement(By.linkText("��¼")).click();
	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	    driver.findElement(By.id("J_userName")).clear();
	    driver.findElement(By.id("J_userName")).sendKeys(buname);
	    driver.findElement(By.id("J_pwd")).clear();
	    driver.findElement(By.id("J_pwd")).sendKeys("zxc123");
	    driver.findElement(By.id("J_submit")).click();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.findElement(By.linkText("�ҵ�����")).click();
	    driver.findElement(By.id("a_try")).click();
	    
        b=sql_que(try_title,buname);
        System.out.println(b);
        String text ="//a[contains(@href,'"+b+"')  and contains(text(),'д���ñ���')]";
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
	    driver.findElement(By.id("report-title")).sendKeys("selenium���Ա������-11/25");
	    driver.findElement(By.xpath("//div[@id='degreeStart']/i[5]")).click();
	    WebElement framel=driver.findElement(By.className("ke-edit-iframe"));
	    driver.switchTo().frame(framel);
	    driver.findElement(By.className("ke-content")).clear();
	    driver.findElement(By.className("ke-content")).sendKeys("�ǳ��õı�����ֵ���ղأ�ֵ�ù���,ϣ��֧��");
        driver.switchTo().defaultContent();
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    
	    //�������ͼƬ������
            driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[7]/div[2]/div[1]/div/object")).click();
            Process process=Runtime.getRuntime().exec("E:/Autolt/a.exe");
            process.waitFor();
            
            Actions action = new Actions(driver);
            action.sendKeys("13");
            
      	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[7]/div[2]/div[2]/ul/li[1]/div[2]/textarea")).sendKeys("�����ܺã�ֵ���ղأ��Լ۱ȸ�");
    
            
            driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[7]/div[2]/div[1]/div/object")).click();
            Process process1=Runtime.getRuntime().exec("E:/Autolt/b.exe");
            process1.waitFor();
            
//            Actions action1 = new Actions(driver);
            action.sendKeys("13");
            
    	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[7]/div[2]/div[2]/ul/li[2]/div[2]/textarea")).sendKeys("�̼Һܺ�˵����ֵ���ղأ��Լ۱ȸ�");

    	    
            driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[7]/div[2]/div[1]/div/object")).click();
            Process process2=Runtime.getRuntime().exec("E:/Autolt/c.exe");
            process2.waitFor();
            
//            Actions action2 = new Actions(driver);
            action.sendKeys("13");
            
    	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	    driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[7]/div[2]/div[2]/ul/li[3]/div[2]/textarea")).sendKeys("�´ξ�ȥ�̼������򶫶��ˣ�ֵ���ղأ��Լ۱ȸ�");

        
        
        
        //ϸ��չʾͼƬ������
              driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
              driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[8]/div[2]/div[1]/div/object")).click();
              Process process3=Runtime.getRuntime().exec("E:/Autolt/a.exe");
              process3.waitFor();
              
//              Actions action3 = new Actions(driver);
              action.sendKeys("13");
              
      	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
              driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[8]/div[2]/div[2]/ul/li[1]/div[2]/textarea")).sendKeys("��ɫ������ã�ֵ���ղأ��Լ۱ȸ�");

      	    
              driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[8]/div[2]/div[1]/div/object")).click();
              Process process4=Runtime.getRuntime().exec("E:/Autolt/b.exe");
              process4.waitFor();
              
//              Actions action4 = new Actions(driver);
              action.sendKeys("13");
              
    	      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    	      driver.findElement(By.xpath("/html/body/form/div/div[2]/div/div[8]/div[2]/div[2]/ul/li[2]/div[2]/textarea")).sendKeys("��ͼƬ����һ�£�ֵ���ղأ��Լ۱ȸ�");


	    
        
        //��������
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

	            String sql ="select jid from sk_join where title='"+try_title1+"' and buyer_uname = '"+buname+"'" ;
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
