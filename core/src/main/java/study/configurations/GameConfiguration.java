package study.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "study.basecamp")
@PropertySource("classpath:game.properties")
public class GameConfiguration {

    @Value("${min.Number}")
    private int minNumber;

    @Value("${max.Number}")
    private int maxNumber;

    @Value("${guess.Count}")
    private int guessCount;

    @Bean
    public int minNumber() {
        return minNumber;
    }

    @Bean
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    public int guessCount() {
        return guessCount;
    }
}
