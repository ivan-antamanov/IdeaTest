package TextAnalyzer.Enum;

import TextAnalyzer.TextAnalyzerMethods;

import java.io.*;
import java.util.EnumMap;
import java.util.Scanner;

/**
 * Created by iantaman on 26.09.2015.
 */
public enum CommandList{
    ENTER_TEXT("ett","Enter the text"){},
    ENTER_FILE_PATH("efp","Enter file path"){},
    NUMBER_OF_WORDS("now","Numbers of words"){},
    NUMBER_OF_SENTENCE("nos","Numbers of sentence"){},
    VOWELS_AND_CONSONANTS("nvc","Numbers of vowels and consonants"){},
    TO_FIND_THE_WORD("ftw","To find the word"){},
    HELP("Help"){},
    EXIT("Exit"){};

    private String command;
    private String shortCommand;

    CommandList(String shortCommand, String command) {
        this.shortCommand = shortCommand;
        this.command = command;
    }

    CommandList(String command) {
        this.command = command;

    }

    CommandList() {
    }

    public String getCommand() {
        return command;
    }

    public String getShortCommand() {
        return shortCommand;
    }
}
