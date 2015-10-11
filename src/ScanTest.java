import TextAnalyzer.service.TextAnalyzerUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by iantaman on 30.09.2015.
 */
public class ScanTest {


    public static void main(String[] args) {
        String str;
        TextAnalyzerUtils analyzer = new TextAnalyzerUtils();
        try {
            Scanner in = new Scanner(new File("C:\\Users\\iantaman\\Desktop\\new 1.txt"));
            System.out.println("Successful file scan");
//            while (in.hasNextLine()){
//                str = in.nextLine();
//                System.out.println(str);
//                System.out.println(str.length());


                analyzer.numberOfSentence("Regular expression processors are found in several search engines, search and replace dialogs of several \n" +
                        "word processors and text editors, and in the command lines of text processing utilities, such as sed and AWK.");


//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
