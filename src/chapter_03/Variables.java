package chapter_03;

public class Variables {
    public static void main(String[] args) {
        /* TYPE: byte
           MIN: -128
           MAX: 127
           DEFAULT: 0
         */
        byte myByteVariable = 23;
        System.out.println("Byte variable: " + myByteVariable);

        /* TYPE: short
           MIN: -32,768
           MAX: 32,767
           DEFAULT: 0
         */
        short myShortVariable = 1234;
        System.out.println("Short variable: " + myShortVariable);

        /* TYPE: int
           MIN: -2,147,483,648
           MAX: 2,147,483,647
           DEFAULT: 0
         */
        int myIntVariable = 543677;
        System.out.println("Int variable: " + myIntVariable);

        /* TYPE: long
           MIN: -9,223.372.036.854.775.808
           MAX: 9,223,372,036,854,775,807
           DEFAULT: 0
         */
        long myLongVariable = 132231050566456L;
        System.out.println("Long variable: " + myLongVariable);

        /* TYPE: float
           MIN: 3.4e−038
           MAX: 3.4e+038
           DEFAULT: 0.0
         */
        float myFloatVariable = 23.6f;
        System.out.println("Float variable: " + myFloatVariable);

        /* TYPE: double
           MIN: 1.7e−308
           MAX: 1.7e+308
           DEFAULT: 0.0
         */
        double myDoubleVariable = 12.56;
        System.out.println("Double variable: " + myDoubleVariable);

        /* TYPE: boolean
           MIN: true
           MAX: false
           DEFAULT: false
         */
        boolean myBooleanVariable = false;
        System.out.println("Boolean variable: " + myBooleanVariable);

        /* TYPE: char
           MIN:0
           MAX: 127
           DEFAULT: <null/0>
         */
        char myCharVariable1 = 'a';
        System.out.println("Char variable: " + myCharVariable1);
        char myCharVariable2 = '&';
        System.out.println("Char variable: " + myCharVariable2);
        char myCharVariable3 = 254;
        System.out.println("Char variable: " + myCharVariable3);

    }
}
