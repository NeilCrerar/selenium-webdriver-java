/* Udemy: Selenium Webdriver with Java: Classes and Methods - Object Orientated Concepts
Demonstrates being able to create an object defined in another class and access/update it.
Works in conjunction with 'CarOne'.
 */

package chapter_04;
public class ClassDemoOne {
    public static void main(String[] args) {
        // create and initialise a new object of the class 'car'
        CarOne bmw = new CarOne();
        // set the value for the 'make' attribute of the car object by accessing the corresponding 'setter' method in
        // that class
        bmw.setMake("BMW");
        // show that the attribute value has been successfully set for that object
        System.out.println("The make of the car is a.... " + bmw.getMake());
    }

}
