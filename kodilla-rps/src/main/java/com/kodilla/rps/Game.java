package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game{
    private String nameUser;
    private int roundCount;
    private int computerPoint;
    private int userPoint;

    public Game() {
        System.out.println("<<< CREATE GAME >>>");
    }

    public void printInfo(){
        System.out.println("\nUser manual :)");
        System.out.println("Press \"1\" to play \"rock\"");
        System.out.println("Press \"2\" to play \"paper\"");
        System.out.println("Press \"3\" to play \"scissors\"");
        System.out.println("Press \"x\" to end the game");
        System.out.println("Press \"n\" to start a new game");
    }

    public void initGame(){
        this.computerPoint = 0;
        this.userPoint = 0;
        System.out.println("<<< ROCK ... PAPER ... SCISSORS >>>\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.nameUser = scanner.nextLine();
        boolean error;
        do {
            System.out.print("Enter the number of game rounds: ");
            try {
                error = false;
                this.roundCount = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                error = true;
            }
        } while (this.roundCount < 1 || this.roundCount > 12 || error);
    }

    public char playGame(){
        System.out.println("\nWELL!!! Let's get to the game!!!\n");
        int i = 1;
        char choiceUser, choiceComputer;
        do {
            try {
                for(int k = 3; k >= 0; k--){
                    System.out.print(k + " ");
                    if (k > 0)
                        for(int j = 0; j < 3; j++){
                            Thread.sleep(250);
                            System.out.print(". ");
                        }
                    Thread.sleep(250);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("\n\n<<< Round " + i + " >>>");
            choiceUser = this.userMpve();
            choiceComputer = this.computerMove();
            System.out.println(choiceUser + " - " + choiceComputer);
            if (choiceUser == 'n' || choiceUser == 'x')
                return choiceUser;
            else if (choiceUser == '1' && choiceComputer == '2'){
                System.out.println("You:\trock\t\tComputer:\tpaper" );
                System.out.println("<<< YOU LOST ROUND " + i + " >>>" );
                computerPoint++;
            }
            else if (choiceUser == '1' && choiceComputer == '3'){
                System.out.println("You:\trock\t\tComputer:\tscissors" );
                System.out.println("<<< YOU WIN ROUND " + i + " >>>" );
                userPoint++;
            }
            else if (choiceUser == '2' && choiceComputer == '1'){
                System.out.println("You:\tpaper\t\tComputer:\trock" );
                System.out.println("<<< YOU WIN ROUND " + i + " >>>" );
                userPoint++;
            }
            else if (choiceUser == '2' && choiceComputer == '3'){
                System.out.println("You:\tpaper\t\tComputer:\tscissors");
                System.out.println("<<< YOU LOST ROUND " + i + " >>>" );
                computerPoint++;
            }
            else if (choiceUser == '3' && choiceComputer == '1'){
                System.out.println("You:\tscissors\t\tComputer:\trock");
                System.out.println("<<< YOU LOST ROUND " + i + " >>>" );
                computerPoint++;
            }
            else if (choiceUser == '3' && choiceComputer == '2'){
                System.out.println("You:\tscissors\t\tComputer:\tpaper");
                System.out.println("<<< YOU WIN ROUND " + i + " >>>" );
                userPoint++;
            }
            else
            {
                System.out.println("<<< NO WINNER IN ROUND " + i + " >>>" );
            }
            i++;
        } while (i <= roundCount);
        System.out.println(this.userMpve());
        return '0';
    }

    public void printResult(){
        if (userPoint > computerPoint){
            System.out.println("<<< YOU WIN GAME !!! >>>");
            System.out.println("<<< " + userPoint + " - " + computerPoint + " >>>");
        }
        if (userPoint < computerPoint){
            System.out.println("<<< TOU LOST GAME !!! >>>");
            System.out.println("<<< " + userPoint + " - " + computerPoint + " >>>");
        }
        if (userPoint == computerPoint) {
            System.out.println("<<< NO WINNER !!! >>>");
            System.out.println("<<< " + userPoint + " - " + computerPoint + " >>>");
        }
    }

    public boolean confirmation(){
        System.out.println("Are you sure? ('y'es or 'n'o): ");
        Scanner scanner = new Scanner(System.in);
        char yourChoice;
        do {
            yourChoice = scanner.next().charAt(0);
            if (yourChoice == 'y'){
                return true;
            }
            else if (yourChoice == 'n'){
                return false;
            }
        } while(true);
    }

    public char printMenu(){
        System.out.println("\n\n<<< MENU >>>");
        System.out.println("Press \"x\" to end the game");
        System.out.println("Press \"n\" to start a new game");
        Scanner scanner = new Scanner(System.in);
        char yourChoice;
        do {
            yourChoice = scanner.next().charAt(0);
        } while(!((yourChoice == 'x') || (yourChoice == 'n')));
        return yourChoice;
    }

    private char userMpve(){
        System.out.print("\nYour playing: ");
        Scanner scanner = new Scanner(System.in);
        char c;
        do {
            c = scanner.next().charAt(0);
        } while(!((c == '1') || (c == '2') || (c == '3') || (c == 'n') || (c == 'x')));
        return c;
    }

    private char computerMove(){
        Random r = new Random();
        String result = (r.nextInt(3)+1) + "";
        return result.charAt(0);
    }
}
