package Post_try;

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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Change_try_type {
	
	  private WebDriver driver;
	  public StringBuffer verificationErrors = new StringBuffer();
	  public String baseUrl;
	  public String seller_uanme = "suser004";
	  public String passwd = "zxc123";
	  public String try_title = "ca手淘下单活动-12/01-紫金-1";
	
	  @Before
	  public void setUp() throws Exception{
		  Initialize_test ini_test = new Initialize_test(baseUrl, seller_uanme, passwd);
		  driver = ini_test.setUp();
		  
		  Pay_monney pay_monney = new Pay_monney();
		  pay_monney.driver = driver;
	  }
	  
	  @Test
	  public void main() throws Exception
	  {

	      int b;
	      b=sql_que(try_title,seller_uanme);
	      System.out.println(b);

		  int i = 2;
		  while(true)
		  {
		       driver.findElement(By.linkText("试用活动管理")).click();
			   b=sql_que(try_title,seller_uanme);
			   System.out.println(b);
			   driver.findElement(By.xpath("//a[contains(@href,'"+b+"') and contains(text(),'编辑')]")).click();

		       switch (i) 
		       {
		          case 9:

		 		      General_try ge = new General_try();
		 		      ge.driver = driver;
		 		      ge.is_qr_order = true;
					  ge.try_title = "ca二维码活动-12/01-紫金-";
					  try_title = ge.try_title;
					  ge.joided_buyer_limits = false;
		        	  ge.clear();
		        	  ge.testWebtest1();
		        	  System.out.println("发布二维码活动");
//		 		      g_try.joided_buyer_limits = true;
//		        	  post_qr_order();

			          break;
		          case 8:
		 		      General_try ge1 = new General_try();
		 		      ge1.driver = driver;
					  ge1.try_title = "ca普通活动-12/01-紫金-";
					  try_title = ge1.try_title;
		 		      ge1.is_qr_order = false;
		 		      ge1.joided_buyer_limits = false;
		        	  ge1.clear();
		        	  ge1.testWebtest1();
		        	  System.out.println("发布普通活动");
//			 		  g_try.joided_buyer_limits = true;
//			          post_no_qr_order();

		        	  break;
		          case 7:
		 		      View_try vt = new View_try();
		 		      vt.driver = driver;
		 		      vt.joided_buyer_limits = false;
					  vt.try_title = "ca答案活动-12/01-紫金-";
					  try_title = vt.try_title;
		 		      vt.clear();
		 		      vt.testWebtest1();
		        	  System.out.println("发布答案活动");
//		        	  view_try.joided_buyer_limits = true;
//		        	  post_view_try();

		        	  break;
		          case 6:
		        	  Search_try st = new Search_try();
		        	  st.driver = driver;
		        	  st.joided_buyer_limits = false;
					  st.try_title = "ca普通搜索活动-12/01-紫金-";
					  try_title = st.try_title;
		        	  st.clear();
		        	  st.testWebtest1();
		        	  System.out.println("发布普通搜索活动");
//		        	  search_try.joided_buyer_limits = true;
//		        	  post_search_try();

		        	  break;
		          case 5:
		        	  Package_try pt = new Package_try();
		        	  pt.driver = driver;
		        	  pt.joided_buyer_limits = false;
					  pt.try_title = "ca套餐活动-12/01-紫金-";
					  try_title = pt.try_title;
		        	  pt.clear();
		        	  pt.testWebtest1();
		        	  System.out.println("发布套餐活动");
//		        	  pa_try.joided_buyer_limits = true;
//		        	  post_pac_try();

		        	  break;
		          case 4:
		        	  App_try at =new App_try();
		        	  at.driver =driver;
		        	  at.joided_buyer_limits = false;
					  at.try_title = "ca-app活动-12/01-紫金-";
					  try_title = at.try_title;
		        	  at.clear();
		        	  at.testWebtest1();
		        	  System.out.println("发布app活动");
//		        	  app_try.joided_buyer_limits = true;
//		        	  post_app_try();

		        	  break;
		          case 3:
		        	  Cellphone_try ct = new Cellphone_try();
		        	  ct.driver= driver;
		        	  ct.joided_buyer_limits = false;
					  ct.try_title = "ca手淘下单活动-12/01-紫金-";
					  try_title = ct.try_title;
		        	  ct.clear();
		        	  ct.testWebtest1();
		        	  System.out.println("发布手淘下单活动");
//		        	  ce_try.joided_buyer_limits = true;
//		        	  post_cell_try();

		        	  break;
		          case 2:
		        	  Command_try comt = new Command_try();
		        	  comt.driver = driver;
		        	  comt.joided_buyer_limits = false;
					  comt.try_title = "ca口令活动-12/01-紫金-";
					  try_title = comt.try_title;
		        	  comt.clear();
		        	  comt.testWebtest1();
		        	  System.out.println("发布口令活动");
//		        	  command_try.joided_buyer_limits = true;
//		        	  post_com_try();

		        	  break;
		          case 1:
		        	  TaoSearch_try tst =new TaoSearch_try();
		        	  tst.driver =driver;
		        	  tst.joided_buyer_limits = false;
					  tst.try_title = "ca手淘搜索活动-12/01-紫金-";
					  try_title = tst.try_title;
		        	  tst.clear();
		        	  tst.testWebtest1();
		        	  System.out.println("发布手淘搜索活动");
//		        	  taoSearch_try.joided_buyer_limits = true;
//		        	  post_taoSearch_try();

		        	  break;
		          default:
			          break;
		       }
		       
	         i = i-1;
       	     System.out.println(i);
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
             if(i == 0)
            	 break;
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

	  public int sql_que(String try_title1,String suname)
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

	            String sql ="select tid from sk_try where title='"+try_title1+"' and uname = '"+suname+"' order by tid desc" ;
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
