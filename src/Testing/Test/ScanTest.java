package Testing.Test;

import TextAnalyzer.Application.service.TextAnalyzerUtils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by iantaman on 30.09.2015.
 */
public class ScanTest {

    public static void main(String[] args) {
        ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());
        System.setIn(in);

        System.setIn(System.in);


    }
}