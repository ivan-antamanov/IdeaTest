package Test;

import java.util.Arrays;

/**
 * Created by iantaman on 01.10.2015.
 */
public class Contain {
    public static void main(String[] args) {
        String find ="caT".toUpperCase();
        String all=null;


        char[] chars = find.toCharArray();
        for(char c: chars) {
            String str = String.valueOf(c);
            str = str + str.toLowerCase();
            if (all == null) {
                all = "[" + str + "]";
            }else all =all+"[" + str + "]";
        }
        System.out.println(all);
    }
}
