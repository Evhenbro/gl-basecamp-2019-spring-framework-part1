package study.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import study.basecamp.GameImpl;
import study.basecamp.NumberGeneratorImpl;

@Configuration
@ComponentScan(basePackages = "study.basecamp")
public class AppConfiguration {

    @Bean
    public NumberGeneratorImpl numberGeneratorImpl() {
        return new NumberGeneratorImpl();
    }

    @Bean
    public GameImpl gameImpl() {
        return new GameImpl();
    }
}
