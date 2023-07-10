package com.example.employee.model;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name="address_details")

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name="address_id")
    private int addressid;

    @ManyToOne
    @JoinColumn(name="emp_id")
    private Employee empid;


    @NotEmpty
    @Column(name="house_name")
    private String housename;

    @NotEmpty
    @Column(name="place")
    private String place;

    @Column(name="pin_code")
    private String pincode;





    
}
