package edu.curtin.saed.assignment2;

import edu.curtin.saed.assignment2.GameMap.Map;
import edu.curtin.saed.assignment2.loader.MapLoader;

public class Main
{
    public static void main(String[] args)
    {
        MapLoader loader = new MapLoader();
        try
        {
            Map map = loader.loadMap("/Users/thamindugunatilake/Desktop/Curtin/COMP3003/MazeGame/src/main/resources/testinput-1.utf8.map");
            System.out.println("Loaded map:\n" + map);
        }
        catch (Exception e)
        {
            System.err.println("Failed to load map: " + e.getMessage());
        }
    }
}
