

import java.util.ArrayList;
import java.util.List;


public class Game {
    protected List<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);
    }


    public Player findByName(String name) {
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    public int round(String playerName1, String playerName2) {
        Player player1 = findByName(playerName1);
        Player player2 = findByName(playerName2);
        if (player1 == null) {
            throw new NotRegisteredException("Player with name: " + playerName1 + " not registered");
        }

        if (player2 == null) {
            throw new NotRegisteredException("Player with name: " + playerName2 + " not registered");
        }

        int strength1 = player1.strength;
        int strength2 = player2.strength;

        if (strength1 == strength2) {
            return 0;
        }

        if (strength1 > strength2) {
            return 1;
        }


        return 2;
    }


}



