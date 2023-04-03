package CRUDoperarions;


import org.testng.annotations.Test;

import io.restassured.RestAssured;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;


public class DeleteUserTest {
	@Test
	public void deleteUserTEst()
	{
		//Step 1: Create prerequisites 
				
				//Step 2: Send request
				Response response = RestAssured.delete("https://reqres.in/api/users/2");
				
				//Step 3 : validate the response
				ValidatableResponse val = response.then();
				val.assertThat().statusCode(204);
				val.log().all();
	}

}
