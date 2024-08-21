package com.ust.example.model;
public class Person {

    // properties, fields, states
    private String name;
    private int age;
    private String location;

    // methods, behaviours

public Person(){}

    public Person(String name, int age, String location){
        this.name=name;
        this.age=age;
        this.location=location;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void eat(){
        System.out.println("Eating something");
    }

    public void eat(String food){
        System.out.println("Eating "+food);
    }

    public void eat(String food, String juice){
        System.out.println("Eating "+food+ " and " +juice);
    }

    public void sayHello(){
        System.out.println("Hello, I am a person");
    }



}
