import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;

public class GameTest {
    public static Stream<Arguments> getParameters(){
        return Stream.of(
                arguments(new String[]{"rock", "scissors"}, "Player 1 win!"),
                arguments(new String[]{"scissors", "paper"}, "Player 1 win!"),
                arguments(new String[]{"paper", "rock"}, "Player 1 win!"),
                arguments(new String[]{"rock", "paper"}, "Player 2 win!"),
                arguments(new String[]{"scissors", "rock"}, "Player 2 win!"),
                arguments(new String[]{"paper", "scissors"}, "Player 2 win!"),
                arguments(new String[]{"rock", "rock"}, "Draw"),
                arguments(new String[]{"scissors", "scissors"}, "Draw"),
                arguments(new String[]{"paper", "paper"}, "Draw")
        );
    }

    @ParameterizedTest
    @MethodSource("getParameters")
    public void parametersizedTest(String[] input, String expect){

        Game gameInput = new Game();

        assertEquals(gameInput.Rock_Paper_Scissors(input[0], input[1]), expect);
    }

    @Test
    public void IllegalArgumentTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Game().Rock_Paper_Scissors("abcde","rock");
        });
    }
}
