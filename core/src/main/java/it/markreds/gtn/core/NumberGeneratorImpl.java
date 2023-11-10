package it.markreds.gtn.core;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberGeneratorImpl implements NumberGenerator {
    private final Random random = new Random();

    @Getter
    private final int minNumber;

    @Getter
    private final int maxNumber;

    @Autowired
    public NumberGeneratorImpl(@MinNumber int minNumber, @MaxNumber int maxNumber) {
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
    }

    @Override
    public int next() {
        // example: min=5 max=20 -> max-min=15 -> range 0-15 + min -> 5-20
        return random.nextInt(maxNumber - minNumber) + minNumber;
    }

}
