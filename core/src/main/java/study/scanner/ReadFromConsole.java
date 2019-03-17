package study.scanner;

import org.apache.logging.log4j.*;
import study.basecamp.BizLogic;
import study.basecamp.Game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsole {

    private static final Logger log = LogManager.getLogger(BizLogic.class);
    public static int choise;
//    public static void setScanner(Scanner scanner) {
//        ReadFromConsole.scanner = scanner;
//    }



    public static int readConsole(Game game){
        log.info("Please, write number in range [" + game.getSmallest() + ": " + game.getBiggest() + "]");
        try {
            Scanner scanner = new Scanner(System.in);
            choise = scanner.nextInt();
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Write not correct format " + e);
        }
        return choise;
    }


}
