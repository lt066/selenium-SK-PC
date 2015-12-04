package Post_try;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class All_try {

	  public WebDriver driver;
	  public String baseUrl;
	  public boolean acceptNextAlert = true;
	  public StringBuffer verificationErrors = new StringBuffer();

	  //是否二维码下单,true为是
	  public boolean is_qr_order = true;
	  //限制已参与过试客申请
	  public String seller_uanme = "zxczxc";
	  public String passwd = "zxc123";
	  public int try_type_num = 9;
	
	  public General_try g_try = new General_try();
	  public View_try view_try = new View_try();
	  public Search_try search_try = new Search_try();
	  public Package_try pa_try = new Package_try();
	  public App_try app_try = new App_try();
	  public Cellphone_try ce_try =new Cellphone_try();
	  public Command_try command_try = new Command_try();
	  public TaoSearch_try taoSearch_try = new TaoSearch_try();
	  Pay_monney pay_monney = new Pay_monney();
	  
	  @Before
	  public void setUp() throws Exception{
		  Initialize_test ini_test = new Initialize_test(baseUrl, seller_uanme, passwd);
		  driver = ini_test.setUp();
		  

		  pay_monney.driver = driver;
	  }
	  
	  @Test
	  public void main() throws Exception
	  {
		  
		  
		  while(true)
		  {
		       switch (try_type_num) 
		       {
		          case 9:

		 		      g_try.joided_buyer_limits = false;
		 		      g_try.is_change_type =0;
		        	  post_qr_order();
		        	  pay_monney.main();
		        	  System.out.println("发布二维码活动");
		 		      g_try.joided_buyer_limits = true;
		        	  post_qr_order();
		        	  pay_monney.main();
			          break;
		          case 8:
		 		      g_try.joided_buyer_limits = false;
		 		      g_try.is_change_type =0;
		        	  post_no_qr_order();
		        	  pay_monney.main();
		        	  System.out.println("发布普通活动");
			 		  g_try.joided_buyer_limits = true;
			          post_no_qr_order();
		        	  pay_monney.main();
		        	  break;
		          case 7:
		 		      view_try.joided_buyer_limits = false;
		 		      view_try.is_change_type =0;
		        	  post_view_try();
		        	  pay_monney.main();
		        	  System.out.println("发布答案活动");
		        	  view_try.joided_buyer_limits = true;
		        	  post_view_try();
		        	  pay_monney.main();
		        	  break;
		          case 6:
		 		      search_try.joided_buyer_limits = false;
		 		      search_try.is_change_type =0;
		        	  post_search_try();
		        	  pay_monney.main();
		        	  System.out.println("发布普通搜索活动");
		        	  search_try.joided_buyer_limits = true;
		        	  post_search_try();
		        	  pay_monney.main();
		        	  break;
		          case 5:
		 		      pa_try.joided_buyer_limits = false;
		 		      pa_try.is_change_type =0;
		        	  post_pac_try();
		        	  pay_monney.main();
		        	  System.out.println("发布套餐活动");
		        	  pa_try.joided_buyer_limits = true;
		        	  post_pac_try();
		        	  pay_monney.main();
		        	  break;
		          case 4:
		 		      app_try.joided_buyer_limits = false;
		 		      app_try.is_change_type =0;
		        	  post_app_try();
		        	  pay_monney.main();
		        	  System.out.println("发布app活动");
		        	  app_try.joided_buyer_limits = true;
		        	  post_app_try();
		        	  pay_monney.main();

		        	  break;
		          case 3:
		 		      ce_try.joided_buyer_limits = false;
		 		      ce_try.is_change_type =0;
		        	  post_cell_try();
		        	  pay_monney.main();
		        	  System.out.println("发布手淘下单活动");
		        	  ce_try.joided_buyer_limits = true;
		        	  post_cell_try();
		        	  pay_monney.main();
		        	  break;
		          case 2:
		 		      command_try.joided_buyer_limits = false;
		 		      command_try.is_change_type =0;
		        	  post_com_try();
		        	  pay_monney.main();
		        	  System.out.println("发布口令活动");
		        	  command_try.joided_buyer_limits = true;
		        	  post_com_try();
		        	  pay_monney.main();
		        	  break;
		          case 1:
		 		      taoSearch_try.joided_buyer_limits = false;
		 		      taoSearch_try.is_change_type =0;
		        	  post_taoSearch_try();
		        	  pay_monney.main();
		        	  System.out.println("发布手淘搜索活动");
		        	  taoSearch_try.joided_buyer_limits = true;
		        	  post_taoSearch_try();
		        	  pay_monney.main();
		        	  break;
		          default:
			          break;
		       }
		       
	         try_type_num = try_type_num-1;
       	     System.out.println(try_type_num);
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
             if(try_type_num == 0)
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

	  public void post_qr_order()
	  {

		     g_try.driver = driver;
		     g_try.j = 9;
		     g_try.try_number = 0+g_try.j;
		     g_try.is_qr_order = true;
			  if(!g_try.joided_buyer_limits)
				  g_try.try_title = "sk二维码活动-紫金";
			  else
				  g_try.try_title = "sk二维码活动-限制试客-紫金";
		     g_try.order_url = "http://www.taobao.com";
		     try {
				g_try.testWebtest1();
			} catch (Exception e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}

	  }
	  
	  public void post_no_qr_order()
	  {
		     g_try.driver = driver;
		     g_try.j = 9;
		     g_try.try_number = 0+g_try.j;
		     g_try.is_qr_order = false;
			  if(!g_try.joided_buyer_limits)
				  g_try.try_title ="sk普通活动-紫金";
			  else
				  g_try.try_title = "sk普通活动-限制试客-紫金";
		     g_try.order_url = "http://www.taobao.com";
		     try {
				g_try.testWebtest1();
			} catch (Exception e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			}
	  }
	  
	  public void post_cell_try()
	  {
		  ce_try.driver = driver;
		  ce_try.j = 9;
		  ce_try.try_number = 0+ce_try.j;
		  if(!ce_try.joided_buyer_limits)
		      ce_try.try_title = "sk手淘下单活动-紫金";
		  else
			  ce_try.try_title = "sk手淘下单活动-限制试客-紫金";
		  ce_try.order_url = "https://detail.m.tmall.com/item.htm?spm=0.0.0.0.qmRO1N&id=521470708082&sid=74cd19a32a7eb2cc25562c2d15de4564&rn=459d0aef6976903d54d6fc0505b43b7e&abtest=11";
	      try {
			ce_try.testWebtest1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	  }
	  
	  public void post_view_try()
	  {
		  view_try.driver = driver;
		  view_try.j = 9;
		  view_try.try_number = 0+view_try.j;
		  if(!view_try.joided_buyer_limits)
		      view_try.try_title ="sk答案试用活动-紫金";
		  else
			  view_try.try_title = "sk答案试用活动-限制试客-紫金";
		  view_try.order_url = "https://detail.m.tmall.com/item.htm?spm=0.0.0.0.qmRO1N&id=521470708082&sid=74cd19a32a7eb2cc25562c2d15de4564&rn=459d0aef6976903d54d6fc0505b43b7e&abtest=11";
	      try {
	    	  view_try.testWebtest1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	  }
	  
	  public void post_pac_try()
	  {
		  pa_try.driver = driver;
		  pa_try.j = 9;
		  pa_try.try_number = 0+pa_try.j;
		  if(!pa_try.joided_buyer_limits)
			  pa_try.try_title = "sk套餐活动-紫金";
		  else
			  pa_try.try_title = "sk套餐活动-限制试客-紫金";
		  
		  pa_try.order_url = "http://www.taobao.com";
	      try {
	    	  pa_try.testWebtest1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  public void post_search_try()
	  {
		  search_try.driver = driver;
		  search_try.j = 9;
		  search_try.try_number = 0+search_try.j;
		  if(!search_try.joided_buyer_limits)
			  search_try.try_title = "sk普通搜索活动-紫金";
		  else
			  search_try.try_title = "sk普通搜索活动-限制试客-紫金";
		  search_try.order_url = "http://www.taobao.com";
	      try {
	    	  search_try.testWebtest1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	  }
	  
	  public void post_app_try()
	  {
		  app_try.driver = driver;
		  app_try.j = 9;
		  app_try.try_number = 0+app_try.j;
		  if(!app_try.joided_buyer_limits)
			  app_try.try_title ="sk-app活动-";
		  else
			  app_try.try_title = "sk-app活动-限制试客-";
		  app_try.step[0] = "选择地毯";
		  app_try.step[1] = "打开淘宝首页";
		  app_try.step[2] = "搜索“地毯”";
		  app_try.stepUrl[0] = "http://m.taobao.com";
		  app_try.stepUrl[1] = "http://s.m.taobao.com/h5?q=%E5%9C%B0%E6%AF%AF&search=%E6%8F%90%E4%BA%A4";
		  app_try.stepUrl[2] = "https://detail.m.tmall.com/item.htm?spm=0.0.0.0.qmRO1N&id=521470708082&sid=74cd19a32a7eb2cc25562c2d15de4564&rn=459d0aef6976903d54d6fc0505b43b7e&abtest=11";
	      try {
	    	  app_try.testWebtest1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	  }
	  
	  public void post_com_try()
	  {
		  command_try.driver = driver;
		  command_try.j = 9;
		  command_try.try_number = 0+command_try.j;
		  if(!command_try.joided_buyer_limits)
			  command_try.try_title = "sk口令活动--";
		  else
			  command_try.try_title = "sk口令活动-限制试客-";
		  
		  command_try.order_url = "https://detail.m.tmall.com/item.htm?spm=0.0.0.0.qmRO1N&id=521470708082&sid=74cd19a32a7eb2cc25562c2d15de4564&rn=459d0aef6976903d54d6fc0505b43b7e&abtest=11";
	      command_try.command = "雅帝加厚棉花绒羊羔绒地毯客厅茶几地毯卧室床边毯地垫满铺可定制 http://b.mashort.cn/h.3SP0g?sm=60ef73 (复制整段信息，打开手机淘宝可直接访问)";
		  try {
	    	  command_try.testWebtest1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	  
	  public void post_taoSearch_try()
	  {
		  taoSearch_try.driver = driver;
		  taoSearch_try.j = 9;
		  taoSearch_try.try_number = 0+taoSearch_try.j;
		  if(!taoSearch_try.joided_buyer_limits)
			  taoSearch_try.try_title = "sk手淘搜索活动-";
		  else
			  taoSearch_try.try_title = "sk手淘搜索活动-限制试客-";
		  taoSearch_try.order_url = "https://detail.m.tmall.com/item.htm?spm=0.0.0.0.qmRO1N&id=521470708082&sid=74cd19a32a7eb2cc25562c2d15de4564&rn=459d0aef6976903d54d6fc0505b43b7e&abtest=11";
		
		  taoSearch_try.shopname = "雅帝旗舰店";
		  taoSearch_try.key_one = "地毯";
		  taoSearch_try.key_two = "销量优先";
		  try {
			  taoSearch_try.testWebtest1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	  }
	  
}
