package study.basecamp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameImplTest {

    Game game;
    NumberGenerator numberGenerator;

    @BeforeEach
    void initializeGameAndNumberGeneration() {
        game = new GameImpl();
        numberGenerator = new NumberGeneratorImpl();
    }

    @AfterEach
    void destroyGameAndNumberGeneration() {
        game = null;
        numberGenerator = null;
    }

    @Test
    void testInMethodResetTheSmallestElement() {
        numberGenerator.setMinNumber(0);
        numberGenerator.setMaxNumber(100);
        game.setNumberGenerator(numberGenerator);
        game.reset();
        assertEquals(0, game.getSmallest());
    }

    @Test
    void testInMethodResetTheGuessElement() {
        numberGenerator.setMinNumber(0);
        numberGenerator.setMaxNumber(100);
        game.setNumberGenerator(numberGenerator);
        game.setGuess(30);
        game.reset();
        assertEquals(0, game.getGuess());
    }

    @Test
    void testInMethodResetTheRemainingGuessesElement() {
        numberGenerator.setMinNumber(0);
        numberGenerator.setMaxNumber(100);
        game.setNumberGenerator(numberGenerator);
        game.setGuessCount(23);
        assertEquals(23, game.getGuessCount());
    }

    @Test
    void testInMethodResetTheBiggestElement() {
        numberGenerator.setMinNumber(0);
        numberGenerator.setMaxNumber(58);
        game.setNumberGenerator(numberGenerator);
        game.reset();
        assertEquals(58, game.getBiggest());
    }

    @Test
    void testInMethodResetTheNumberElement() {
        numberGenerator.setMinNumber(0);
        numberGenerator.setMaxNumber(10);
        game.setNumberGenerator(numberGenerator);
        game.reset();
        assertEquals(true, game.getNumber() >= 0 && game.getNumber() <=10);
    }

    @Test
    void testTheMethodCheckWhenGuessGraterThenNumber() {
        game.setGuess(12);
        game.setNumber(5);
        game.setSmallest(0);
        game.setBiggest(20);
        game.check();
        assertEquals(11, game.getBiggest());
    }

    @Test
    void testTheMethodCheckWhenNumberGraterThenGuess() {
        game.setGuess(5);
        game.setNumber(12);
        game.setSmallest(0);
        game.setBiggest(20);
        game.check();
        assertEquals(6, game.getSmallest());
    }

    @Test
    void testTheMethodCheckOnWorkingDecrementOfRemainingGuesses() {
        game.setGuess(6);
        game.setNumber(11);
        game.setSmallest(0);
        game.setBiggest(20);
        game.setRemainingGuesses(3);
        game.check();
        assertEquals(2, game.getRemainingGuesses());
    }

    @Test
    void isGameWon() {
        game.setGuess(9);
        game.setNumber(9);
        assertEquals(true, game.getNumber()==game.getGuess());
    }

    @Test
    void isGameLost() {
        game.setGuess(43);
        game.setNumber(9);
        game.setRemainingGuesses(0);
        assertEquals(false, game.getNumber()==game.getGuess() && game.getRemainingGuesses()>0);
    }

    @Test
    void checkValidNumberRange() {
        game.setSmallest(5);
        game.setBiggest(30);
        game.setGuess(14);
        assertEquals(true, (game.getGuess() >= game.getSmallest())&&(game.getGuess() <= game.getBiggest()));
    }

    @Test
    void getSmallest() {
        game.setSmallest(6);
        assertEquals(6, game.getSmallest());
    }

    @Test
    void getBiggest() {
        game.setBiggest(4);
        assertEquals(4, game.getBiggest());
    }

    @Test
    void getRemainingGuesses() {
        game.setRemainingGuesses(3);
        assertEquals(3, game.getRemainingGuesses());
    }

    @Test
    void getGuess() {
        game.setGuess(7);
        assertEquals(7, game.getGuess());
    }

    @Test
    void getGuessCount() {
        game.setGuessCount(3);
        assertEquals(3, game.getGuessCount());
    }

    @Test
    void getNumberGenerator() {
        numberGenerator.setMinNumber(1);
        numberGenerator.setMaxNumber(3);
        game.setNumberGenerator(numberGenerator);
        assertEquals(numberGenerator, game.getNumberGenerator());
    }

    @Test
    void getNumber() {
        game.setNumber(2);
        assertEquals(2 , game.getNumber());
    }
}