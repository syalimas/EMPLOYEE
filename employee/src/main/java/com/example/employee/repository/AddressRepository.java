package com.example.employee.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.model.Address;

@Repository

public class AddressRepository extends JpaRepository <Address,UUID> {
    
}
