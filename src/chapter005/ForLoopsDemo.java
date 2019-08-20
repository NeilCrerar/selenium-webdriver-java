package chapter005;

public class ForLoopsDemo {

    public static void main(String[] args) {
        // Here we create a loop based on an initial starting position (i) and condition (i < 10)

        System.out.println("Basic 'for' loop that starts from 0 and increments by 1 on each iteration");
        for (int i = 0; i < 10; i++) {
            System.out.println("The value of i: " + i);
        }

        System.out.println("\nA 'for' loop that iterates over an array printing out the content of each index");
        int[] numbers = {10, 15, 20, 25, 30};
        for (int x = 0; x < numbers.length; x++) {
            System.out.println("The value of index " + x + " is: " + numbers[x]);
        }

        // Alternatively, can use a specific syntax that java understands to reference an index position with
        // consideration of the overall array size
        System.out.println("\nA 'for' loop using a different java syntax to iterate over an array (strings this time)");
        String[] cars = {"bmw", "audi", "honda", "ford", "volkswagen"};
        for (String car : cars) {
            System.out.println("The array value is: " + car);
        }
    }
}

