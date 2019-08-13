/* Udemy: Selenium Webdriver with Java: Classes and Methods - Object Orientated Concepts
Extends previous tutorial for 'AddingMethods' to introduce the concept of return types to be able to pass data back
from a method to whatever had originally called it (e.g. returning the result of a calculation).
 */

package chapter_04;
public class UnderstandingReturnType {
    public static void main(String[] args) {
        // create a variable to hold the grade calculated for a student - note changed this from string in previous
        // example to a char here as an experiment
        char grade;
        // create a variable that holds the name of the student that the grade applies to
        String studentName = "John";
        // use the grade variable to hold the output from the findGrades method, to which we're passing the value 90.
        grade = findGrades(90);
        // Call the display method passing the studentName defined above and the returned value held by the grade
        // variable
        displayGrades(studentName, grade);

        // do second set of values for a second student to demonstrate the method  being called multiple times
        studentName = "Tom";  // note don't needs to specify variable type here as already done that above
        grade = findGrades(57);
        displayGrades(studentName, grade);
    }

    // create method that takes in a score and returns a grade base on that score
    public static char findGrades(int score){
        char grade;
        if (score >= 90 && score < 100) {
            grade = 'A';  // note the single quote - will not work if use double-quotes as this denotes a string instead
        } else if (score >=80 && score < 90) {
            grade = 'B';
        } else if (score >=65 && score <90) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }

    public static void displayGrades(String studentName, char grade) {
        System.out.println("***************************************");
        System.out.println("Student " + studentName + " received a grade of: " + grade);
    }



}
