package chapter_04;
/* Udemy: Selenium Webdriver with Java: Classes and Methods - Object Orientated Concepts
Demonstrates the use of the 'main' method in Java as an entry point to being able to do thing in a java class.
 */
public class MethodsDemo {

    // In order to do anything, a Java class must have a 'main' method to act as the entry-point for the class
    public static void main(String[] args) {
        String a = "Hey, there !!!";
        System.out.println(a);
    }

    // you can have other classes as well as a main class but if they are not called from the main class they will not
    // be executed.
    public static void methodNum() {
        String a = "Hello, its me again !!!";
        System.out.println(a);
    }
}