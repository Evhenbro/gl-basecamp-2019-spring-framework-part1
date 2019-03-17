package study.basecamp;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

public class NumberGeneratorImpl implements NumberGenerator {

    private final Random random = new Random();

    private int minNumber;
    private int maxNumber;

    @Autowired
    @Override
    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    @Autowired
    @Override
    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public int next() {
        return minNumber + random.nextInt(maxNumber - minNumber);
    }

    @Override
    public int getMinNumber() {
        return minNumber;
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }

}
