package chapter_03;
/*
Udemy: Selenium Webdriver with Java: Java Concepts - Data Types
Demonstrates a set of different methods that can be used to manipulate and update string variables.
*/

public class StringMethods {
    public static void main(String[] args) {

        System.out.println("This is a demonstration of different ways to manipulate a string variable");
        System.out.println("--------------------------------------------------------------------------\n");

        String myStringLength = "This is a test string";
        System.out.println("The \"String length()\" method returns the number of characters in the string");
        System.out.println("String variable contains: " + myStringLength);
        System.out.println("The length of the string is...");
        System.out.println(".. " + myStringLength.length() + " characters");
        System.out.println("--------------------------------------------------------------------------");

        String myStringCharAt = "A string with $ in the middle";
        System.out.println("The \"String charAt()\" method returns a char value at the given index number");
        System.out.println("String variable contains: " + myStringCharAt);
        System.out.println("The character at position 14 is...");
        System.out.println(".. " + myStringCharAt.charAt(14));
        System.out.println("--------------------------------------------------------------------------");

        String myStringConcat = " and Fred doesn't like it.";
        System.out.println("The \"String concat()\" method combines specified string at the end of this string");
        System.out.println("String variable contains: " + myStringLength);
        System.out.println("We can add more text to it using the \"concat\" method to add specific new text...");
        System.out.println(".. " + myStringLength.concat(" with some new text added"));
        System.out.println("We can also join two string variables together so that the original string and a " +
                "second string variable of \"" + myStringConcat + "\" becomes....");
        System.out.println(".. " + myStringLength.concat(myStringConcat));
        System.out.println("--------------------------------------------------------------------------");

        String myStringContains = "Hey nonny noo nonny nay";
        System.out.println("The \"String contains()\" method returns true if chars are found in the string");
        System.out.println("String variable contains: " + myStringContains);
        System.out.println("If we look for the text \"nonny\", then expect a true response...");
        System.out.println(".. " + myStringContains.contains("nonny"));
        System.out.println("If we look for the text \"Friday\", then expect a false response...");
        System.out.println(".. " + myStringContains.contains("Friday"));
        System.out.println("--------------------------------------------------------------------------");

        String myStringStartsWith = "XX435-DBOTL";
        System.out.println("The \"String startsWith()\" method checks if this string starts with given prefix");
        System.out.println("String variable contains: " + myStringStartsWith);
        System.out.println("A check that it begins with \"EE\" should return true...");
        System.out.println(".. " + myStringStartsWith.startsWith("EE"));
        System.out.println("A check that it begins with \"Z\" should return false...");
        System.out.println(".. " + myStringStartsWith.startsWith("Z"));
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("The \"String endsWith()\" method checks if this string ends with given suffix");
        System.out.println("--------------------------------------------------------------------------");

        String myStringEquals = "A string with $ in the middle";
        System.out.println("The \" String'equals()\" method compares the contents of two given strings");
        System.out.println("--------------------------------------------------------------------------");

        // use myStringEquals as the $ position should match the earlier index number
        System.out.println("The \" String indexOf()\" method returns index of given character value or substring");
        System.out.println("--------------------------------------------------------------------------");

        String myStringIsEmpty = "";
        System.out.println("The \"String isEmpty()\" method checks if this string is empty");
        System.out.println("--------------------------------------------------------------------------");

        System.out.println("The \"String replace()\" method returns a string replacing all the old char to new! har");
        System.out.println("--------------------------------------------------------------------------");

        String myStringSubstring = "The quick brown fox jumps over the lazy dog";
        System.out.println("The \"String'substring()\" method returns a part of the string");
        System.out.println("--------------------------------------------------------------------------");

        String myStringToCharArray = "char array";
        System.out.println("The \"String toCharArray()\" method converts this string into character array");
        System.out.println("--------------------------------------------------------------------------");

        String myStringToLowercase = "This Is An Example Of Camel Case";
        System.out.println("The \"String toLowerCase()\" method returns!the!string!in!lowercase letter");
        System.out.println("--------------------------------------------------------------------------");

        // use same variable as above
        System.out.println("The \"String toUpperCase()\" method returns the string in uppercase letter");
        System.out.println("--------------------------------------------------------------------------");

        String myStringTrim = "  lots    of   whitespace  !   ";
        System.out.println("The \"String trim()\" method eliminates leading and trailing spaces");
        System.out.println("--------------------------------------------------------------------------");

    }
}
