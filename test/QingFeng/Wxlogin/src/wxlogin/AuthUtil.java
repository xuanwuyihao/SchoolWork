package wxlogin;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import net.sf.json.JSONObject;

public class AuthUtil {

	public static JSONObject dogetJson(String url) throws ClientProtocolException, IOException{
		JSONObject jsonObject=null;
		DefaultHttpClient client=new DefaultHttpClient();
		HttpGet httpget=new HttpGet(url);
		HttpResponse  response=client.execute(httpget);
		HttpEntity entity=response.getEntity();
		if(entity !=null){
			String result=EntityUtils.toString(entity,"utf-8");
			jsonObject	=jsonObject.fromObject(result);
		}
		httpget.releaseConnection();
		return jsonObject;
	}
}
