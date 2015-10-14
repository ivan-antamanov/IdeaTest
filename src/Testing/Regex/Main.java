package Testing.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by iantaman on 30.09.2015.
 */
public class Main {

    private static String string= "Trolo-lo   loldblkd dlmdfg lkbgmfdl! f fgmblkgfb. Gf mlfgkb  dlkklmkl sdffdff! fvfsddc. SGGffdb dbdbf";

    public static void main(String[] args) {

        int i = 0;
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+(?=[,\\s\\.()\";:!?\\/\\-]*)");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            i++;
        }
        System.out.println("There are:" + i + "words");
    }

}
