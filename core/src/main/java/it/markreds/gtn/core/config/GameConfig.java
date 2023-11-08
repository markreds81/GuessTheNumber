package it.markreds.gtn.core.config;

import it.markreds.gtn.core.GuessCount;
import it.markreds.gtn.core.MaxNumber;
import it.markreds.gtn.core.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "it.markreds.gtn")
@PropertySource("classpath:config/game.properties")
public class GameConfig {

    @Value("${game.minNumber:1}")
    private int minNumber;

    @Value("${game.maxNumber:20}")
    private int maxNumber;

    @Value("${game.guessCount:5}")
    private int guessCount;

    @Bean
    @MinNumber
    public int minNumber() {
        return minNumber;
    }

    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }
}
