package teach03;

import com.google.gson.Gson;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Game {
    Player p;

    public Game(Player p) {
        setP(p);
    }

    public Player getP() {
        return p;
    }

    public void setP(Player p) {
        this.p = p;
    }

    public void saveGame() throws IOException {
        Gson gson = new Gson();
        String json = gson.toJson(p);
        FileOutputStream f = new FileOutputStream("SavedGame.txt");
        byte[] array = json.getBytes();
        f.write(array);
        f.close();
    }

    public static Game loadGame(String fileName) {
        Gson gson = new Gson();
        String s = null;
        try{
            byte[] encoded = Files.readAllBytes(Paths.get(fileName));
            s = new String(encoded, "UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        FileReader file = new FileReader(fileName);
//        for (int i; -1 != (i=file.read());)
//        {
//            s += ((char) i);
//        }
        Player player = gson.fromJson(s, Player.class);
        return new Game(player);
    }
}
