package com.example.test.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.model.Registration;
import com.example.test.service.RegisterService;

@RestController
@RequestMapping("/home")
public class TestApplicationController {

  @Autowired 
  private RegisterService registerService;
  
  @GetMapping("/hello")
  public String hello() {
    return "Hello Hello";
  }
  
  @PostMapping("/data")
  public String InsertData(@RequestBody Registration registrationData) {
    registerService.save(registrationData);
    return "Data Inserted Successfully";
  }
  
  
  @GetMapping("/getData")
  public String getData() {
    ArrayList<Registration> list= (ArrayList<Registration>) registerService.findAll();
    for (Registration tmp: list){
      System.out.println(tmp.toString());
  }
    return list.toString();
  }
  
  @GetMapping("/getDataById")
  public String getDataById(@RequestParam(required= true) Long id) {
    Optional<Registration> list= registerService.findById(id);
    return list.toString();
  }
  
  @PostMapping("/updateData")
  public String updateData(@RequestBody Registration registrationData,@RequestParam(required= true) Long id) {
    registrationData.setId(id);
    registerService.save(registrationData);
    return "Data Updated Successfully";
  }
  
  @PostMapping("/deleteDataById")
  public String deleteDataById(@RequestParam(required= true) Long id) {
    registerService.deleteById(id);
    return "Data Updated Successfully";
  }
}
