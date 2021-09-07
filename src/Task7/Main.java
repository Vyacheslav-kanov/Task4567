package Task7;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] exampleArr = {"Ivan 5", "Petr 3", "Alex 10", "Petr 8",
                "Ivan 6", "Alex 5", "Ivan 1", "Petr 5", "Alex 1"};
        System.out.println(outWinner(exampleArr));
    }

    private static String outWinner(String[] statArr){
        Map<String, Integer> statMap = new HashMap<>();
        String name;
        int point;

        for (int i = 0; i < statArr.length; i++) {
            String[] statArrSplit = statArr[i].split(" ");

            name = statArrSplit[0];
            point = Integer.parseInt(statArrSplit[1]);

            if(statMap.containsKey(name)) statMap.put(name, statMap.get(name) + point);
            else statMap.put(name, point);
        }

        String winner = statMap.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed())
                .map(x -> x.getKey() + " " + x.getValue())
                .findFirst().orElse("");
        return winner;
    }
}
