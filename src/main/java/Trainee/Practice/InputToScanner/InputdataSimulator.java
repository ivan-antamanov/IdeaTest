package main.java.Trainee.Practice.InputToScanner;

import main.java.TextAnalyzer.impl.utility.CommandList;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by iantaman on 15.10.2015.
 */
public class InputdataSimulator {
    private StringBuilder stringBuilder = new StringBuilder();
    private ArrayList<String> cmnds;
    private Iterator iterator;

    public InputdataSimulator() {

    }

    {
        cmnds = new ArrayList<>(CommandList.values().length);
        for (CommandList en : CommandList.values()) {
            if (en.getShortCommand() != null && !en.getShortCommand().equals("ett")) { //not add "Enter the text" command
                cmnds.add(en.getShortCommand());

            }
        }
        iterator = cmnds.iterator();
    }


    void simulateInputStream() {
        while (iterator.hasNext()) {
            String currentCommand = String.valueOf(iterator.next());

            try (InputStream is = new ByteArrayInputStream(currentCommand.getBytes()); Scanner scanner = new Scanner(is)) {
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        InputdataSimulator inputdataSimulator = new InputdataSimulator();
        inputdataSimulator.simulateInputStream();
    }
}



