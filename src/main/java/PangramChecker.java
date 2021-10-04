import java.util.*;
import java.util.stream.Collectors;

public class PangramChecker {
    public static void main(String[] args) {
        System.out.println("result: " + check("a bC"));
    }

    public static boolean check(String sentence) {
        Set<Character> set = "abcdefghijklmnopqrstuvwxyz".chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        List<Character> list = sentence.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        list.forEach(chars -> set.remove(chars));
        if (set.isEmpty()) return true;
        return false;
    }
}
/*
* A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence
* "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
* */