// package com.classes;

public class Car implements Cloneable {

    protected String name;
    protected int speed;
    protected double price;

    public Car() {}

    public Car(String name, int speed, double price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public void carDetails() {
        System.out.println("Car Details");
        System.out.println("Car Name : " + name + "\nCar Speed : " + speed + "/hrs\nCar Price : " + price);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();        
    }

}
