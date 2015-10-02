package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by iantaman on 30.09.2015.
 */
public class Main {

    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("([a-zA-Z0-9&&[^kK]]){0,12}([\\s])*");
        Pattern pattern1 = Pattern.compile("([a-zA-Z0-9]){0,12}([\\s]){0,}([a-zA-Z0-9]){1,}[\\.]{0,1}[\\s]{0,}[A-Z]{1}[a-z]{1,}");

        Pattern patter2n = Pattern.compile("(([a-z]){1,}[\\.-]{0,1})+" +
                "@(([a-z]){1,}[\\.-]{0,1})+" + "(([\\.]){1}([a-z]){2,4})+");
        Pattern patternm = Pattern.compile("\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}");

//        Matcher matcher = pattern.matcher("name-email.one@gmail.com.tu.tu");
//        boolean bol = matcher.matches();

//        System.out.println(bol);

        Pattern p = Pattern.compile("(якороль).+(\\1)");
        Matcher m = p.matcher("регулярные выражения это круто регулярные выражения это круто регулярные выражения это круто якороль Я СЕГОДНЯ ЕЛ БАНАНЫ якороль регулярные выражения это круто" );
        if(m.find()){
            System.out.println(m.group());
        }


    }
}
