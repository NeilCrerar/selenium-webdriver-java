/*
Udemy: Selenium Webdriver with Java: Java Concepts - Data Types
Demonstrates how to declare an array variable and a couple of methods to manipulate the content
*/
package chapter_03;
import java.util.*;

public class ArraysDemo {
    public static void main(String[] args) {
        /* Declare an array using the [ ] square brackets and the 'new' keyword.  The number inside the brackets defines
        the number of elements in the array so the JVM knows how much memory to assign to it
         */
        int[] myIntArray1 = new int[10];
        // Assign values to each of the elements in the array by giving the index for the element and the value
        myIntArray1[0] = 100;
        myIntArray1[1] = 50;
        // can then print out each of the elements by giving the index position
        System.out.println("My first array variable......");
        System.out.println("  Index 0: " + myIntArray1[0]);
        System.out.println("  Index 1: " + myIntArray1[1]);
        /* Declared an array of 10 elements but only assigned values to two of these.  As it's an int array, however,
        java gives each element a default value of 0
         */
        System.out.println("  Index 2: " + myIntArray1[2]);


        /* Alternatively, we can also declare an array and the values that we want it to contain at the same time
         */
        int[] myIntArray2 = {12, 87, 56, 74, 99};
        System.out.println("\nMy second array variable......");
        System.out.println("  Index 0: " + myIntArray2[0]);
        System.out.println("  Index 1: " + myIntArray2[1]);
        System.out.println("  Index 2: " + myIntArray2[2]);
        System.out.println("  Index 3: " + myIntArray2[3]);
        System.out.println("  Index 4: " + myIntArray2[4]);
        /* With this method, however, if you try and access an element that has not had a value assigned it will produce
        an 'index out of bounds' error - uncomment below to see an example
        */
        // System.out.println("  Index 4: " + myIntArray2[5]);

        /* Can create an array of any other type of variable but the values assigned to it can only be of that type.
         */
        String[] myStringArray = {"Robert", "Jane", "Frederick", "Anna"};
        System.out.println("\nExample of a string array variable......");
        System.out.println("  Index 0: " + myStringArray[0]);
        System.out.println("  Index 1: " + myStringArray[1]);
        System.out.println("  Index 2: " + myStringArray[2]);
        System.out.println("  Index 3: " + myStringArray[3]);
        // Try changing one of the strings above to an Int an it will cause and error when you run the class

        /* As with other variable types, there are a number of methods that can be used to manipulate an array and its
        contents
         */
        // Can get the length of the array - i.e. the number of elements in it
        int length1 = myIntArray2.length;
        int length2 = myStringArray.length;

        /* Once you know the length, can then use that with other methods to do things like iterate through the array,
        printing out the value of each element
         */
        System.out.println("\nPrint the contents of an array in one go......");
        for (int i = 0; i <length2; i++) {
            System.out.println("  " + myStringArray[i]);
        }

        // Or sort an array into order
        System.out.println("\nSort an array into numerical order......");
        Arrays.sort(myIntArray2);
        for (int i = 0; i < length1; i++){
            System.out.println("  " + myIntArray2[i]);
        }
    }
}
