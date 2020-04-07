package apiModels;

import io.restassured.RestAssured;
import org.junit.Test;
import utilities.ExcelUtil;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class SchemaTesting {

    @Test
    public void testJsonSchema() {
        //http://restservicestesting.blogspot.com/2016/10/validate-json-schema-using-rest-assured.html
        RestAssured
                .get("https://jsonplaceholder.typicode.com/comments?postId=1")
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("JsonSchemaFile.json"));
    }  @Test
    public void testJsonSchema2() {
        //http://restservicestesting.blogspot.com/2016/10/validate-json-schema-using-rest-assured.html
        RestAssured
                .get("https://restapi.demoqa.com/utilities/weather/city/all")
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("weather.json"));
    }

    @Test
    public void excelTest(){
        ExcelUtil util = new ExcelUtil("./src/format.xlsx","Sheet1");
       String res= util.getCellData(5,3);
        System.out.println(res);
        util.setCellData("Serghei",0,1);
    }


}