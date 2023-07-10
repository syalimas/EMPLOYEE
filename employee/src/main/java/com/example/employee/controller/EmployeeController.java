package com.example.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.DTO.AddressDTO;
import com.example.employee.DTO.EmployeeDTO;
import com.example.employee.service.iEmployeeService;


@RestController
@RequestMapping("/employee")


public class EmployeeController {

    @Autowired
    iEmployeeService iemployeeservice;

    @RequestMapping(value = "/_create", method = RequestMethod.POST)

    public ResponseEntity<String> createemployee(@RequestBody EmployeeDTO request) {
        if(request.getName().equals("")){
            return new ResponseEntity<>("Name NOt Blank", HttpStatus.BAD_REQUEST);
        else{
            iemployeeservice.saveEmployee(request);
        return new ResponseEntity<>("Saved successfully", HttpStatus.OK);
        }
    }
        @RequestMapping(value = "/_create", method = RequestMethod.POST)
    public ResponseEntity<String> createaddress(@RequestBody AddressDTO request) {
        if(request.getName().equals("")){
            return new ResponseEntity<>("Name NOt Blank", HttpStatus.BAD_REQUEST);
        else{
            iemployeeservice.saveAddress(request);
        return new ResponseEntity<>("Saved successfully", HttpStatus.OK);
        }

    }

   
}
