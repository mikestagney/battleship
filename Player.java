package battleship;

import java.util.ArrayList;
import java.util.List;

enum Fleet {
    AIRCRAFT_CARRIER("Aircraft Carrier", 5),
    BATTLESHIP("Battleship", 4),
    SUBMARINE("Submarine", 3),
    CRUISER("Cruiser", 3),
    DESTROYER("Destroyer", 2);

    String name;
    int length;

    Fleet(String name, int length) {
        this.name = name;
        this.length = length;

    }
}
public class Player {

    public Gameboard gameBoard;
    public List<Battleships> ships;
    String name = "Player ";

    Player(int num) {
        this.gameBoard = new Gameboard();
        this.name += num;
        this.ships = new ArrayList<>();
        for (Fleet craft : Fleet.values()) {
            Battleships tempShip = new Battleships(craft.name, craft.length);
            ships.add(tempShip);
        }
    }

    boolean allShipsSunk() {
        boolean allSunk = true;
        for (Battleships ship : this.ships) {
            if (!ship.isShipSunk()) {
                allSunk = false;
            }
        }
        return allSunk;
    }
}
