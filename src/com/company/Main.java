package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car1 = new Car("mersedes");
        Car car2 = new Car("bmw");
        Car car3 = new Car("");

        car1.setColor("black");
        car2.setColor("red");
        while (car2.speed<100) {
            car2.accelerate(10);
        }
        car2.accelerate(200);
        System.out.println(car2.speed);

        while (car1.speed>0) {
            car1.slowDown(1);
        }
        System.out.println(car1.speed);
        printMemory();

        Car[][] Cars = new  Car[10000][10000];
        for(int i=0;i<1010;i++){
            Cars[1][i] = new Car("nnn");
        }
        printMemory();
        Runtime.getRuntime().gc();
        printMemory();
    }

    public static void printMemory() {
        System.out.println("Max nem:   "+Runtime.getRuntime().maxMemory());
        System.out.println("Total nem: "+Runtime.getRuntime().totalMemory());
        System.out.println("Free nem:  "+Runtime.getRuntime().freeMemory());

    }
}
