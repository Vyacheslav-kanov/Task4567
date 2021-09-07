package Task4;

import java.util.*;

public class FrequencyDictionary {

    private Map<String, Integer> dictionary;

    public FrequencyDictionary() {
        this.dictionary = new HashMap<>();
    }

    public Map<String, Integer> getDictionary() {
        return dictionary;
    }

    public void setDictionary(Map<String, Integer> dictionary) {
        this.dictionary = dictionary;
    }

    public void add(String word){ //Считаем буквы
        if(word == null) return; //проверка на null
        word = word.substring(0); // проверка на предложение
        if(dictionary.containsKey(word)){
            dictionary.put(word, dictionary.get(word) + 1);
        }else dictionary.put(word, 1);
    }

    public void analysis(String offer){ //Разбираем предложение на буквы
        if(offer == null) return;
        offer = offer.toUpperCase(Locale.ROOT);
        offer = OfferUtil.stingSpaces(offer);
        offer = OfferUtil.removeSigns(offer);
        for (int i = 0; i < offer.length(); i++) {
            add(offer.substring(i, i + 1));
        }
    }

    public  void print(){ //Вывод в консоль + сортировка
        dictionary.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey())
                .map(e -> e.getKey() + " - " + e.getValue())
                .forEach(System.out::println);
    }
}
