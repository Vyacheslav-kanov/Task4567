package Task4;

import java.util.Arrays;
import java.util.List;

public class OfferUtil {

    public static String stingSpaces(String offer){ //удаляем все пробелы
        if(offer == null) return "";
        return offer.replaceAll(" ", "");
    }

    public static String removeSigns(String offer){ //Удаление знаков
        List<String> maskList = Arrays.asList(
                ".", ",", "?", "!", "\"", "'", "/", "\\", "<", ">", "\n",
                "|", ":", ";", "]", "[", "}", "{", "@", "#", "№",
                "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "="
        );
        String word = "";
        for (int i = 0; i < offer.length(); i++) {
            word = offer.substring(i, i + 1);
            if(maskList.contains(word)) offer = offer.replace(word, "");
        }
        return offer;
    }
}
