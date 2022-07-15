/*Write a function which calculates the average of the numbers in a given list.
* https://www.codewars.com/kata/57a2013acf1fa5bfc4000921/solutions/java*/

import java.util.Arrays;

public class CalculateAverage {
    public double findAverage(int[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }
}
