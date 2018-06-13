package com.example.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.metamodel.StaticMetamodel;

import org.springframework.stereotype.Component;

@Entity
public class Registration {

  @Id
  @GeneratedValue(strategy=GenerationType.SEQUENCE)
  private Long id;
  
  @Column(name="Name")
  private String name;
  
  @Column(name="Age")
  private String age;
  
  @Column(name="Address")
  private String address;

  public Registration() {
  }
  
  public Registration(Long id, String name, String age, String address) {
    super();
    this.id = id;
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    String output = "Id is: "+ id + "|| Name is: "+name+"|| Age is:"+age+"|| Place is: "+address;
    return output;
  }
  
  
}
