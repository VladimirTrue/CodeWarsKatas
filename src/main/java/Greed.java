import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Greed {
    public static void main(String[] args) {
        //System.out.println(greedy(new int[]{5, 1, 3, 4, 1}));
        System.out.println(greedy(new int[]{1, 1, 1, 3, 1}));
        System.out.println(greedy(new int[]{2, 4, 4, 5, 4}));
    }

    public static int greedy(int[] dice) {
        Map<Integer, Integer> map = new HashMap<>();
        AtomicInteger res = new AtomicInteger();
        final int SCORE_FOR_FIVE = 50;
        final int SCORE_FOR_ONE = 100;
        Arrays.stream(dice).forEach(ints -> {
            if (!map.containsKey(ints)) {
                map.put(ints, 1);
            } else {
                map.put(ints, map.get(ints) + 1);
            }
        });

        map.forEach((k, v) -> {
            if (v >= 3) {
                if (k == 1)
                    res.addAndGet(1000);
                else
                    res.addAndGet(Integer.parseInt(k + "00"));
                v = v - 3;
            }

            if (k == 1)
                res.set(res.get() + v * SCORE_FOR_ONE);
            if (k == 5)
                res.set(res.get() + (v * SCORE_FOR_FIVE));

        });

        return res.get();
    }
}
