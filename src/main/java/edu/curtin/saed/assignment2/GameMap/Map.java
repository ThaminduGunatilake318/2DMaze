package edu.curtin.saed.assignment2.GameMap;

import java.util.ArrayList;
import java.util.List;

public class Map
{
    private int[] size;
    private int[] start;
    private int[] goal;
    private List<Item> items;
    private List<Obstacle> obstacles;
    private List<String> plugins;
    private List<String> scripts;

    public Map(int[] size, int[] start, int[] goal)
    {
        this.size = size;
        this.start = start;
        this.goal = goal;
        this.items = new ArrayList<>();
        this.obstacles = new ArrayList<>();
        this.plugins = new ArrayList<>();
        this.scripts = new ArrayList<>();
    }

    public int[] getSize() { return size; }
    public int[] getStart() { return start; }
    public int[] getGoal() { return goal; }
    public List<Item> getItems() { return items; }
    public List<Obstacle> getObstacles() { return obstacles; }
    public List<String> getPlugins() { return plugins; }
    public List<String> getScripts() { return scripts; }

    public void addItem(Item item) { items.add(item); }
    public void addObstacle(Obstacle obstacle) { obstacles.add(obstacle); }
    public void addPlugin(String plugin) { plugins.add(plugin); }
    public void addScript(String script) { scripts.add(script); }

    @Override
    public String toString()
    {
        return "Map{" +
                "size=" + size[0] + "x" + size[1] +
                ", start=" + new Position(start[0], start[1]) +
                ", goal=" + new Position(goal[0], goal[1]) +
                ", items=" + items +
                ", obstacles=" + obstacles +
                ", plugins=" + plugins +
                ", scripts=" + scripts +
                '}';
    }
}
