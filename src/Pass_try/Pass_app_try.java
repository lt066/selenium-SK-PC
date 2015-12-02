package Pass_try;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import Sk_System.Login;

public class Pass_app_try {
	public WebDriver driver;
	public String url;
	public StringBuffer verificationErrors = new StringBuffer();
	
    public int j = 0;
    public int try_number = j+0;

    public String try_title = "��̺app�-11/25-"; 
    public int b;
    public String[] c = new String[10];
    
	 @Before
	  public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:/Users/lt/AppData/Local/Google/Chrome/Application/chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//		driver = new FirefoxDriver();
	    
//	    url = "http://skadmin.sk.com";
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	  }
	 
	 @Test
	 public void main()
	 {
		 

	      Login login_skSystem = new Login(driver);
	      login_skSystem.main();
		  
	      WebElement frame1=driver.findElement(By.id( "topFrame" ));
		  driver.switchTo().frame(frame1);
		  driver.findElement(By.id("man_nav_4")).click();
		  driver.switchTo().defaultContent();

		    for(;j<=try_number;j++)
		    {
		         WebElement frame2=driver.findElement(By.id( "manFrame" ));
		  	     driver.switchTo().frame(frame2);
	             String try_title_2=try_title+j;
	 	         System.out.println(try_title_2);
		         b=sql_que(try_title_2);
		         System.out.println(b);
		         c[j]=Integer.toString(b);
		         String text ="//a[contains(@href,'"+c[j]+"') and contains(text(),'ͨ��')]";
		         System.out.println(text);
		         driver.findElement(By.xpath(text)).click();
		         driver.findElement(By.xpath("/html/body/div[1]/div/table/tbody/tr[2]/td[2]/div/table/tbody/tr[2]/td[2]/div/div/div/p[2]/input[1]")).click();
		         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		         Alert alert = driver.switchTo().alert();
		         alert.accept();
		         

		         
//		         driver.findElement(By.xpath("//a[contains(@href,'/trys/upline?tid="+b+"')]")).click();
//		         Alert alert1 = driver.switchTo().alert();
//		         alert1.accept();
		         driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		   	     driver.switchTo().defaultContent();
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

	            String sql ="select tid from sk_try where title='"+try_title1+"' and state=1";
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
	  
	  


	  

}
