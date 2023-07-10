package com.example.employee.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AddressDTO {
    private long id;
    private int addressid;
    private int empid;
    private String housename;
    private String place;
    private String pincode;


    
}
