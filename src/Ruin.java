import java.util.Scanner;

public class Ruin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your starting amount?");
        int startAmount = scanner.nextInt();
        System.out.println("What is your win probability?");
        double winChance = scanner.nextDouble();
        System.out.println("What is your win limit?");
        int winLimit = scanner.nextInt();
        int gameCount = 0;
        System.out.println("How many simulations?");
        
        
        for(int simulations = scanner.nextInt(); simulations > 0; simulations--) {
        while (startAmount <= winLimit && startAmount >= 0) {
            if (Math.random() < winChance) {
                startAmount = startAmount + 1;
                if (startAmount == winLimit) {
                    System.out.println("Cash out. It's a successful day!");
                }
            } else {
                startAmount = startAmount - 1;
                if (startAmount == 0) {
                    System.out.println("You have been ruined. Leave now.");
                }
            }
            gameCount++;
        }
        }
        System.out.println("You have played " + gameCount + " games");
    }

}
