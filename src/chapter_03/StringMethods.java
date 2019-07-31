/*
Udemy: Selenium Webdriver with Java: Java Concepts - Data Types
Demonstrates a set of different methods that can be used to manipulate and update string variables.
*/
package chapter_03;

public class StringMethods {
    public static void main(String[] args) {

        System.out.println("This is a demonstration of different ways to manipulate a string variable");
        System.out.println("--------------------------------------------------------------------------\n");

        String myStringLength = "This is a test string";
        System.out.println("The \"String length()\" method returns the number of characters in the string");
        System.out.println("If the string variable contains: " + myStringLength);
        System.out.println("The length of the string is...");
        System.out.println(".. " + myStringLength.length() + " characters");

        System.out.println("\n--------------------------------------------------------------------------");
        String myStringCharAt = "A string with $ in the middle";
        System.out.println("The \"String charAt()\" method returns a char value at the given index number");
        System.out.println("if the string variable contains: " + myStringCharAt);
        System.out.println("The character at position 14 is...");
        System.out.println(".. " + myStringCharAt.charAt(14));

        System.out.println("\n--------------------------------------------------------------------------");
        String myStringConcat = " and Fred doesn't like it.";
        System.out.println("The \"String concat()\" method combines specified string at the end of this string");
        System.out.println("If the string variable contains: " + myStringLength);
        System.out.println("We can add more text to it using the \"concat\" method to add specific new text...");
        System.out.println(".. " + myStringLength.concat(" with some new text added"));
        System.out.println("We can also join two string variables together so that the original string and a " +
                "second string variable of \"" + myStringConcat + "\" becomes....");
        System.out.println(".. " + myStringLength.concat(myStringConcat));

        System.out.println("\n--------------------------------------------------------------------------");
        String myStringContains = "Hey nonny noo nonny nay";
        System.out.println("The \"String contains()\" method returns true if chars are found in the string");
        System.out.println("If the string variable contains: " + myStringContains);
        System.out.println("If we look for the text \"nonny\", then expect a true response...");
        System.out.println(".. " + myStringContains.contains("nonny"));
        System.out.println("If we look for the text \"Friday\", then expect a false response...");
        System.out.println(".. " + myStringContains.contains("Friday"));

        System.out.println("\n--------------------------------------------------------------------------");
        String myStringStartsWith = "XX435-DBOTL";
        System.out.println("The \"String startsWith()\" method checks if this string starts with given prefix");
        System.out.println("If the string variable contains: " + myStringStartsWith);
        System.out.println("A check that it begins with \"EE\" should return true...");
        System.out.println(".. " + myStringStartsWith.startsWith("EE"));
        System.out.println("A check that it begins with \"Z\" should return false...");
        System.out.println(".. " + myStringStartsWith.startsWith("Z"));

        System.out.println("\n--------------------------------------------------------------------------");
        System.out.println("The \"String endsWith()\" method checks if this string ends with given suffix");
        System.out.println("If the string variable contains: " + myStringStartsWith);
        System.out.println("A check that it ends with \"L\" should return true...");
        System.out.println(".. " + myStringStartsWith.endsWith("L"));
        System.out.println("A check that it begins with \"Z\" should return false...");
        System.out.println(".. " + myStringStartsWith.endsWith("Z"));

        System.out.println("\n--------------------------------------------------------------------------");
        String myStringEquals = "A string with $ in the middle";
        System.out.println("The \" String'equals()\" method compares the contents of two given strings");
        System.out.println("If the first string variable contains: " + myStringEquals);
        System.out.println("If the second string variable contains: " + myStringCharAt);
        System.out.println("If the third string variable contains: " + myStringContains);
        System.out.println("A check that the first and second strings are the same should return true...");
        System.out.println(".. " + myStringEquals.equals(myStringCharAt));
        System.out.println("A check that the first and third strings are the same should return false...");
        System.out.println(".. " + myStringEquals.equals(myStringContains));

        // use myStringEquals as the $ position should match the earlier index number
        System.out.println("\n--------------------------------------------------------------------------");
        System.out.println("The \" String indexOf()\" method returns index of given character value or substring");
        System.out.println("If the string variable contains: " + myStringEquals);
        System.out.println("The index position of the $ character is...");
        System.out.println(".. " + myStringEquals.indexOf("$"));
        System.out.println(".. remember that the index starts from 0.........");

        System.out.println("\n--------------------------------------------------------------------------");
        String myStringIsEmpty = "";
        System.out.println("The \"String isEmpty()\" method checks if this string is empty");
        System.out.println("If the string variable contains: " + myStringIsEmpty);
        System.out.println("A check that the string is empty should return true..");
        System.out.println(".. " + myStringIsEmpty.isEmpty());

        System.out.println("\n--------------------------------------------------------------------------");
        System.out.println("The \"String replace()\" method returns a string replacing all the old char to new char");
        System.out.println("If the string variable contains: " + myStringContains);
        System.out.println("If we replace all instances of the char \"n\" with the char \"z\" we get...");
        System.out.println(".. " + myStringContains.replace("n", "z"));

        System.out.println("\n--------------------------------------------------------------------------");
        String myStringSubstring = "The quick brown fox jumps over the lazy dog";
        System.out.println("The \"String'substring()\" method returns a part of the string");
        System.out.println("If the string variable contains: " + myStringSubstring);
        System.out.println("We can extract part of that variable as a substring; such as....");
        System.out.println(".. " + myStringSubstring.substring(10,19));

        System.out.println("\n--------------------------------------------------------------------------");
        String myStringToCharArray = "char array";
        System.out.println("The \"String toCharArray()\" method converts this string into character array");
        System.out.println("If the string variable contains: " + myStringToCharArray);
        System.out.println("Converting this to a character array would produce...");
        char myCharArray[] = myStringToCharArray.toCharArray();
        for (int i = 0; i < myCharArray.length; i++) {
            System.out.println(".. " + myCharArray[i]);
        }

        System.out.println("\n--------------------------------------------------------------------------");
        String myStringToLowercase = "This Is An Example Of Camel Case";
        System.out.println("The \"String toLowerCase()\" method returns!the!string!in!lowercase letter");
        System.out.println("If the string variable contains: " + myStringToLowercase);
        System.out.println("Converting this to all lowercase characters would produce...");
        System.out.println(".. " + myStringToLowercase.toLowerCase());

        // use same variable as above
        System.out.println("\n--------------------------------------------------------------------------");
        System.out.println("The \"String toUpperCase()\" method returns the string in uppercase letter");
        System.out.println("If the string variable contains: " + myStringToLowercase);
        System.out.println("Converting this to all uppercase characters would produce...");
        System.out.println(".. " + myStringToLowercase.toUpperCase());

        System.out.println("\n--------------------------------------------------------------------------");
        String myStringTrim = "  lots    of   whitespace  !   ";
        System.out.println("The \"String trim()\" method eliminates leading and trailing spaces");
        System.out.println("If the string variable contains: " + myStringTrim);
        System.out.println("Trimming the start and end spaces would produce...");
        System.out.println(".. " + myStringTrim.trim());
        System.out.println("--------------------------------------------------------------------------");

    }
}
