package Testing.Test.RegexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by iantaman on 07.10.2015.
 */
public class Regex {
    public static void main(String[] args) {

        int i = 0;
       Pattern pattern = Pattern.compile("[A-Z][a]");
       Matcher matcher = pattern.matcher("AaFGaggdAahsAa");

        while( matcher.find()){
            i++;
            System.out.println(matcher.group());
        }
        System.out.println(i);


    }

}

