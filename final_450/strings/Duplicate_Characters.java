package final_450.strings;

import java.util.*;

public class Duplicate_Characters {

    public static void main(String[] args) {
        String input = "Hello";
        char inChar[] = input.toCharArray();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (inChar[i] == inChar[j]) {
                    set.add(inChar[i]);
                }
            }
        }
        System.out.println(set);
    }
}
