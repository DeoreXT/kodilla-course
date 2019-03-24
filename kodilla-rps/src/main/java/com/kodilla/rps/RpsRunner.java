package com.kodilla.rps;

public class RpsRunner {
    public static void main(String [] args) {
        boolean end = false;
        Game game = new Game();
        game.initGame();
        game.printInfo();

        while(!end) {
            char result = game.playGame();
            if (result == 'x')
                end = game.confirmation();
            else if (result == 'n')
                game.initGame();
            else {
                game.printResult();
                if (game.printMenu() == 'x')
                    end = game.confirmation();
                else {
                    if (game.confirmation())
                        game.initGame();
                }
            }
        }
        System.out.println("\n<<< END GAME >>>");
    }
}