package contactListApi;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PositiveTests {
	String id;
  @Test(enabled=false,description="getting all contact info")
  public void getallcontact() {
	  										//use RestAssured.given() if static import not used
	  			given()
	  			.when()
	  				.get("http://3.13.86.142:3000/contacts")
	  			.then()
	  				.log()					//print
	  				.body()
	  				.statusCode(200);		//assertion
	  }
  
  @Test(enabled=true,description="adding new contact")
  public void addnewcontact() {
	  System.out.println("creating");		
	  JSONObject data=new JSONObject();
	  JSONObject emp=new JSONObject();
	  JSONObject loc=new JSONObject();
	  
	  loc.put("city","Mumbai");
	  loc.put("country","India");
	  emp.put("jobTitle", "QA");
	  emp.put("company", "LTI");	  
	  
	  data.put("firstName", "John");
	  data.put("lastName", "Smith");
	  data.put("email", "abc@gmail.com");
	  data.put("location", loc);
	  data.put("employer", emp);
	  
	  		id = given().header("Content-Type","application/json")
	  					.body(data.toJSONString())
	  			.when()
	  				.post("http://3.13.86.142:3000/contacts")
	  			.then()
	  				.log()					
	  				.body()
	  				.statusCode(200)
	  			.extract().path("_id");
	  			System.out.println("id "+id);
	  }
  
  @Test(enabled=true,dependsOnMethods="addnewcontact",description="get specific contact")
  public void getspecificcontact() {
	  System.out.println("Get specific contact");		
	  										
	  			given()
	  			.when()
	  				.get("http://3.13.86.142:3000/contacts/"+id)
	  			.then()
	  				.log()					
	  				.body()
	  				.statusCode(200);		
	  }
  
  @Test(enabled=true,dependsOnMethods="getspecificcontact",description="updatecontact")
  public void updatecontact() {
	  System.out.println("Updating");		
	  JSONObject data=new JSONObject();
	  JSONObject emp=new JSONObject();
	  JSONObject loc=new JSONObject();
	  
	  loc.put("city","Mumbai");
	  loc.put("country","India");
	  emp.put("jobTitle", "QA");
	  emp.put("company", "LTI");	  
	  
	  data.put("firstName", "Mina");
	  data.put("lastName", "Sharma");
	  data.put("email", "abc@gmail.com");
	  data.put("location", loc);
	  data.put("employer", emp);
	  
	  		given().header("Content-Type","application/json")
	  					.body(data.toJSONString())
	  			.when()
	  				.put("http://3.13.86.142:3000/contacts/"+id)
	  			.then()
	  				.log()					
	  				.body()
	  				.statusCode(204);
	  }
  
  @Test(enabled=true,dependsOnMethods="updatecontact",description="delete contact")
  public void deletecontact() {
	  			System.out.println("deleting");						
	  			given()
	  			.when()
	  				.delete("http://3.13.86.142:3000/contacts/"+id)
	  			.then()
	  				.log()					
	  				.body()
	  				.statusCode(204);		
	  }
  
}
