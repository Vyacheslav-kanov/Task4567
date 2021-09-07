package Task4;

public class Main {

    static FrequencyDictionary dictionary = new FrequencyDictionary();
    public static void main(String[] args) {
        dictionary.analysis("Необходимо реализовать приложение на вход которого\n" +
                "поступает текст, а на выходе выводится частотный словарь букв\n" +
                "латинского(английского) алфавита.");
        dictionary.print();
    }
}
