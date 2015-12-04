package Json;

import java.io.IOException;



import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.omg.CORBA.StringHolder;






public   class Json_test {
	
	public String url = "http://appserver.sk4.com/trys/try_list?version=2.1.2";
	@Test
	public void test() throws ClientProtocolException, IOException
	{
		String strJson = connServerForResult(url);
		System.out.println(strJson);
	}
	
	public String  connServerForResult(String strUrl) throws ClientProtocolException, IOException
	{
		HttpGet httpRequest = new HttpGet(strUrl);
		String  strResult = "";
		
		// HttpClient对象

		CloseableHttpClient httpclient = HttpClients.createDefault();
		// 获得HttpResponse对象
	    CloseableHttpResponse response1 = httpclient.execute(httpRequest);
		try{
			
			// 请求超时5秒 接受超时5秒
//			HttpConnectionParams.setConnectionTimeout(httpParams, 5000);
//			HttpConnectionParams.setSoTimeout(httpParams, 5000);
	        System.out.println(response1.getStatusLine());
			if(response1.getStatusLine().getStatusCode() == HttpStatus.SC_OK)
			{
				strResult = EntityUtils.toString(response1.getEntity());
			}
			else
			{		
				return strResult;
				
			}
		}

		catch(ClientProtocolException e)
		{

			System.out.println("protocol error");

			e.printStackTrace();
		}
		catch(IOException e)
		{
			System.out.println("IO error");

			e.printStackTrace();
		}
		finally {
			response1.close();
	    }
		
		//json解析
		try{
			JSONObject object = new JSONObject(strResult);
			String code = object.getString("code");
			String msg =object.getString("msg");	
			
			System.out.println("code:"+code);
			System.out.println("msg:"+msg);
			
			
			JSONObject object1 = object.getJSONObject("data");
			JSONArray array1 = object1.getJSONArray("try_list");
			System.out.println(array1.length());
			String array1Str =array1.toString();
			array1Str = array1Str.replace(",", "\r\n           ");
			for(int i=0;i<array1.length();i++)
			{
	        JSONObject arrayi = array1.getJSONObject(i);
			String arrayiStr =arrayi.toString();
			arrayiStr = arrayiStr.replace(",", "\r\n           ");
			arrayiStr = arrayiStr.replace("{", "{\r\n           ");
			arrayiStr = arrayiStr.replace("}", "\r\n           }");

			System.out.print("try_list"+i+":"+arrayiStr+"\r\n"+"\r\n");
			}
			
			
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		
		
		return strResult;
	}

}
