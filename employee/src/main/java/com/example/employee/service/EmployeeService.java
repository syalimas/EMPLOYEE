package com.example.employee.service;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.employee.DTO.AddressDTO;
import com.example.employee.DTO.EmployeeDTO;
import com.example.employee.model.Address;
import com.example.employee.model.Employee;

public class EmployeeService implements iEmployeeService{

    @Autowired
    ModelMapper modelmapper;

    @Autowired
    EmployeeDTO empRepo;

    @Autowired
    AddressDTO addrRepo;

    public void saveEmployee(EmployeeDTO request) {

        Employee emp = modelmapper.map(request,Employee.class);
        empRepo.save(emp);

    }

    public void saveAddress(AddressDTO request) {

        Address addr = modelmapper.map(request, Address.class);
        addrRepo.save(addr);

    }
    
}

