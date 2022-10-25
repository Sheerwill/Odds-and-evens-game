import java.util.*;
public class OddsAndEvens {
    public static void main(String[] args){
        System.out.println("Let’s play a game called Odds and Evens");
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
        String userChoice = input.nextLine();
        String computerChoice;

        if (userChoice.equals("O")){
            computerChoice = "E";
            System.out.println(name + " has picked Odds! The computer will be Evens.");
        }else if (userChoice.equals("E")){
            computerChoice = "O";
            System.out.println(name + " has picked Evens! The computer will be Odds.");
        }
        for (int i = 0; i <= 20; i++ ){
            System.out.print("-");
        }System.out.println();

        System.out.println("How many fingers do you put out?");
        int fingers = input.nextInt();

        Random rand = new Random();
        int computer = rand.nextInt(6);

        System.out.println("The computer plays " + computer + " fingers");

        for (int i = 0; i <= 20; i++ ){
            System.out.print("-");
        }System.out.println();

        int sum = fingers + computer;
        System.out.println("fingers + computer = " + sum);

        boolean oddOrEven = sum % 2 == 0;
        if (oddOrEven){
            System.out.println(sum + " is ...Even.");
            if (fingers % 2 == 0){
                System.out.println("The user wins.");
            }else{
                System.out.println("The computer wins.");
            }
        }else {
            System.out.println(sum + " is ...Odd.");
            if (fingers % 2 == 1){
                System.out.println("The user wins.");
            }else{
                System.out.println("The computer wins.");
            }
        }
        for (int i = 0; i <= 20; i++ ){
            System.out.print("-");
        }System.out.println();

    }

}
