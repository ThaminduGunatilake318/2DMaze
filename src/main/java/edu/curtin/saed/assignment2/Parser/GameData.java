package edu.curtin.saed.assignment2.Parser;

import java.util.ArrayList;
import java.util.List;

public class GameData {
    public static int[] size;
    public static int[] start;
    public static int[] goal;
    public static List<Item> items = new ArrayList<>();
    public static List<Obstacle> obstacles = new ArrayList<>();
    public static List<String> plugins = new ArrayList<>();
    public static List<String> scripts = new ArrayList<>();

    public static class Item {
        public String name;
        public List<int[]> positions;
        public String message;

        public Item(String name, List<int[]> positions, String message) {
            this.name = name;
            this.positions = positions;
            this.message = message;
        }
    }

    public static class Obstacle {
        public List<int[]> positions;
        public List<String> requirements;

        public Obstacle(List<int[]> positions, List<String> requirements) {
            this.positions = positions;
            this.requirements = requirements;
        }
    }
}
