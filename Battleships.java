package battleship;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

public class Battleships {

    String name;
    int length;
    Set<Point> shipsCoordinates;

    Battleships(String name, int length) {
        this.name = name;
        this.length = length;
        shipsCoordinates = new HashSet<>();
    }

    public void storeShipCoordinates(int row, int col) {
        shipsCoordinates.add(new Point(row, col));
    }
    public void removeShipCoordinate(int row, int col) {
        shipsCoordinates.remove(new Point(row, col));
    }
    public boolean isShipHit(int row, int col) {
        return shipsCoordinates.contains(new Point(row, col));
    }
    public boolean isShipSunk() {
        return shipsCoordinates.isEmpty();
    }
}


