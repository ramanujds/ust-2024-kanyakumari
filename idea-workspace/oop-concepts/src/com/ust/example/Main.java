package com.ust.example;

import com.ust.example.model.Employee;
import com.ust.example.model.Person;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Employee();

        person1.sayHello();

        person1 = new Person();

        person1.sayHello();


    }
}