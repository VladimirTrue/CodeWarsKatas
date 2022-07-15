/*Write a function which calculates the average of the numbers in a given list.*/

import java.util.Arrays;

public class CalculateAverage {
    public double findAverage(int[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }
}
