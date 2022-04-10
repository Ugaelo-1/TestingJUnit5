import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    @DisplayName("Count my Orders")
    void Counting(){
        assertEquals(6, Calc.Counting(2, 4, 7, 9, 10, 25));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, Calc.multiply(2, 2)),
                ()-> assertEquals(-4, Calc.multiply(2, -2)),
                ()-> assertEquals(4, Calc.multiply(-2, -2)),
                () -> assertEquals(0, Calc.multiply(1, 0)));
    }
}