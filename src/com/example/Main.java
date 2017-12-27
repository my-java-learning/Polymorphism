package com.example;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats a lot of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet Earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class ForgettableMovie extends Movie{
    public ForgettableMovie(){
        super("Forgettable");
    }
}

public class Main {

    public static void main(String[] args) {
	    for (int i = 1; i <= 10; i++){
	        Car car = randomCar();
            System.out.println("Car " + i + " : " + car.getName() + "\n" +
                    "Acceleration: " + car.accelerate() + "\n");
        }
    }

    public static Car randomCar(){
        int randomNumber = (int)(Math.random()*3 +1);
        System.out.println("Random number : " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Golf();
            case 2:
                return new Carrera();
            case 3:
                return new Gallardo();
            default:
                return null;
        }
    }
}

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine(){
        return "Car engine started";
    }

    public String accelerate(){
        return "Car accelerated";
    }

    public String brake(){
        return "Car stopped";
    }
}

class Golf extends Car{
    public Golf() {
        super("Golf" , 100);
    }

    @Override
    public String accelerate() {
        return "Golf accelerates 10 m/s";
    }
}

class Carrera extends Car{
    public Carrera() {
        super("Carrera", 250);
    }

    @Override
    public String accelerate() {
        return "Carrera accelerates 15 m/s";
    }
}

class Gallardo extends Car{
    public Gallardo() {
        super("Gallardo", 400);
    }

    @Override
    public String accelerate() {
        return "Gallardo accelerates 20 m/s";
    }
}
