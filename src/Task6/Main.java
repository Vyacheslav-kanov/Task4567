package Task6;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer, String> map = new HashMap<>();
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            map.put(i, Math.round(Math.random() * 10) + "_Val");
        }
        map.entrySet().stream().forEach(System.out::println);
        System.out.println();
        new FlipperMap<Integer, String>().revers(map).entrySet().forEach(System.out::println);
    }
}
