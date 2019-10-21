
public class WeatherInfo {
	private String date;
	private String cityname;
	private String weather;
	private String temperature;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date=date;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname=cityname;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather=weather;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature=temperature;
	}
	public String main(String[] args) {
		return "WeatherInfo [{date="+date+",cityname="+cityname+",weather="+weather+",temperature="+temperature+"}]";
	}
}

