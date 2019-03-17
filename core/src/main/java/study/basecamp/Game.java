package study.basecamp;

public interface Game {

    void setGuess(int guess);

    int getGuess();

    void setGuessCount(int guessCount);

    int getGuessCount();

    void setSmallest(int smallest);

    int getSmallest();

    void setBiggest(int biggest);

    int getBiggest();

    void setRemainingGuesses(int remainingGuesses);

    int getRemainingGuesses();

    void reset();

    void check();

    boolean isValidNumberRange();

    boolean isGameWon();

    boolean isGameLost();

    void setNumberGenerator(NumberGenerator numberGenerator);

    NumberGenerator getNumberGenerator();

    void setNumber(int number);

    int getNumber();

}
