package elsoprojekt;

public class Main {

    public static void main(String[] args) {
        String result = censor("A kutya nagyon aranyos kutya","kutya","macska");
        System.out.println("Proba" + result);

    }

    static String censor(String text, String toChange, String newWord){
        text = text.replaceAll(toChange, newWord);

        return text;
    }
}
