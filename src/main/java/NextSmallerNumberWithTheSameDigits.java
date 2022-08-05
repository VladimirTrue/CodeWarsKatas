import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class NextSmallerNumberWithTheSameDigits {
    public static long nextSmaller(long n) {

        Set<Long> digitsInp = Arrays.stream(String.valueOf(n).split(""))
                .mapToLong(Long::parseLong)
                .boxed()
                .collect(Collectors.toSet());

        return LongStream.range(1, n)
                .map(longValue -> n - longValue + 1 - 1)
                .filter(dig -> new HashSet<>(Arrays.stream(String.valueOf(dig).split(""))
                        .mapToLong(Long::parseLong)
                        .boxed()
                        .collect(Collectors.toList()))
                        .containsAll(digitsInp)
                        && digitsInp.containsAll(new HashSet<>(Arrays.stream(String.valueOf(dig).split(""))
                        .mapToLong(Long::parseLong)
                        .boxed()
                        .collect(Collectors.toList()))
                ))
                .findFirst().orElse(-1);
    }
}
