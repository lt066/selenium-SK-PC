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

	  //�Ƿ��ά���µ�,trueΪ��
	  public boolean is_qr_order = true;
	  //�����Ѳ�����Կ�����
	  public String seller_uanme = "suser005";
	  public String passwd = "zxc1234";
	  public int try_type_num = 9;
	
	  public General_try g_try = new General_try();
	  public View_try view_try = new View_try();
	  public Search_try search_try = new Search_try();
	  public Package_try pa_try = new Package_try();
	  public App_try app_try = new App_try();
	  public Cellphone_try ce_try =new Cellphone_try();
	  public Command_try command_try = new Command_try();
	  public TaoSearch_try taoSearch_try = new TaoSearch_try();
	  
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
		  
		  
		  while(true)
		  {
		       switch (try_type_num) 
		       {
		          case 9:

		 		      g_try.joided_buyer_limits = false;
		 		      g_try.is_change_type =0;
		        	  post_qr_order();
		        	  System.out.println("������ά��");
//		 		      g_try.joided_buyer_limits = true;
//		        	  post_qr_order();

			          break;
		          case 8:
		 		      g_try.joided_buyer_limits = false;
		 		      g_try.is_change_type =0;
		        	  post_no_qr_order();
		        	  System.out.println("������ͨ�");
//			 		  g_try.joided_buyer_limits = true;
//			          post_no_qr_order();

		        	  break;
		          case 7:
		 		      view_try.joided_buyer_limits = false;
		 		      view_try.is_change_type =0;
		        	  post_view_try();
		        	  System.out.println("�����𰸻");
//		        	  view_try.joided_buyer_limits = true;
//		        	  post_view_try();

		        	  break;
		          case 6:
		 		      search_try.joided_buyer_limits = false;
		 		      search_try.is_change_type =0;
		        	  post_search_try();
		        	  System.out.println("������ͨ�����");
//		        	  search_try.joided_buyer_limits = true;
//		        	  post_search_try();

		        	  break;
		          case 5:
		 		      pa_try.joided_buyer_limits = false;
		 		      pa_try.is_change_type =0;
		        	  post_pac_try();
		        	  System.out.println("�����ײͻ");
//		        	  pa_try.joided_buyer_limits = true;
//		        	  post_pac_try();

		        	  break;
		          case 4:
//		 		      app_try.joided_buyer_limits = false;
//		 		      app_try.is_change_type =0;
//		        	  post_app_try();
//		        	  System.out.println("����app�");
//		        	  app_try.joided_buyer_limits = true;
//		        	  post_app_try();

		        	  break;
		          case 3:
		 		      ce_try.joided_buyer_limits = false;
		 		      ce_try.is_change_type =0;
		        	  post_cell_try();
		        	  System.out.println("���������µ��");
//		        	  ce_try.joided_buyer_limits = true;
//		        	  post_cell_try();

		        	  break;
		          case 2:
//		 		      command_try.joided_buyer_limits = false;
//		 		      command_try.is_change_type =0;
//		        	  post_com_try();
//		        	  System.out.println("��������");
//		        	  command_try.joided_buyer_limits = true;
//		        	  post_com_try();

		        	  break;
		          case 1:
//		 		      taoSearch_try.joided_buyer_limits = false;
//		 		      taoSearch_try.is_change_type =0;
//		        	  post_taoSearch_try();
//		        	  System.out.println("�������������");
//		        	  taoSearch_try.joided_buyer_limits = true;
//		        	  post_taoSearch_try();

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
		     g_try.j = 4;
		     g_try.try_number = 0+g_try.j;
		     g_try.is_qr_order = true;
			  if(!g_try.joided_buyer_limits)
				  g_try.try_title = "��ά��-12/01-Ʒ��-";
			  else
				  g_try.try_title = "sk4��ά��-�����Կ�";
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
		     g_try.j = 4;
		     g_try.try_number = 0+g_try.j;
		     g_try.is_qr_order = false;
			  if(!g_try.joided_buyer_limits)
				  g_try.try_title ="��ͨ��-12/01-Ʒ��-";
			  else
				  g_try.try_title = "sk4��ͨ�-�����Կ�";
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
		  ce_try.j = 4;
		  ce_try.try_number = 0+ce_try.j;
		  if(!ce_try.joided_buyer_limits)
		      ce_try.try_title = "�����µ��-12/01-Ʒ��-";
		  else
			  ce_try.try_title = "sk4�����µ��-�����Կ�";
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
		  view_try.j = 4;
		  view_try.try_number = 0+view_try.j;
		  if(!view_try.joided_buyer_limits)
		      view_try.try_title ="�����û-12/01-Ʒ��-";
		  else
			  view_try.try_title = "sk4�����û-�����Կ�";
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
		  pa_try.j = 4;
		  pa_try.try_number = 0+pa_try.j;
		  if(!pa_try.joided_buyer_limits)
			  pa_try.try_title = "�ײͻ-12/01-Ʒ��-";
		  else
			  pa_try.try_title = "sk4�ײͻ-�����Կ�";
		  
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
		  search_try.j = 4;
		  search_try.try_number = 0+search_try.j;
		  if(!search_try.joided_buyer_limits)
			  search_try.try_title = "��ͨ�����-12/01-Ʒ��-";
		  else
			  search_try.try_title = "sk4��ͨ�����-�����Կ�";
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
		  app_try.j = 4;
		  app_try.try_number = 0+app_try.j;
		  if(!app_try.joided_buyer_limits)
			  app_try.try_title ="app�-12/01-�Ͻ�-";
		  else
			  app_try.try_title = "sk4-app�-�����Կ�";
		  app_try.step[0] = "ѡ���̺";
		  app_try.step[1] = "���Ա���ҳ";
		  app_try.step[2] = "��������̺��";
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
		  command_try.j = 4;
		  command_try.try_number = 0+command_try.j;
		  if(!command_try.joided_buyer_limits)
			  command_try.try_title = "����-12/01-�Ͻ�-";
		  else
			  command_try.try_title = "sk4����-�����Կ�";
		  
		  command_try.order_url = "https://detail.m.tmall.com/item.htm?spm=0.0.0.0.qmRO1N&id=521470708082&sid=74cd19a32a7eb2cc25562c2d15de4564&rn=459d0aef6976903d54d6fc0505b43b7e&abtest=11";
	      command_try.command = "�ŵۼӺ��޻�������޵�̺�����輸��̺���Ҵ���̺�ص����̿ɶ��� http://b.mashort.cn/h.3SP0g?sm=60ef73 (����������Ϣ�����ֻ��Ա���ֱ�ӷ���)";
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
		  taoSearch_try.j = 4;
		  taoSearch_try.try_number = 0+taoSearch_try.j;
		  if(!taoSearch_try.joided_buyer_limits)
			  taoSearch_try.try_title = "���������-12/01-�Ͻ�-";
		  else
			  taoSearch_try.try_title = "sk4���������-�����Կ�";
		  taoSearch_try.order_url = "https://detail.m.tmall.com/item.htm?spm=0.0.0.0.qmRO1N&id=521470708082&sid=74cd19a32a7eb2cc25562c2d15de4564&rn=459d0aef6976903d54d6fc0505b43b7e&abtest=11";
		
		  taoSearch_try.shopname = "�ŵ��콢��";
		  taoSearch_try.key_one = "��̺";
		  taoSearch_try.key_two = "��������";
		  try {
			  taoSearch_try.testWebtest1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
	  }
	  
}
