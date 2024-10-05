package com.springapp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;

@Component
@Scope
public class Phone {


    public Phone(){
        System.out.println("Phone Bean Created");
    }

    @Autowired(required = false)
    private Sim sim;

    @Value("${phone.brand}")
    private String brand;
    @Value("${phone.model}")
    private String model;
    @Value("${phone.price}")
    private double price;

    public Sim getSim() {
        return sim;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public Phone(Sim sim) {
        this.sim = sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public void call(String phnNo){
        sim.call(phnNo);
    }

    public void sendText(String phnNo, String message){
        sim.sendText(phnNo,message);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Phone.class.getSimpleName() + "[", "]")
                .add("brand='" + brand + "'")
                .add("model='" + model + "'")
                .add("price=" + price)
                .toString();
    }
}
