import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculateAverage {
    @Test
    public void testFindAverage() {
        CalculateAverage classForTest = new CalculateAverage();

        int[] testCase1 = new int[]{3, 5};
        double result1 = classForTest.findAverage(testCase1);
        int[] testCase2 = new int[]{1, 5, 3};
        double result2 = classForTest.findAverage(testCase2);
        int[] testCase3 = new int[]{1, 2, 3, 4, 5, 6};
        double result3 = classForTest.findAverage(testCase3);


        Assertions.assertEquals(4, result1);
        Assertions.assertEquals(3, result2);
        Assertions.assertEquals(3.5, result3);
    }
}
