package chapter_03;
/*
Udemy: Selenium Webdriver with Java: Java Concepts - Data Types
Demonstrates the string reference variable type and demonstrates different ways to declare a string variable or object
and how this affects how it is stored and managed in memory.
*/

public class StringsExample {

    public static void main(String[] args) {
        String myStringVariable = "This is a test string";
        System.out.println("String as a string literal: " + myStringVariable);

        String myStringVariableB = "This is a test string";
        System.out.println("Second string literal with same contents: " + myStringVariableB);

        myStringVariable = "Hey hey we're the monkees";
        System.out.println("Updated only the first string literal: " + myStringVariable);
        System.out.println("Second string literal with same contents: " + myStringVariableB);

        String anotherStringVariable = new String("A String created as an object");
        System.out.println("String as an object: " + anotherStringVariable);

    }

}
