package study.basecamp;

import org.apache.logging.log4j.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess Number start game!!!");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("study.configurations");
        BizLogic.getGameCycle(context);
        context.close();
    }

}