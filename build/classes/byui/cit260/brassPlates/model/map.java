
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.Scene;


public class map {
    private final Map<Integer, Map<Integer, Scene>> 
            map = new HashMap<>();
    private Scene currentRoom;
    private int currentX = 0;
    private int currentY = 0;

    private map() {
    }
    private static class rowcount {

        public rowcount() {
        }
    }

    private static class countColumn {

        public countColumn() {
        }
    }
    private static class Player {

        public Player() {
        }
    }
    
    private void putScene(int x, int y, Scene room) {
        if (!map.containsKey(x)) {
            map.put(x, new HashMap<>());
        }
        map.get(x).put(y, room);
    }

    private Scene getScene(int x, int y) {
        return map.get(x).get(y);
    }

    private boolean sceneExists(int x, int y) {
        if (!map.containsKey(x)) {
            return false;
        }
        return map.get(x).containsKey(y);
    }

    public void movePlayer(Player player) throws IOException {
        boolean northPossible = sceneExists(currentX, currentY + 1);
        boolean southPossible = sceneExists(currentX, currentY - 1);
        boolean eastPossible = sceneExists(currentX + 1, currentY);
        boolean westPossible = sceneExists(currentX - 1, currentY);
        System.out.print("Which direction would you like to select: ");
        if (northPossible) {
            System.out.print(" North (n)");
        }
        if (eastPossible) {
            System.out.print(" East (e)");
        }
        if (southPossible) {
            System.out.print(" South (s)");
        }
        if (westPossible) {
            System.out.print(" West (w)");
        }
        System.out.print(" ? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String direction = in.readLine();
        if (direction.equals("n") && northPossible) {
            currentY++;
        } else if (direction.equals("s") && southPossible) {
            currentY--;
        } else if (direction.equals("e") && eastPossible) {
            currentX++;
        } else if (direction.equals("w") && westPossible) {
            currentX--;
        }
        currentRoom = getScene(currentX, currentY);
    }
    
}
