package managment.requestModel;

import lombok.Data;

@Data
public class ContactRequest {
    private String fullName;
    private String email;
    private String mobileNumber;
    private String city;
}
