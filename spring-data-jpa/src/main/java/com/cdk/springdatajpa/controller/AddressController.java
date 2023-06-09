package com.cdk.springdatajpa.controller;

import com.cdk.springdatajpa.entity.Address;
import com.cdk.springdatajpa.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    private AddressRepository addressRepository;


    @GetMapping("/getAddress")
    public List<Address> getAddress(){
        return addressRepository.findAll();

    }
}
