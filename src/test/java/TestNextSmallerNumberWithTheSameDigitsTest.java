import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestNextSmallerNumberWithTheSameDigitsTest {

    @Test
    void nextSmaller() {
        Assertions.assertEquals(123456789, NextSmallerNumberWithTheSameDigits.nextSmaller(123456798));

        Assertions.assertEquals(790, NextSmallerNumberWithTheSameDigits.nextSmaller(907));

        Assertions.assertEquals(414, NextSmallerNumberWithTheSameDigits.nextSmaller(441));

        Assertions.assertEquals(12, NextSmallerNumberWithTheSameDigits.nextSmaller(21));
        Assertions.assertEquals(513, NextSmallerNumberWithTheSameDigits.nextSmaller(531));
        Assertions.assertEquals(-1, NextSmallerNumberWithTheSameDigits.nextSmaller(1027));
    }
}