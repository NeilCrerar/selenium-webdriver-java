package chapter005;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("This is an example of a do-while loop, where the condition is performed at the end of the " +
                "loop meaning that the loop is always executed at least once.");
        System.out.println("In this example the loops should only execute if the value of 'i' is an even number.");
                System.out.println("But because we have initialised i=1 we will see this first value printed.\n");
        do {
            System.out.println("Inside the loop, the value of 'b' is: " + i);
            i++;
        } while (i % 2 != 0&& i < 10);
    }
}
