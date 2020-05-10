
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

public class WeatherTest {
	
	public static void main(String args[]) {
		System.out.println("a");
		Response resp=when().get("api.openweathermap.org/data/2.5/weather?q=Mumbai&appid=2c6fa043ae82443537201cb41f09e101");
		System.out.println("Response Code  : "+resp.statusCode());
	}

}
