package study.basecamp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorImplTest {

    @Test
    void next() {
        NumberGenerator numberGenerator = new NumberGeneratorImpl();
        numberGenerator.setMinNumber(5);
        numberGenerator.setMaxNumber(9);
        int number = numberGenerator.next();
        assertEquals(true, number>= 5 && number <= 9);
    }

    @Test
    void getMinNumber() {
        NumberGenerator numberGenerator = new NumberGeneratorImpl();
        numberGenerator.setMinNumber(7);
        assertEquals(7, numberGenerator.getMinNumber());
    }

    @Test
    void getMaxNumber() {
        NumberGenerator numberGenerator = new NumberGeneratorImpl();
        numberGenerator.setMaxNumber(40);
        assertEquals(40, numberGenerator.getMaxNumber());
    }
}