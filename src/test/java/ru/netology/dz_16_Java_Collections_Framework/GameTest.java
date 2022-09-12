package ru.netology.dz_16_Java_Collections_Framework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    public void shouldNotRegisteredPlayers1() {
        Player player1 = new Player(110, "Sub-Zero", 500);
        Player player2 = new Player(220, "Scorpion", 600);
        Player player3 = new Player(330, "Smoke", 700);
        Player player4 = new Player(440, "Kitana", 800);
        Player player5 = new Player(550, "Liu Kang", 1700);

        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        Assertions.assertThrows(RuntimeException.class, () -> {
            game.round("Not Registered", player1.getName());
        });

    }

    @Test
    public void shouldNotRegisteredPlayers2() {
        Player player1 = new Player(110, "Sub-Zero", 500);
        Player player2 = new Player(220, "Scorpion", 600);
        Player player3 = new Player(330, "Smoke", 700);
        Player player4 = new Player(440, "Kitana", 800);
        Player player5 = new Player(550, "Liu Kang", 1700);

        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        Assertions.assertThrows(RuntimeException.class, () -> {
            game.round(player1.getName(), "Not Registered");
        });

    }

    @Test
    public void shouldRunPlayer1() {
        Player player1 = new Player(110, "Sub-Zero", 500);
        Player player2 = new Player(220, "Scorpion", 600);
        Player player3 = new Player(330, "Smoke", 700);
        Player player4 = new Player(440, "Kitana", 800);
        Player player5 = new Player(550, "Liu Kang", 1700);

        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        int actual = game.round("Smoke", "Sub-Zero");
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldRunPlayer2() {
        Player player1 = new Player(110, "Sub-Zero", 500);
        Player player2 = new Player(220, "Scorpion", 600);
        Player player3 = new Player(330, "Smoke", 700);
        Player player4 = new Player(440, "Kitana", 800);
        Player player5 = new Player(550, "Liu Kang", 1700);

        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        int actual = game.round("Sub-Zero", "Smoke");
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldHowPlayerRunNobody() {
        Player player1 = new Player(110, "Sub-Zero", 500); //500
        Player player2 = new Player(220, "Scorpion", 500); //500
        Player player3 = new Player(330, "Smoke", 700);
        Player player4 = new Player(440, "Kitana", 800);
        Player player5 = new Player(550, "Liu Kang", 1700);

        Game game = new Game();
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        int actual = game.round("Scorpion", "Sub-Zero");
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

}