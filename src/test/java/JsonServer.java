import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;

public class JsonServer {
	// post Request
	public static void postRequest() {
		Posts post = new Posts();
		post.setId("5");
		post.setTitle("Testing");
		post.setAuther("Rahul");
		Response resp = given().when().contentType(ContentType.JSON).body(post).
				        post("http://localhost:3000/posts");
		System.out.println("resp: "+resp.asString());
	}

	public static void main(String args[]) {
		//postRequest();
		Response resp = given().when().delete("http://localhost:3000/posts/1");
		System.out.println("resp: " + resp.toString());
	}

}
