package ru.netology.dz_16_Java_Collections_Framework;

import java.util.ArrayList;

public class Game {
    protected ArrayList<Player> players = new ArrayList<>();


    public void register(Player player) {      //метод регистрации игрока
        players.add(player);
    }


    public int round(String playerName1, String playerName2) {    //метод соревнования между двумя игроками
        Player player1 = null;
        Player player2 = null;

        for (Player player : players) {

            if (player.getName().equals(playerName1)) {
                player1 = player;
            }
            if (player.getName().equals(playerName2)) {
                player2 = player;
            }
        }

        if (player1 == null) {
            throw new RuntimeException("Player with name: " + playerName1 + "is not registered");   // поиск нелегалов

        }
        if (player2 == null) {
            throw new RuntimeException("Player with name: " + playerName2 + "is not registered");

        }

        if (player1.getStrength() < player2.getStrength()) {          // да начнется битва
            return 2;
        }
        if (player2.getStrength() < player1.getStrength()) {
            return 1;
        }
        return 0;                                                     // ничья
    }
}
