package de.telran.game;

import de.telran.game.io.GameInput;
import de.telran.game.io.GameOutput;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class GuessNumberGameTest {
    GameInput input = org.mockito.Mockito.mock(GameInput.class);
    GameOutput output = Mockito.mock(GameOutput.class);

    @Test
    public void testSuccess() {
        // mock configuration
        when(input.getNextNumber()).thenReturn(3);

        // invoke test method
        GuessNumberGame game = new GuessNumberGame(input, output, 3, 3);
        game.play();

        // verify the result
        verify(output, times(2)).print(anyString());
    }
}
