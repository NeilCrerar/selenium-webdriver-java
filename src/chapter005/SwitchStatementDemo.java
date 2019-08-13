/* Udemy: Selenium Webdriver with Java: XXXXX
Demonstrates the use of a 'switch' conditional statement via an example of returning the number of days in a given
month/year combination
 */

package chapter005;
public class SwitchStatementDemo {

    public static void main(String[] args) {
        /* Note that we create a variable that takes the returned value from the method created to calculate the
         number of days and supply the parameters to be used as part of the method call
         */
        int numDays = numOfDays(2016, 2);
        System.out.println("Number of days in year and month are: " + numDays);
    }

    static int numOfDays(int year, int month) {
        int numDays = 0;

        switch (month) {
            case 1:
                numDays = 31;
                /* Need to have the 'break' statement tell the program to exit once the condition has been met.
                Without it, the program would just continue evaluating the condition until it had gone through every
                entry
                 */
                break;
            case 2:
                // Use a conditional if statement to adjust for leap years (supplied from course)
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            case 3:
                numDays = 31;
                break;
            case 4:
                numDays = 30;
                break;
            case 5:
                numDays = 31;
                break;
            case 6:
                numDays = 30;
                break;
            case 7:
                numDays = 31;
                break;
            case 8:
                numDays = 31;
                break;
            case 9:
                numDays = 30;
                break;
            case 10:
                numDays = 31;
                break;
            case 11:
                numDays = 30;
                break;
            case 12:
                numDays = 31;
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
        /* NOTE: In reality, more likely to have a three checks for months with 30 days, 31 days or Feb rather than
        specifying every month individually
         */

        return numDays;
    }

}
