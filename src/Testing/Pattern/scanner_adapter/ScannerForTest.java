package Testing.Pattern.scanner_adapter;

import java.util.Scanner;

/**
 * Created by iantaman on 13.10.2015.
 */
public class ScannerForTest implements ScannerMethods {
    private Scanner scanner;
    private Scan scan;
    public ScannerForTest() {
        this.scanner = null;
    }

    @Override
    public String nextLine() {
        return null;
    }

    @Override
    public boolean hasNextLine() {
        return true;
    }

    @Override
    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    class Scan{

    }
}
