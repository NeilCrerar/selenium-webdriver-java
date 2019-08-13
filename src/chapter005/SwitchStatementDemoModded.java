/* Udemy: Selenium Webdriver with Java: XXXXX
Modified version fo the 'switch' conditional statement demo from the tutorial. In this version the separate cases for
each month have been merged together to reduce duplication across the different months.
IDE gives option to swap from 'switch' to 'branch' but not sure what that does at this point.
 */

package chapter005;
public class SwitchStatementDemoModded {

    public static void main(String[] args) {
        /* Note that we create a variable that takes the returned value from the method created to calculate the
         number of days and supply the parameters to be used as part of the method call
         */
        int numDays = numOfDays(2014, 7);
        System.out.println("Number of days in year and month are: " + numDays);
    }

    static int numOfDays(int year, int month) {
        int numDays = 0;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 2:
                // Use a conditional if statement to adjust for leap years (supplied from course)
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            default:
                System.out.println("Invalid Month");
                break;
        }
        return numDays;
    }

}
