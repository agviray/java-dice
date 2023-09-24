import java.util.Random;

public class JavaDice {
    public static void main(String[] args) {
        Random randomizedNumber = new Random();
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