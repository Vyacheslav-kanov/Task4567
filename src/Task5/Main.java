package Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static RemoverDuplicate<String> remover = new RemoverDuplicate<>();
    private static List<String> strList = new ArrayList<>(Arrays.asList("example", "value", "value", "Result", "value", "Result", "Result", "example"));
    public static void main(String[] args) {
        for(String e: strList) System.out.println(e);
        List<String> noDuplicates = (ArrayList)remover.removeDuplicates(strList);
        System.out.println();
        for(String e: noDuplicates) System.out.println(e);
    }
}
