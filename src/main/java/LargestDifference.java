import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LargestDifference {
    public static int largestDifference(int[] data) {
        int resIndex = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i] <= data[j] && resIndex < j - i) {
                    resIndex = j - i;
                }
            }
        }
        return resIndex;
    }
}
