import java.util.*;
import java.util.stream.Collectors;

public class Permutations {
    public static void main(String[] args) {
        System.out.println(singlePermutations("aaabbcdd"));
    }


    public static int getFactorial(int num) {
        return num <= 1 ? 1 : num * getFactorial(num - 1);
    }


    public static List<String> singlePermutations(String s) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, s.split(""));

        Map<String, Integer> map = new HashMap<>();
        //набираю в map количество для каждого символа
        list.forEach(s1 -> {
                    if (!map.containsKey(s1))
                        map.put(s1, 1);
                    else
                        map.replace(s1, map.get(s1) + 1);
                }
        );

        //вычисляю факториал для количества по каждому значению символа
        map.forEach((s1, integer) -> map.replace(s1, getFactorial(integer)));
        //перемножаю факториалы между собой
        Long factorialValuesOfLatters = map.keySet().stream().mapToLong(key -> map.get(key)).reduce(1, (a, b) -> a * b);
        //получаю коненое число кобинация
        long permutations = getFactorial(list.size()) / factorialValuesOfLatters;


        List<String> resList = new ArrayList<>();

        //заполняю итоговый список, до тех пор пока в нем не будет нужного количества элементов с разным значением
        while (true) {
            StringBuilder sb = new StringBuilder();
            Collections.shuffle(list);
            list.forEach(str -> sb.append(str));
            if (!resList.contains(sb.toString()))
                resList.add(sb.toString());
            if (resList.size() == permutations)
                break;
        }
        return resList;
    }
}
