import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GameTest {
    Game game = new Game();

    @BeforeMethod
    public void beforeMethod() {

    }

    @BeforeTest
    public void init() {
        game.startGame("procrastination", "description");
    }

    @Test(priority = 1)
    public void startGame() {
        assertEquals(0, game.getAttempts());
        assertEquals(0, game.getBalance());
    }

    @Test(priority = 2)
    public void attemptsCheck() throws WrongWordLengthException {
        game.openLetter('a');
        assertEquals(1, game.getAttempts());
        game.openLetter('x');
        assertEquals(2, game.getAttempts());
        game.openWord("gamificationaaa");
        assertEquals(4, game.getAttempts());
        game.openWord("procrastination");
        assertEquals(6, game.getAttempts());
    }

    @Test(priority = 3)
    public void balanceCheck() throws WrongWordLengthException {
        game.openLetter('a');
        assertEquals(40, game.getBalance());
        game.openLetter('x');
        assertEquals(35, game.getBalance());
        game.openWord("gamificationaaa");
        assertEquals(85, game.getBalance());
        game.openWord("procrastination");
        assertEquals(60, game.getBalance());
    }
}