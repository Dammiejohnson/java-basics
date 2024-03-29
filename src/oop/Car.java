package oop;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car ->  startEngine()";
    }

    public String accelerate(){
        return "Car ->  accelerate()";
    }

    public String brake(){
        return "Car ->  brake()";
    }

}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //return super.startEngine(); this is to call the super function
        return "Mitsubishi ->  startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi ->  accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi ->  brake";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //return super.startEngine(); this is to call the super function
        return  getClass().getSimpleName() + " ->  startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford ->  accelerate()";
    }

    @Override
    public String brake() {
        return "Ford ->  brake";
    }
}

class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        //return super.startEngine(); this is to call the super function
        return  getClass().getSimpleName() + " ->  startEngine()";
    }

    @Override
    public String accelerate() {
        return  getClass().getSimpleName() + " ->  startEngine()";
    }

    @Override
    public String brake() {
        return  getClass().getSimpleName() + " ->  startEngine()";
    }
}

class Main{
    public static void main(String[] args) {
        Car car = new Car(8,"Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden(6, "holden");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

    }
}



