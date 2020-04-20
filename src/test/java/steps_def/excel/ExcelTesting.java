package steps_def.excel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import utilities.ExcelUtil;

public class ExcelTesting {
    ExcelUtil excelUtil = new ExcelUtil("src/format.xlsx","Sheet1");
    @Given("user open the excel and read one data")
    public void user_open_the_excel_and_read_one_data() {
       String readIt = excelUtil.getCellData(0,1);
        System.out.println(readIt);


    }

    @Then("user right some data")
    public void user_right_some_data() {
        excelUtil.setCellData("BuciuscanPass",0,1);

    }

    @Then("user close the program and save everything")
    public void user_close_the_program_and_save_everything() {


    }
}
