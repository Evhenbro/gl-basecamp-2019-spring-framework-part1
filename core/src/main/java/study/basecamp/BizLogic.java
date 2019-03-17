package study.basecamp;

import org.apache.logging.log4j.*;
import org.springframework.context.ConfigurableApplicationContext;
import study.scanner.ReadFromConsole;

public class BizLogic {

    private static final Logger log = LogManager.getLogger(BizLogic.class);

    public static void getGameCycle(ConfigurableApplicationContext context) {
        Game game =context.getBean(Game.class);
        do {
            log.info("You should write number in range [" + game.getSmallest() + ": " + game.getBiggest() + "]");
            int guess = 0;
            do {
                guess = ReadFromConsole.readConsole(game);
            } while ((ReadFromConsole.choise < game.getSmallest())||(ReadFromConsole.choise > game.getBiggest()));
            log.info("My guess = {}", guess);
            game.setGuess(guess);
            game.check();
            log.info("Result = {}", game.isGameWon() ? "Win" : "Lose");
            if (game.isGameWon() == false) {
                if (game.getRemainingGuesses() == 0)
                    log.info("You have " + game.getRemainingGuesses() + " attempts. The GAME IS OVER!!!");
                else
                    log.info("You have " + game.getRemainingGuesses() + " attempts. Do not waste them!!");
            }
        } while (game.isGameLost());

    }
}
