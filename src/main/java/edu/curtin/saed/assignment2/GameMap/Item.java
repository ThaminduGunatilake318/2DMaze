package edu.curtin.saed.assignment2.GameMap;

import java.util.List;

public class Item
{
    private String name;
    private List<Position> positions;
    private String message;

    public Item(String name, List<Position> positions, String message)
    {
        this.name = name;
        this.positions = positions;
        this.message = message;
    }

    public String getName() { return name; }
    public List<Position> getPositions() { return positions; }
    public String getMessage() { return message; }

    @Override
    public String toString() {
        return "Item{name='" + name + "', positions=" + positions + ", message='" + message + "'}";
    }
}
