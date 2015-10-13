package TextAnalyzer.Application;

import Testing.Pattern.scanner_adapter.ScannerForCommands;
import Testing.Pattern.scanner_adapter.ScannerForTest;
import TextAnalyzer.Application.service.ConsoleCommands;
import TextAnalyzer.Application.service.TextAnalyzerUtils;

import java.util.Scanner;

/**
 * Created by iantaman on 24.09.2015.
 */
public class Main {
    public static void main(String[] args) {

        TextAnalyzerUtils text = new TextAnalyzerUtils();
        Scanner scanner = new Scanner(System.in);
        ScannerForCommands scannerForCommands = new ScannerForCommands(null);
        ConsoleCommands consoleCommands = new ConsoleCommands(scannerForCommands);


    }
}
