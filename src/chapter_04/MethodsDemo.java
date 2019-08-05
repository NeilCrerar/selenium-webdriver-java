package chapter_04;

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