package reqres_Response_Validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import io.restassured.response.Response;

public class RequestChainingGETandDELETE {
	
	public void getAndDeleteUser()
	{
		
		baseURI ="https://reqres.in";
		
		Response resp = when().get("/api/users/2");
		int id =  resp.jsonPath().getInt("data.id");
		resp.then().assertThat().statusCode(200)
					.log().all();
		
		when()
			.delete("/api/users/"+id)
			.then()
			.assertThat()
			.statusCode(204)
			.log().all();
	}

}
