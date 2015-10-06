package TextAnalyzer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by iantaman on 24.09.2015.
 */
public class TextAnalyzerMethods {
    private static TextSummary textSummary;
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
            textSummary = new TextSummary(vowels,consonants);
            System.out.println("vowels: " + vowels);
            System.out.println("consonants: " + consonants);
            System.out.println(textSummary.getConsonants());

        } //count numbers of consonant and vowels

   public static void numbersOfWords(String string){
            String[] str = string.split(" +");
            System.out.println("Numbers of words: " + str.length);
    }

   public static void numberOfSentence(String string){
       int i = 0;
       pattern = Pattern.compile("(\\s)*([A-Z]){1}[^.]*[.]");
       matcher = pattern.matcher(string);

       while(matcher.find()){
           i++;
           System.out.println(matcher.group());
       }
       System.out.println("There are: " + i + " Sentence(s)");

    }

   public static void findWord(String string, String find){
        find= find.toUpperCase();
        String all=null;
        char[] chars = find.toCharArray();
        for(char c: chars) {
            String str = String.valueOf(c);
            str = str + str.toLowerCase();
            if (all == null) {
                all = "[" + str + "]";
            }else all =all+"[" + str + "]";
        }
        int i = 0;
        pattern = Pattern.compile(all);
        matcher = pattern.matcher(string);

        while( matcher.find()){
           i++;
            System.out.println(matcher.group());
        }
        System.out.println(i);
    }

}



