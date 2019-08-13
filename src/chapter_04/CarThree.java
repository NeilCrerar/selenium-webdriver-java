/* Udemy: Selenium Webdriver with Java: Classes and Methods - Object Orientated Concepts
Extends earlier demonstration to show how can use constructors on a class and how a class can have different
constructors performing different actions.  Works in conjunction with 'ConstructorDemo'.
 */
package chapter_04;
public class CarThree {
    private String make;
    int speed;
    int gear;

    // Example of a constructor without any parameters and a println to show it is being called
    public CarThree() {
        this.speed = 0;
        this.gear = 0;
        System.out.println("Executing constructor without arguments");
    }

    // Second example of a constructor with parameters and a println to show it is being called.
    public CarThree(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        System.out.println("Executing constructor with arguments");
    }

    // Set value for the car make attribute.  Remember "this" refers to the instance of the class (object)
    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }
}