package managment.requestModel;

import lombok.Data;

@Data
public class ClientRequest {
    private String name;
    private String designation;
    private String description;
    private String imageUrl;
}