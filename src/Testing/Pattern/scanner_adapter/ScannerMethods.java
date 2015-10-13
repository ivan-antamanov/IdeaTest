package Testing.Pattern.scanner_adapter;

import java.util.Scanner;

/**
 * Created by iantaman on 13.10.2015.
 */
public interface ScannerMethods {
    Scanner scanner = null;
    String nextLine();
    boolean hasNextLine();
    Scanner getScanner();
}
