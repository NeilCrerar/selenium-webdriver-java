/* Udemy: Selenium Webdriver with Java: Conditional Statements and Loops
Demonstrates the 'while' loop in Java.  This has a modified example to the one used in the course as I found I can
understand this version below more easily.
 */
package chapter005;

public class WhileLoopDemo {
    public static void main(String[] args) {

        System.out.println("This is an example of a while loop where the condition is evaluated first and then the loop" +
                " actions are executed.  In this example it will print out the numbers from 1-10");
        int a = 1;
        while (a < 10) {
            System.out.println("Inside the loop, the value of 'a' is: " + a);
            a++;
        }
        System.out.println("The loop condition has been met and we are now outside of the loop...");

        System.out.println("\n*******************************************");
        System.out.println("This is another example of a while loop where we nest other conditions in the loop actions " +
                "and this time we do not print out any even numbers.");
        int b = 1;
        while (b <= 10) {
            if (b % 2 != 0) {
                b++;
                continue;
            }
            System.out.println("Inside the loop, the value of 'b' is: " + b);
            b++;
        }
        System.out.println("The loop condition has been met and we are now outside of the loop...");

    }
}
