package CRUDoperarions;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllUsersTest {
	@Test
	public void getAllUsersTest()
	{
		//Step 1 : create prerequisites  
		
		//Step 2: Send the request
		
		Response response =RestAssured.get("https://reqres.in/api/users");
		
		//step 3: validate the response
		ValidatableResponse val = response.then();
		val.assertThat().statusCode(200);
		val.log().all();
	}

}
