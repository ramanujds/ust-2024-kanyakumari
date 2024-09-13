package com.app.employeehierarchy.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public sealed class Employee permits Developer, Executive, Manager {

   private int id;
   private String name;
   private String position;
   private double salary;



}
