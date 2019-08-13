/* Udemy: Selenium Webdriver with Java: Classes and Methods - Object Orientated Concepts
Demonstrates being able to create an object defined in one class (in this case a car) and access/update it from another.
Works in conjunction with 'ClassDemoOne'.
 */

package chapter_04;
public class CarOne {
    /* Create a series of class variables for specific attributes of a car.  These are set as 'private' meaning they
    are only available for use within the class and can't be accessed by any class or method external to this class.
     */
    private String colour;
    private String make;
    private String model;
    private int year;

    /* Demonstration of 'getters and setter's for the class.  These represent basic methods associated with a class
    the allow for encapsulation.  As the class variables are not accessible outside of the class, we need a way for
    other classes/methods to be able to to get the variable values and see what they contain  or to update them by
    setting te values
     */
    public String getColour() {
        return this.colour;
    }
    public void setColour (String colour) {
        this.colour = colour;
    }

    public String getMake() {
        return this.make;
    }
    public void setMake (String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }
    public void setModel (String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }
    public void setYear (int year) {
        this.year = year;
    }

    // example of a method associated with the class that represents a 'behaviour' of a car.
    public void increaseSpeed() {
        System.out.println("Speeding up !!");
    }
}
