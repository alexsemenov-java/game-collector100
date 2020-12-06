import java.util.Scanner;

public class DevGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command;

        do {

            System.out.println("Welcome to JavaGame #Collector100. Please make your choice and press Enter:  ");
            System.out.println("1. Start new game ");
            System.out.println("2. Options ");
            System.out.println("3. Exit ");

            command = scanner.nextLine();

            switch (command){
                case "1":
                    startNewGame();
                    break;

                case "2":
                    openOptionsMenu();
                    break;

                case "3":
                    break;

                default:
                    System.out.println("Command not recognized. Please try again!");
            }


        }
        while (!command.equals("3"));


    }
}
