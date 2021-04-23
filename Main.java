package battleship;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Player player1 = new Player(1);
        Player player2 = new Player(2);
        List<Player> gamePlayers = new ArrayList<>();
        gamePlayers.add(player1);
        gamePlayers.add(player2);

        Scanner input = new Scanner(System.in);
        String firstCoordinate;
        String secondCoordinate;
        int startRow = 0;
        int startCol = 0;
        int endRow = 0;
        int endCol = 0;

        for (Player player : gamePlayers) {
            System.out.println(player.name + ", place your ships on the game field");
            System.out.println();
            player.gameBoard.printGameBoard();

            for (Battleships ship : player.ships) {
                System.out.printf("Enter the coordinates of the %s (%d cells):%n", ship.name, ship.length);
                System.out.println();
                boolean inputIsGood = false;

                while (!inputIsGood) {
                    firstCoordinate = input.next().toUpperCase();
                    secondCoordinate = input.next().toUpperCase();

                    startRow = convertRowInput(firstCoordinate);
                    startCol = convertColumnInput(firstCoordinate);

                    endRow = convertRowInput(secondCoordinate);
                    endCol = convertColumnInput(secondCoordinate);

                    int choiceShipLength = Math.abs(startCol - endCol) + Math.abs(startRow - endRow) + 1;
                    if (choiceShipLength != ship.length) {
                        System.out.printf("Error! Wrong length of the %s! Try again:%n", ship.name);
                        continue;
                    }
                    if (player.gameBoard.checkProximity(startRow, startCol, endRow, endCol)) {
                        System.out.println("Error! You placed it too close to another one. Try again:");
                        continue;
                    }

                    inputIsGood = true;
                }

                player.gameBoard.updateBoard(startRow, startCol, endRow, endCol, ship);
                player.gameBoard.printGameBoard();
            }
            clearScreenAfterEnter(input);

        }
        System.out.println("The game starts!");
        System.out.println();

        Player[] playerArr = new Player[2];
        playerArr[0] = player1;
        playerArr[1] = player2;
        int currentPlayer = 0;
        int oppositePlayer = 1;

        boolean winGame = false;
        while(!winGame) {
            for (int i = 0; i < playerArr.length; i++) {
                playerArr[oppositePlayer].gameBoard.printFogOfWarBoard();
                System.out.println("---------------------");
                playerArr[currentPlayer].gameBoard.printGameBoard();
                System.out.println();
                System.out.println(playerArr[currentPlayer].name + ", it's your turn:");

                firstCoordinate = input.next().toUpperCase();
                startRow = convertRowInput(firstCoordinate);
                startCol = convertColumnInput(firstCoordinate);

                if (firstCoordinate.length() > 2 && startCol != 9) {
                    System.out.println("Error! You entered the wrong coordinates! Try again:");
                    continue;
                }
                if (startRow < 0 || startRow > 9 || startCol < 0 || startCol > 9) {
                    System.out.println("Error! You entered the wrong coordinates! Try again:");
                    continue;
                }
                boolean hitOne = (playerArr[oppositePlayer].gameBoard.takeAShot(startRow, startCol));
                playerArr[oppositePlayer].gameBoard.printFogOfWarBoard();

                if (hitOne) {
                    for (Battleships ship : playerArr[oppositePlayer].ships) {
                        if (ship.isShipHit(startRow, startCol)) {
                            ship.removeShipCoordinate(startRow, startCol);
                            if (ship.isShipSunk()) {
                                System.out.printf("You sank a %s! Specify a new target:%n", ship.name);
                            } else {
                                System.out.printf("You hit a %s! Try again:%n", ship.name);
                            }
                        }
                    }
    
                } else {
                    System.out.printf("You missed! Try again!%n");
                }
                if (playerArr[oppositePlayer].allShipsSunk()) {
                    winGame = true;
                    endGame(playerArr[currentPlayer].name);
                }
                clearScreenAfterEnter(input);

                if (currentPlayer == 0) {
                    currentPlayer = 1;
                    oppositePlayer = 0;
                } else {
                    currentPlayer = 0;
                    oppositePlayer = 1;
                }

            }
        }
        System.out.printf("You sank the last ship. You won. Congratulations%n");
    }
    static int convertRowInput(String coordinate) {
        return coordinate.charAt(0) - 65;
    }
    static int convertColumnInput(String coordinate) {
        if (coordinate.length() > 2 && coordinate.startsWith("10", 1)) {
            return  9;
        } else {
            return coordinate.charAt(1) - 49;
        }
    }
    static void clearScreenAfterEnter(Scanner input) {
        System.out.println("Press Enter and pass the move to another player");
        String junk = input.nextLine();
        junk = input.nextLine();
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
    static void endGame(String name) {
        System.out.printf("You sank the last ship. You won. Congratulations %s!%n", name);
        System.exit(0);
    }
}
