/* Udemy: Selenium Webdriver with Java: Conditional Statements and Loops
Demonstrates the use of a basic 'if' conditional statement using example previously seen in 'chapter004 -
UnderstandingReturnType'
 */

package chapter005;
public class ConditionalStatement {

    public static void main(String[] args) {

        int score = 81;
        char grade;

        /* Start of conditional statement - here we are using a series of 'if statements to see if the value supplied
        as the 'score' matches the range for an associated 'grade'.  With this type of condition, once it evaluates as
        'true' then the code executed the specified code for that condition and exits onto the next code block
        */
        if (score >= 90 && score < 100) {
            grade = 'A';  // note the single quote - will not work if use double-quotes as this denotes a string instead
        } else if (score >=80 && score < 90) {
            grade = 'B';
        } else if (score >=65 && score < 90) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Score is: " + score);
        System.out.println("Grade is: " + grade);
    }

}