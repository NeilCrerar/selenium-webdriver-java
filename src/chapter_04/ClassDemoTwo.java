package chapter_04;
/* Udemy: Selenium Webdriver with Java: Classes and Methods - Object Orientated Concepts
Demonstrates being able to create an object defined in another class and access/update it.
Works in conjunction with 'CareOne'.
 */
public class ClassDemoTwo {
    public static void main(String[] args) {
        // create and initialise a new object of the class 'car'
        CarTwo bmw = new CarTwo();
        // set the value for the 'make' attribute of the car object by accessing the corresponding 'setter' method in
        // that class
        bmw.setMake("BMW");
        // show that the attribute value has been successfully set for that object
        System.out.println("The make of the car is a.... " + bmw.getMake());

        // create and initialise a second object from th class 'car'
        CarTwo merc = new CarTwo();
        merc.setMake("Mercedes");
        System.out.println("\nThe make of the car is... " + merc.getMake());
        merc.setModel("C300");
        System.out.println("The model of the car is... " + merc.getModel());
        // Try and set an invalid year value for the car object
        merc.setYear(1880);
        // Note that because the year we gave was invalid, no value is set for that attribute and we see the validation
        // failure message we created.  However -- because the 'year' attribute for the car is an int get a default
        // value assigned for it
        System.out.println("The year of the car is... " + merc.getYear());
        // Get same default value if we access the colour attribute, which gives 'null' as it is a string
        System.out.println("The colour of the car is... " + merc.getColour());
    }

}
