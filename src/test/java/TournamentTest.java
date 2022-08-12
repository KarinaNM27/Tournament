
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TournamentTest {

    private Game game = new Game();

    Player player1 = new Player(1, "Andrey", 100);
    Player player2 = new Player(2, "Petya", 120);
    Player player3 = new Player(3, "Ilya", 100);
    Player player4 = new Player(4, "Vladimir", 60);


//    @Test
//
//    public void findByName1() {
//
//        game.register(player1);
//        game.register(player2);
//        game.register(player3);
//        game.register(player4);
//
//
//        Player actual = game.findByName("Andrey");
//        Player expected = player1;
//
//        assertEquals(expected, actual);
//    }
//
//
//    @Test
//
//    public void findByName2() {
//
//        game.register(player1);
//        game.register(player2);
//        game.register(player3);
//        game.register(player4);
//
//
//        Player actual1 = game.findByName("Roma");
//        Player expected1 = null;
//
//        assertEquals(null, actual1);
//    }

    @Test

    public void round1() {

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);


        int actual2 = game.round("Andrey", "Ilya");
        int expected2 = 0;

        assertEquals(expected2, actual2);
    }

    @Test

    public void round2() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);


        assertThrows(NotRegisteredException.class, () -> {
            game.round("Sasha", "Ilya");

        });
    }

    @Test

    public void round3() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);


        assertThrows(NotRegisteredException.class, () -> {
            game.round("Vladimir", "Ben");

        });
    }

    @Test

    public void round4() {

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);


        int actual3 = game.round("Petya", "Vladimir");
        int expected3 = 1;

        assertEquals(expected3, actual3);
    }

    @Test

    public void round5() {

        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);


        int actual4 = game.round("Vladimir", "Andrey");
        int expected4 = 2;

        assertEquals(expected4, actual4);
    }


}
