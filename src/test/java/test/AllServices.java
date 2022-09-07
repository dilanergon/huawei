package test;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import utility.AllureLogger;
import utility.BaseTest;


import static io.restassured.RestAssured.given;


public class AllServices extends BaseTest {

    public static String id ="0";
    public static String petId ="9223372036854406000";
    public static String status="available";
    public static String quantity="0";
    public static String shipDate="2022-09-07T10:19:03.039Z";
    public static boolean complete=true;


    @Test
    public void get_findByStatus() {

        AllureLogger.logToAllure("Starting the test to get find by status");
        AllureLogger.logToAllure("Sending the GET request");
        Response response = given()
                .spec(requestSpec)
                .contentType("application/json")
                .when()
                .get("/pet/findByStatus?status"+status)
                .then()
                .assertThat().statusCode(200)
                .extract().response();


        logResponseAsString(response);

    }

    @Test
    public void get_PetsById() {

        AllureLogger.logToAllure("Starting the test to get pets by Id");
        AllureLogger.logToAllure("Sending the GET request");
        Response response = given().
                spec(requestSpec).
                contentType("application/json").
                when().
                get("/pet/"+petId);


        logResponseAsString(response);

        ResponseBody body = response.getBody();
        String bodyAsString = body.asString();

        response.then().spec(responseSpec);

    }

    @Test
    public void post_Order() {

        JSONObject requestParams = new JSONObject();
        requestParams.put("id", id);
        requestParams.put("petId",petId);
        requestParams.put("quantity",quantity);
        requestParams.put("shipDate",shipDate);
        requestParams.put("status",status);
        requestParams.put("complete",complete);

        AllureLogger.logToAllure("Starting the test to post order");

        AllureLogger.logToAllure("Sending the post request");
        Response response = given().
                spec(requestSpec).
                contentType("application/json").
                body(requestParams).
                post("/store/order");

        logResponseAsString(response);

    }

}
