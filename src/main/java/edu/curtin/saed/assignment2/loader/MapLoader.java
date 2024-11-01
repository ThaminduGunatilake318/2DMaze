package edu.curtin.saed.assignment2.loader;

import edu.curtin.saed.assignment2.GameMap.*;
import edu.curtin.saed.assignment2.Parser.GameData;
import edu.curtin.saed.assignment2.Parser.GameParser;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MapLoader
{
    public Map loadMap(String filePath) throws Exception
    {
        try (InputStream inputStream = new FileInputStream(filePath))
        {
            GameParser parser = new GameParser(inputStream);
            GameParser.parse();

            // Initialize the map with size, start, and goal positions
            Map map = new Map(GameData.size, GameData.start, GameData.goal);

            // Add parsed items and obstacles to the map
            for (GameData.Item item : GameData.items)
            {
                List<Position> positions = new ArrayList<>();
                for (int[] pos : item.positions)
                {
                    positions.add(new Position(pos[0], pos[1]));
                }
                map.addItem(new Item(item.name, positions, item.message));
            }

            for (GameData.Obstacle obstacle : GameData.obstacles)
            {
                List<Position> positions = new ArrayList<>();
                for (int[] pos : obstacle.positions)
                {
                    positions.add(new Position(pos[0], pos[1]));
                }
                map.addObstacle(new Obstacle(positions, obstacle.requirements));
            }

            // Add plugins and scripts
            //map.getPlugins().addAll(GameParser.plugins);
            //map.getScripts().addAll(GameParser.scripts);

            return map;
        }
        catch (Exception e)
        {
            throw new Exception("Error loading map: " + e.getMessage(), e);
        }
    }
}
