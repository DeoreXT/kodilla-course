package com.kodilla.rps;

import java.util.Scanner;

public class Game{
    private String nameUser;
    private int roundCount;

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
        System.out.println("\nWELL!!! Let's get to the game!!!");
    }

    public void initGame(){
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

    public void playGame(){

    }

    public void printResult(){

    }

    public boolean confirmation(){
        System.out.println("Are you sure? ('y'es or 'n'o): ");
        Scanner scanner = new Scanner(System.in);
        char yourChoice;
        do {
            yourChoice = scanner.next().charAt(0);
        } while(!((yourChoice == 'y') || (yourChoice == 'n')));
        return (yourChoice == 'y') ? true : false;
    }

    public char printMenu(){
        System.out.println("<<< MENU >>>");
        System.out.println("Press \"x\" to end the game");
        System.out.println("Press \"n\" to start a new game");
        Scanner scanner = new Scanner(System.in);
        char yourChoice;
        do {
            yourChoice = scanner.next().charAt(0);
        } while(!((yourChoice == 'x') || (yourChoice == 'n')));
        return yourChoice;
    }
}
