import java.util.Random;

public class JavaDice {
    public static void main(String[] args) {
        // *** About the Random class (part of Java util package) ***
        // - Java's Random class generates a pseudorandom number.

        // - Use new instance of Random class to generate a pseudorandom number.
        Random randomizedNumber = new Random();

        // *** About Random's .nextInt(int n) method ***
        // - Random.nextInt(int n) will get a random number between a range of 0 and the int n number that we specify.
        // - Note that the int n argument passed into nextInt(int n) is exclusive. This means that it will be
        //   excluded from the range of numbers. In other words, if we specify nextInt(10), the randomized number
        //   will result in being any number between 0 and 9--obviously not including 10.
        // - Therefore, if we wanted a random number between 0 and 10, we would have to write something
        //   like nextInt(10) + 1.

        // - Get one of 6 integers using Random.nextInt(int n) method.
        // - Random class's nextInt(int n) method is used to get a random number between a range of 0(inclusive)
        //   and the argument int n(exclusive), that we specify.
        int x = randomizedNumber.nextInt(6) + 1;
        if (x < 1) {
            System.out.println("***********************************");
            System.out.println("Invalid roll. Please roll again. =)");
            System.out.println("***********************************");
        }

        System.out.println("***********************************");
        System.out.println("You rolled a: " + x);
        System.out.println("***********************************");
    }
}