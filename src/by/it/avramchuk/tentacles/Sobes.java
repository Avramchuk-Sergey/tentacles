package by.it.avramchuk.tentacles;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sobes {

    String sortByCountOfVowels(String... words) {
        StringBuilder sentence = new StringBuilder();

        List<String> listWords = Arrays.asList(words);
        Comparator<String> comparator = (o1, o2) -> countVowels(o1) - countVowels(o2);

        listWords.sort(comparator);

        for (String word : listWords) {
            sentence.append(word).append(" ");
        }
        return sentence.toString();

    }

    int countVowels(String word) {

        final String VOWELS = "[AaEeIiOoUuYy]";
        int countVowels = 0;

        Pattern pattern = Pattern.compile(VOWELS);
        Matcher matcher = pattern.matcher(word);

        while (matcher.find()) {
            countVowels++;
        }
        return countVowels;
    }
}