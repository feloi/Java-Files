package com.eloi.userdpt.entities;

import javax.persistence.*;

@Entity
@Table(name = "tb_user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private  String email;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private  Department department;

    public User(){

    };

    private Long getId(){
      return id;
    };
    private void setId(Long id){
      this.id = id;
    };
    private String getName(){
        return name;
    };
    private void setName(String name){
        this.name = name;
    };
    private String getEmail(){
        return email;
    };
    private void setEmail(String email){
        this.name = name;
    };
    public Department getDepartment(){
        return department;
    };
    public void setDepartment(Department department){
        this.department = department;
    };
}
