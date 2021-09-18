import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortTheOdd {
    public static void main(String[] args) {
        int[] arr = sortArray(new int[]{5, 8, 6, 3, 4});
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        List<Integer> buf = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                buf.add(array[i]);
            }
        }

        Collections.sort(buf);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                for (int j = 0; j < buf.size(); j++) {
                    array[i] = buf.get(j);
                    break;
                }
                buf.remove(0);
            }
        }

        return array;
    }
}
