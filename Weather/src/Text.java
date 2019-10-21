import java.io.IOException;
import java.util.Scanner;

public class Text {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("请输入日期：");
		String date=input.next();
		String Info=WeatherUtils.GetWeatherData(date);
		WeatherInfo weatherInfo=WeatherUtils.GetWeather(Info);
		System.out.println(weatherInfo.toString());
	}

}
