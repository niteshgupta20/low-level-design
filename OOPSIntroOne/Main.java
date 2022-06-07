package OOPSIntroOne;

public class Main {

    public static void main(String[] args) {
        // Create an Object
//        Human chiiti = new Human();
//        System.out.println("Wapas aa gaya constuctor se");
//        chiiti.age = 23;
//        chiiti.weight = 32;
//        chiiti.sleep();
//
//        Human obj = new Human(12, 89);
//        System.out.println("Age is " + obj.age + " and Weight is " + obj.weight);

        //System.out.println("No. of Objects Created " + Human.count);

//        Male alpha = new Male();
//        alpha.sleep();
//          Scorpio fav = new Scorpio();
//          fav.intro();

        Dog goldy = new Dog();
        goldy.speak();
    }
}

class Male extends Human {

}

class Human{
    //properties or data members
    int age;
    int weight;
    // Number of Objects Created
    //static int count = 0;

    //default constructor

    // 2 types:
    // no arg constructor
    public Human(){
       // count++;
        age = 0;
        System.out.println("Inside the Constructor - Creating Objects");
    }

    //parameterized constructor
    public Human(int age, int weight){
        this();  // no - arg constructor access Kr liya.
      //  count++;
        this.age = age;
        this.weight = weight;
    }

    // Constructor Overloading
    public Human(int age){
      //  count++;
        this.age = age;
    }


    //behaviour or data functions
    void sleep(){
        System.out.println("Bhaiya is Sleeping");
    }

    void eat(){
        System.out.println("Bhaiya is Eating");
    }

//    static void update(){
//        count++;
//    }

}

class Scorpio extends Mahindra{
    String color;
}


class Mahindra extends Car {
    int rating;

    void intro(){
        System.out.println("This is mahindra");
    }
}


class Car{
    String color;
    int weight;

    void runCar(){
        System.out.println("Car is running");
    }

    void runCar(int speed){
        System.out.println("Car is running at speed " + speed);
    }

    int runCar(int a, int b){
        System.out.println("Car is running");
        return 0;
    }

    void breakCar(){
        System.out.println("car is breaking");
    }
}

class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("mein toh woof karega");
    }
}


class Animal{
    int age;
    int weight;

    void speak(){
        System.out.println("Haaye");
    }
}




