/*
Udemy: Selenium Webdriver with Java: Java Concepts - Data Types
Demonstrates being able to use the default values for different primitive variable types by setting them as global
variables that are then used within a main method.
 */
package chapter_03;

public class VariablesDefaultValues {
    static byte myByteVariable;
    static short myShortVariable;
    static int myIntVariable;
    static long myLongVariable;
    static float myFloatVariable;
    static double myDoubleVariable;
    static boolean myBooleanVariable;
    static char myCharVariable;

    public static void main(String[] args) {
        System.out.println("Default value for byte variable: " + myByteVariable);
        System.out.println("Default value for short variable: " + myShortVariable);
        System.out.println("Default value for int variable: " + myIntVariable);
        System.out.println("Default value for long variable: " + myLongVariable);
        System.out.println("Default value for float variable: " + myFloatVariable);
        System.out.println("Default value for double variable: " + myDoubleVariable);
        System.out.println("Default value for boolean variable: " + myBooleanVariable);
        System.out.println("Default value for char variable: " + myCharVariable);
    }
}
