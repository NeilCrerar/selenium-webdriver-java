package chapter_04;

public class AddingMethods {

    // here we have a main method that calls out to another method and passing it two bits of data.....
    public static void main(String[] args) {
        findGrades("John",90);
        findGrades("Tom",80);
    }

    // the second method takes two bits of data as input parameters, does some work with it ,and then prints out
    // some info
    public static void findGrades(String studentName, int score){
        String grade;
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >=80 && score < 90) {
            grade = "B";
        } else if (score >=65 && score <80) {
            grade = "C";
        } else grade = "D";
        System.out.println("Grade of " + studentName + " is: " + grade);
    }
}
