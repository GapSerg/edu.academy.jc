package com.company;

public class Car {
    private String model;
    private String color;
    int speed;

    private Car(){
       this("BMW","Black");
    }

    public Car(String model) {
        this(model, "red");
    }

    public Car(String model, String color) {
        this.model = model;
        this.color = color;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int accelerate(int speed) {
        if ((this.speed + speed)>250){
            System.out.println ("It is too fast!!");
            return this.speed;
        }
        else {
            return this.speed = this.speed + speed;
        }
    }

    public int slowDown(int speed) {
        return this.speed = this.speed - speed;
    }
}
