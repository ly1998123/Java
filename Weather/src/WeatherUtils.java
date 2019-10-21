import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.zip.GZIPInputStream;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;



//import org.omg.CORBA.portable.InputStream;

//import javax.print.DocFlavor.URL;

public class WeatherUtils {
	public static String GetWeatherData(String date)throws IOException {
		StringBuilder strb=new StringBuilder();
		try {
	    String cityname=URLEncoder.encode("荆州","UTF-8");
		String weather_url=String.format("https://free-api.heweather.net/s6/weather/forcast?location=荆州&key=45efafacb7844bb4b568587085db4abc&lang=cn");
		URL url=new URL(weather_url);
		HttpURLConnection conn=(HttpURLConnection)url.openConnection();
		conn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
		conn.setRequestMethod("GET");
		conn.connect();
		/*InputStream is=conn.getInputStream();
		GZIPInputStream gzin=new GZIPInputStream(is);//实例化对象
		InputStreamReader isr=new InputStreamReader(gzin,"utf-8");//创建读取对象，对gizp文件进行读取
		BufferedReader reader=new BufferedReader(isr);*/
		BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
		String line=null;
		while((line=reader.readLine())!=null) 
			strb.append(line+"");
		reader.close();
		conn.disconnect();
		
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return strb.toString();
	}
	public static WeatherInfo GetWeather(String weatherInfobyJson) {
		JSONObject Jsondata=JSONObject.fromObject(weatherInfobyJson);//将java转化成json
		if(Jsondata.getInt("status")!=1000)
			return null;
		WeatherInfo weatherInfo=new WeatherInfo();
		String data=Jsondata.getString("data");
		Jsondata=JSONObject.fromObject(data);
		weatherInfo.setCityname(Jsondata.getString("city"));
		//获取天气信息
		JSONArray forecast=Jsondata.getJSONArray("forecast");
		//获取当天的天气情况
		JSONObject result=forecast.getJSONObject(0);
		weatherInfo.setDate(result.getString("date"));
		String high=result.getString("high");
		String low=result.getString("low");
		weatherInfo.setTemperature(low+"~"+high);
		weatherInfo.setWeather(result.getString("type"));
		return weatherInfo;
		
	}

}
