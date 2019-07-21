import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

    private String diaper;

    public Anagram(String diaper) {
        this.diaper = diaper;
    }

    public String getDiaper() {
        return diaper;
    }

    private boolean isTheSameCaseInsensaitive(String input) {
        return getDiaper().toLowerCase().equals(input.toLowerCase());
    }

    private boolean isAnagram(String s) {
        char[] diaperNoWhiteSpaces = toCharArrayWithNoWhitespaces(getDiaper());
        Arrays.sort(diaperNoWhiteSpaces);
        char[] inputNoWhiteSpaces = toCharArrayWithNoWhitespaces(s);
        Arrays.sort(inputNoWhiteSpaces);
        return Arrays.equals(diaperNoWhiteSpaces, inputNoWhiteSpaces);
    }

    private char[] toCharArrayWithNoWhitespaces(String input) {
        return input.toLowerCase().replaceAll("\\s", "").toCharArray();
    }

    public List<String> match(List<String> asList) {

        List<String> anagrams = new ArrayList<>();

        for (String s : asList) {
            if (isAnagram(s) && !isTheSameCaseInsensaitive(s)) {
                anagrams.add(s);
            }
        }
        return anagrams;
    }
}
