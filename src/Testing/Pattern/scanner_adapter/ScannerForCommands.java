package Testing.Pattern.scanner_adapter;

import TextAnalyzer.Application.utility.CommandList;

import java.util.*;

/**
 * Created by iantaman on 13.10.2015.
 */
public class ScannerForCommands implements ScannerMethods {
    private Scanner scanner;
    private ArrayList<String> readFileListCommand;
    private Iterator iterator;


    public ScannerForCommands(Scanner scanner) {
        this.scanner = scanner;
        readFileListCommand = new ArrayList<String>(CommandList.values().length);
        addCommadsToList();
    }

    @Override
    public String nextLine() {
        System.out.println("******");
        if (scanner != null) {
            return scanner.nextLine();
        } else {

            while (iterator.hasNext()) {
//                System.out.println(iterator.next());
                return String.valueOf(iterator.next());
            }
        }
        return "\nSuccessful test";
    }

    @Override
    public boolean hasNextLine() {
        return scanner.hasNextLine();
    }


    void addCommadsToList() {
        if (scanner == null) {
            for (CommandList en : CommandList.values()) {
                if (en.getShortCommand() != null && !en.getShortCommand().equals("ett")) {
                    readFileListCommand.add(en.getShortCommand());

                }
            }
            readFileListCommand.add(1, "C:\\Users\\iantaman\\Desktop\\new 2.txt");
        }
        iterator = readFileListCommand.iterator();

    }

    @Override
    public Scanner getScanner() {
        return scanner;
    }

    void addFilePath(String filePath) {
        if (readFileListCommand.contains("efp")) {
            readFileListCommand.add(readFileListCommand.indexOf("ett") + 1, filePath);
        }
    }


    public static void main(String[] args) {
        ScannerForCommands scannerForCommands = new ScannerForCommands(null);
        System.out.println(scannerForCommands.nextLine());

    }

}
