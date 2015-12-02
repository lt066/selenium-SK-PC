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
	  public String try_title = "ca�����µ��-12/01-�Ͻ�-1";
	
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
		       driver.findElement(By.linkText("���û����")).click();
			   b=sql_que(try_title,seller_uanme);
			   System.out.println(b);
			   driver.findElement(By.xpath("//a[contains(@href,'"+b+"') and contains(text(),'�༭')]")).click();

		       switch (i) 
		       {
		          case 9:

		 		      General_try ge = new General_try();
		 		      ge.driver = driver;
		 		      ge.is_qr_order = true;
					  ge.try_title = "ca��ά��-12/01-�Ͻ�-";
					  try_title = ge.try_title;
					  ge.joided_buyer_limits = false;
		        	  ge.clear();
		        	  ge.testWebtest1();
		        	  System.out.println("������ά��");
//		 		      g_try.joided_buyer_limits = true;
//		        	  post_qr_order();

			          break;
		          case 8:
		 		      General_try ge1 = new General_try();
		 		      ge1.driver = driver;
					  ge1.try_title = "ca��ͨ�-12/01-�Ͻ�-";
					  try_title = ge1.try_title;
		 		      ge1.is_qr_order = false;
		 		      ge1.joided_buyer_limits = false;
		        	  ge1.clear();
		        	  ge1.testWebtest1();
		        	  System.out.println("������ͨ�");
//			 		  g_try.joided_buyer_limits = true;
//			          post_no_qr_order();

		        	  break;
		          case 7:
		 		      View_try vt = new View_try();
		 		      vt.driver = driver;
		 		      vt.joided_buyer_limits = false;
					  vt.try_title = "ca�𰸻-12/01-�Ͻ�-";
					  try_title = vt.try_title;
		 		      vt.clear();
		 		      vt.testWebtest1();
		        	  System.out.println("�����𰸻");
//		        	  view_try.joided_buyer_limits = true;
//		        	  post_view_try();

		        	  break;
		          case 6:
		        	  Search_try st = new Search_try();
		        	  st.driver = driver;
		        	  st.joided_buyer_limits = false;
					  st.try_title = "ca��ͨ�����-12/01-�Ͻ�-";
					  try_title = st.try_title;
		        	  st.clear();
		        	  st.testWebtest1();
		        	  System.out.println("������ͨ�����");
//		        	  search_try.joided_buyer_limits = true;
//		        	  post_search_try();

		        	  break;
		          case 5:
		        	  Package_try pt = new Package_try();
		        	  pt.driver = driver;
		        	  pt.joided_buyer_limits = false;
					  pt.try_title = "ca�ײͻ-12/01-�Ͻ�-";
					  try_title = pt.try_title;
		        	  pt.clear();
		        	  pt.testWebtest1();
		        	  System.out.println("�����ײͻ");
//		        	  pa_try.joided_buyer_limits = true;
//		        	  post_pac_try();

		        	  break;
		          case 4:
		        	  App_try at =new App_try();
		        	  at.driver =driver;
		        	  at.joided_buyer_limits = false;
					  at.try_title = "ca-app�-12/01-�Ͻ�-";
					  try_title = at.try_title;
		        	  at.clear();
		        	  at.testWebtest1();
		        	  System.out.println("����app�");
//		        	  app_try.joided_buyer_limits = true;
//		        	  post_app_try();

		        	  break;
		          case 3:
		        	  Cellphone_try ct = new Cellphone_try();
		        	  ct.driver= driver;
		        	  ct.joided_buyer_limits = false;
					  ct.try_title = "ca�����µ��-12/01-�Ͻ�-";
					  try_title = ct.try_title;
		        	  ct.clear();
		        	  ct.testWebtest1();
		        	  System.out.println("���������µ��");
//		        	  ce_try.joided_buyer_limits = true;
//		        	  post_cell_try();

		        	  break;
		          case 2:
		        	  Command_try comt = new Command_try();
		        	  comt.driver = driver;
		        	  comt.joided_buyer_limits = false;
					  comt.try_title = "ca����-12/01-�Ͻ�-";
					  try_title = comt.try_title;
		        	  comt.clear();
		        	  comt.testWebtest1();
		        	  System.out.println("��������");
//		        	  command_try.joided_buyer_limits = true;
//		        	  post_com_try();

		        	  break;
		          case 1:
		        	  TaoSearch_try tst =new TaoSearch_try();
		        	  tst.driver =driver;
		        	  tst.joided_buyer_limits = false;
					  tst.try_title = "ca���������-12/01-�Ͻ�-";
					  try_title = tst.try_title;
		        	  tst.clear();
		        	  tst.testWebtest1();
		        	  System.out.println("�������������");
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

	            String sql ="select tid from sk_try where title='"+try_title1+"' and uname = '"+suname+"' order by tid desc" ;
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
