package main.java.TextAnalyzer.test;

import main.java.TextAnalyzer.impl.scanner_adapter.ScannerForUser;
import main.java.TextAnalyzer.impl.service_tool.ConsoleCommands;
import main.java.TextAnalyzer.impl.service_tool.TextAnalyzerUtils;

import java.util.Scanner;

/**
 * Created by iantaman on 15.10.2015.
 */
public class Main {
    public static void main(String[] args) {

        ScannerForUser scannerForTest = new ScannerForTest("src\\main\\java\\TextAnalyzer\\resources\\new 3.txt", "AWT");
        ConsoleCommands consoleCommands = new ConsoleCommands(scannerForTest);

        consoleCommands.scanningProcessChoosen();
    }
}
