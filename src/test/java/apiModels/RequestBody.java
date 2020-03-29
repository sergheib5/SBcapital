package apiModels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestBody {

    String premanentAddress;
    String section;
    String subject;
    int batch;
    String birthDate;
    String department;
    String gender;
    String password;
    String phone;
    String firstName;
    String lastName;
    String emailAddress;
    String joinDate;
    int salary;
    int teacherId;

    String major;
    String admissionNo;
    Contact contact;
    Company company;

}
