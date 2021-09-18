import java.util.*;
import java.util.stream.Collectors;


public class FindTheUniqueNumber {
    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
        System.out.println(findUniq(new double[]{0, 0, 0.55, 0, 0}));
        System.out.println(findUniq(new double[]{0, 0, 0, 0, 1}));
        System.out.println(findUniq(new double[]{1, 0, 0, 0, 0}));
    }

    public static double findUniq(double[] arr) {
       return Arrays.asList(Arrays.stream(arr).
               boxed().toArray(Double[]::new))
               .stream()
               .collect(Collectors.groupingBy(v -> Double.valueOf(v), Collectors.counting()))
               .entrySet()
               .stream().filter(entry -> 1 == entry.getValue())
               .mapToDouble(Map.Entry::getKey)
               .findFirst()
               .getAsDouble();

       //первое решение без лямбд
/*        double res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            } else if (arr[i] != arr[i + 1]) {
                if (i == 0 && arr[i] != arr[i + 2]) {
                    res = arr[0];
                    break;
                }
                res = arr[i + 1];
                break;
            }
        }
        return res;
        */
//второе решение разбив, на части потоки
/*        Map<Double, Long> map = Arrays.asList(Arrays.stream(arr).boxed().toArray(Double[]::new))
                .stream()
                .collect(Collectors.groupingBy(v -> Double.valueOf(v), Collectors.counting()));
        return map.entrySet().stream().filter(entry -> 1 == entry.getValue()).mapToDouble(Map.Entry::getKey).findFirst().getAsDouble();
        */
    }


}
