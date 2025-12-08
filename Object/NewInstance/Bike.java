// package com.classes;

public class Bike {
    
    protected String name;
    protected int speed;
    protected double price;

    public Bike(){}

    public Bike(String name, int speed, double price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }
    
    public void bikeDetails() {
        System.out.println("Bike Details");
        System.out.println("Bike Name : "+name+"\nBike Speed : "+speed+"/hrs\nBike Price : "+price);
    }

}
