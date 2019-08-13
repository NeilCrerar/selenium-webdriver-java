/* Udemy: Selenium Webdriver with Java: Classes and Methods - Object Orientated Concepts
Demonstrates the use of constructors for Java classes both with and without parameters and how a single class 
can have multiple constructors associated with it.  Works in conjunction with 'CarThree'.
 */
package chapter_04;
public class ConstructorDemo {

    public static void main(String[] args) {

        /* Create new car object.  As we are not supplying any parameters when creating the object, the default non-
        parameter constructor will be used
        */
        CarThree beemer = new CarThree();

        // Demontrate that we can set an attribute for the new class
        beemer.setMake("BMW");
        System.out.println("The make of the car is: " + beemer.getMake());

        // Demonstrate that as used default constructor we are getting the default values for the other class attributes
        System.out.println("The speed of the car is: " + beemer.speed);
        System.out.println("The gear the care is in: " + beemer.gear);
        System.out.println("******************************************");

        /* create a second car object but supply parameters to it so that we execute the second constructor for the car
        class.
        */
        CarThree ford = new CarThree(20, 2);
        /* Demonstrate that because we passed in parameters, these are used instead of the any default values set for
        the class.
         */
        System.out.println("The speed of the car is: " + ford.speed);
        System.out.println("The gear the care is in: " + ford.gear);
        System.out.println("******************************************");
    }
}