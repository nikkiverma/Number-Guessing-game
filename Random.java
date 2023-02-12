import java.util.Scanner;

public class Random {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\tWelcome To Number Gusseing Game");
        System.out.println("\n\n You have 10 attempts.....\n And you loose 10 points from 100 after every attempt");

        int number, score, attempt;
        boolean again = true;
        boolean won = false;

        do {
            int actualNumber = (int) (Math.random() * 100);
            score = 100;
            attempt = 0;
            System.out.println("Enter a number upto 100:");
            for (int i = 0; i < 10; i++) {

                number = sc.nextInt();
                attempt++;
                if (number == actualNumber) {
                    System.out.println("congratulation! You Guess it right in " + attempt + "\n Score " + score);
                    won = true;
                    break;
                } else if (number > actualNumber) {
                    System.out.println("Enter Lesser Number:");
                    score = score - 10;
                } else if (number < actualNumber) {
                    System.out.println("Enter Greater Number:");
                    score = score - 10;

                } else {
                    System.out.println("Enter Number upto 100:");

                }

            }
            if (!won) {
                System.out.println("You loose!!!!!");
            }
            System.out.println("Do you want to play again..if yes print 1 if no print 0");
            int choise = sc.nextInt();
            if (choise == 0) {
                break;
            }

        } while (again);
        sc.close();

    }
}
