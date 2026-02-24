import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TravelCalculatorTest {
    TravelCalculator calculator = new TravelCalculator();
    @Test
    void calculateSpeed() {
        assertEquals(100,calculator.calculateSpeed(100,1));
    }
}