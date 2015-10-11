package TextAnalyzer.service;

import TextAnalyzer.utility.EnglishAlphabet;
import TextAnalyzer.utility.TextSummary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by iantaman on 24.09.2015.
 */
public class TextAnalyzerUtils {
    private static Pattern pattern;
    private static Matcher matcher;

    public static void consAndWow(String string) {
        int vowels = 0;
        int consonants = 0;

        string = string.toLowerCase();
        char[] symbolArray = string.toCharArray();

        for (Character c : symbolArray) {
            if (EnglishAlphabet.getLetterList().contains(c)) {

                switch (c) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'y':
                        vowels++;
                        break;
                    default:
                        consonants++;
                        break;
                }
            }
        }
        System.out.println(new TextSummary(vowels, consonants));

    } //count numbers of consonant and vowels

    public static void numbersOfWords(String string) {
        int i = 0;
        pattern = Pattern.compile("[a-zA-Z0-9]*(?=[,\\s\\.()\";:!?/\\-\\|])");
        matcher = pattern.matcher(string);
        while (matcher.find()) {
            i++;
        }
        System.out.print(i);
    }

    public static void numberOfSentence(String string) {
        int i = 0;
        pattern = Pattern.compile("(?:([.!?][\\s]*[A-Z])|([.!?][\\s]*$))");
        matcher = pattern.matcher(string);

        while (matcher.find()) {
            i++;
        }
        System.out.println("There are: " + i + " Sentence(s)");

    }

    public static void findWord(String string, String find) {
        int i = 0;
        pattern = Pattern.compile(find);
        matcher = pattern.matcher(string);

        while (matcher.find()) {
            i++;
        }
        System.out.println(i);
    }

}



