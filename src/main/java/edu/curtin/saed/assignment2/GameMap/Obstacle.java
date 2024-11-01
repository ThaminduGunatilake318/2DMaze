package edu.curtin.saed.assignment2.GameMap;

import java.util.List;

public class Obstacle
{
    private List<Position> positions;
    private List<String> requirements;

    public Obstacle(List<Position> positions, List<String> requirements)
    {
        this.positions = positions;
        this.requirements = requirements;
    }

    public List<Position> getPositions() { return positions; }
    public List<String> getRequirements() { return requirements; }

    @Override
    public String toString() {
        return "Obstacle{positions=" + positions + ", requirements=" + requirements + "}";
    }
}
