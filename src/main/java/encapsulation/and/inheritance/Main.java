package encapsulation.and.inheritance;

import encapsulation.and.inheritance.ball.Ball;
import encapsulation.and.inheritance.ball.Spike;
import encapsulation.and.inheritance.ball.Water;

public class Main {
    //A class is a blueprint for creating an object.
    //An instance is the construction of your object
    // 'static' makes sure that the item it is called on maintains only one instance of itself

    // a static method or field is one that only has one instance of itself

    // an instance method or filed is one that is attached to each instance of the object

    // a constructor is what allows you to define the acceptable parameters for
    // dynamically creating your objects

    // 4 core pillars of OOP
    // Encapsulation
    // Inheritance
    // Abstraction
    // Polymorphism

    // Encapsulation is hiding data, being able to control read/write access
    // to an object.

    // Inheritance is creating hierarchy between objects in your code, when you use inheritance
    // , youre saying that the child (subclass) object is type the parent (base)

    // Abstraction is hiding implementation  from the user of the class.
    // two ways to do abstraction
    // - Abstract classes
    // - interfaces

    // Polymorphism is making pieces of your code do different things.
    // You can make these pieces of code do different things, depending on where
    // and how they are called

    // Method overriding
    // Method overloading




    //Ball is round - feature
    //Ball has diameter - feature
    //Ball bounces - behaviour/ action

    public static void main(String[] args) {
        //write your code here
//        Ball leatherBall = new Ball(true,40); // instance of an object
//
//        Ball rubberBall = new Ball(true,10);
//
//        Ball americanFootball = new Ball(false, 20);
//
//        leatherBall.setDiameter(4);
//        System.out.println("The diameter of the ball is: " + leatherBall.getDiameter());
//        System.out.println("The diameter of the americanfootball is: " + americanFootball.getDiameter());
//
//        leatherBall.bounce(); // a call to the INSTANCE method 'bounce'
//
//        Ball.keepBallRound();
//
//        Spike spike = new Spike(true, 20, 100);
//
//        spike.bounce();
//
//        System.out.println(spike.getNumOfSpikes(4));
//
//        System.out.println(spike.getDiameter());
//
//        spike.keepBallRound();


        //Animal animal = new Animal("Bingo");
        Water rainWater = new Water();
        Water springWater = new Water(true, true, true);

        System.out.println(springWater.isColorless());
        System.out.println(springWater.isTasteless());

    }
}
