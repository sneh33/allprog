package contactListApi;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest {
	 @Test(enabled=true,description="get contact which doesn't exist")
	  public void getContact() {
		  System.out.println("Get contact");		
		  										
		  			given()
		  			.when()
		  				.get("http://3.13.86.142:3000/contacts/7")
		  			.then()
		  				.log()					
		  				.body()
		  				.statusCode(404);		
		  }
	 
	 @Test(enabled=true,description="adding new contact with missing info")
	  public void addNewContactMissingInfo() {
		  System.out.println("creating");		
		  JSONObject data=new JSONObject();
		  JSONObject emp=new JSONObject();
		  JSONObject loc=new JSONObject();
		  
		  loc.put("city","Mumbai");
		  loc.put("country","India");
		  emp.put("jobTitle", "QA");
		  emp.put("company", "LTI");	  
		  
		  data.put("firstName", "John");
		  //data.put("lastName", "Smith");
		  data.put("email", "abc@gmail.com");
		  data.put("location", loc);
		  data.put("employer", emp);
		  
		  		String err=given().header("Content-Type","application/json")
		  					.body(data.toJSONString())
		  			.when()
		  				.post("http://3.13.86.142:3000/contacts")
		  			.then()
		  				.log()					
		  				.body()
		  				.statusCode(400)
		  			.extract().path("err");
		  		Assert.assertEquals(err,"Contacts validation failed: lastName: Last Name is required");
	
		  }
	 @Test(enabled=true,description="adding new contact with too many character")
	  public void addNewContactMoreSize() {
		  System.out.println("creating");		
		  JSONObject data=new JSONObject();
		  JSONObject emp=new JSONObject();
		  JSONObject loc=new JSONObject();
		  
		  loc.put("city","Mumbai");
		  loc.put("country","India");
		  emp.put("jobTitle", "QA");
		  emp.put("company", "LTI");	  
		  
		  data.put("firstName", "PayalPayalPayalPayalPayalPayalPayalPayalPayalPayal");
		  data.put("lastName", "Smith");
		  data.put("email", "abc@gmail.com");
		  data.put("location", loc);
		  data.put("employer", emp);
		  
		  		String err=given().header("Content-Type","application/json")
		  					.body(data.toJSONString())
		  			.when()
		  				.post("http://3.13.86.142:3000/contacts")
		  			.then()
		  				.log()					
		  				.body()
		  				.statusCode(400)
		  			.extract().path("err");
		  		Assert.assertEquals(err.contains("is longer than the maximum allowed length"),true);
		  			
		  }
	 @Test(enabled=true,description="adding new contact with invalid character")
	  public void addNewContactWithInvalidChar() {
		  System.out.println("creating");		
		  JSONObject data=new JSONObject();
		  JSONObject emp=new JSONObject();
		  JSONObject loc=new JSONObject();
		  
		  loc.put("city","Mumbai");
		  loc.put("country","India");
		  emp.put("jobTitle", "QA");
		  emp.put("company", "LTI");	  
		  
		  data.put("firstName", "Payal123");
		  data.put("lastName", "Smith");
		  data.put("email", "abc@gmail.com");
		  data.put("location", loc);
		  data.put("employer", emp);
		  
		  		String err=given().header("Content-Type","application/json")
		  					.body(data.toJSONString())
		  			.when()
		  				.post("http://3.13.86.142:3000/contacts")
		  			.then()
		  				.log()					
		  				.body()
		  				.statusCode(400)
		  			.extract().path("err");
		  		Assert.assertEquals(err.contains("Validator failed for path `firstName` with value"),true);
		  			
		  }
	 
	 @Test(enabled=true,description="adding new contact with wrong format")
	  public void addNewContactWithWrongFormat() {
		  System.out.println("creating");		
		  JSONObject data=new JSONObject();
		  JSONObject emp=new JSONObject();
		  JSONObject loc=new JSONObject();
		  
		  loc.put("city","Mumbai");
		  loc.put("country","India");
		  emp.put("jobTitle", "QA");
		  emp.put("company", "LTI");	  
		  
		  data.put("firstName", "Payal");
		  data.put("lastName", "Smith");
		  data.put("email", "abcgmail.com");
		  data.put("location", loc);
		  data.put("employer", emp);
		  
		  		String err=given().header("Content-Type","application/json")
		  					.body(data.toJSONString())
		  			.when()
		  				.post("http://3.13.86.142:3000/contacts")
		  			.then()
		  				.log()					
		  				.body()
		  				.statusCode(400)
		  			.extract().path("err");
		  		Assert.assertEquals(err.contains("Validator failed for path `email` with value"),true);
		  			
		  }
}
