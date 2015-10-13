package TextAnalyzer.Application.utility;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by iantaman on 26.09.2015.
 */
public enum CommandList {
    TEXT_MODEL("ett", "Enter the text and analyze it"),
    FILE_MODEL("efp", "Enter text-file path like \"C:\\\\Users\\\\iantaman\\\\Desktop\\\\new 1.txt\" and analyze it"),
    NUMBER_OF_WORDS("now", "Numbers of words"),
    NUMBER_OF_SENTENCE("nos", "Numbers of sentence"),
    VOWELS_AND_CONSONANTS("nvc", "Numbers of vowels and consonants"),
    TO_FIND_THE_WORD("ftw", "To find the word"),
    NUMBER_OF_SYMBOLS("numsym", "To find the word"),
    HELP("Help"),
    EXIT("Exit");

    private String command;
    private String shortCommand;

    CommandList(String shortCommand, String command) {
        this.shortCommand = shortCommand;
        this.command = command;

    }

    CommandList(String shortCommand) {
        this.shortCommand = shortCommand;

    }

    public String getCommand() {
        return command;
    }

    public String getShortCommand() {
        return shortCommand;
    }

    private static HashMap<String, CommandList> stringEnumMap = new HashMap<String, CommandList>();
//    private static ArrayList<String> shortEnumComList = new ArrayList<String>(CommandList.values().length);

    static {
        for (CommandList e : CommandList.values()) {
            if (e.getShortCommand() != null) {
//                shortEnumComList.add()
                stringEnumMap.put(e.getShortCommand(), e);
            } else {
                stringEnumMap.put(e.getCommand().toLowerCase(), e);
            }
        }
    }

    public static HashMap<String, CommandList> getStringEnumMap() {
        return stringEnumMap;
    }


    @Override
    public String toString() {
        if (shortCommand != null) {
            return shortCommand + "(command)" + "=" + command;
        } else {
            return command.toLowerCase() + "(command)" + "=" + command;

        }
    }
}
