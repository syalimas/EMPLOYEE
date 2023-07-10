package com.example.employee.service;
import org.springframework.stereotype.Service;

import com.example.employee.DTO.AddressDTO;
import com.example.employee.DTO.EmployeeDTO;

@Service
public interface iEmployeeService {
    public void saveEmployee(EmployeeDTO request);

    public void saveAddress(AddressDTO request);
    
}
