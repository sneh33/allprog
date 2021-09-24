package gitHub;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class gettingAllRepositories {
  @Test(enabled=false, description="getting all repositories")
  public void f() {
	  given()
	    .auth()
	    .oauth2("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")
	  .when()
	    .get("https://api.github.com/user/repos")
	  .then()
	    .log()
	    .body()
	    .statusCode(200);
	  
  }
  
	  @Test(enabled=true, description="creating repository")
	  public void createRepository() {
		  JSONObject para=new JSONObject();
		  para.put("name", "Restassure");
		  para.put("description", "Sample for post Request");
		  para.put("homepage", "https://github.com/sneh33");
		  given()
		    .auth()
		    .oauth2("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")
		    .header("Content-Type","application/json")
		    .body(para.toJSONString())
		  .when()
		    .post("https://api.github.com/user/repos")
		  .then()
		    .log()
		    .body()
		    .statusCode(201);
		  
	  }
}
