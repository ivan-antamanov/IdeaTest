package main.java.Trainee.RecursionTest;

import main.java.TextAnalyzer.impl.utility.CommandList;

import java.util.Scanner;

import static main.java.TextAnalyzer.impl.utility.CommandList.*;

/**
 * Created by iantaman on 15.10.2015.
 */
public class CommandRecursion {
    Scanner scanner = new Scanner(System.in);
    CommandList commandList = CommandList.NUMBER_OF_WORDS;
    String inputText = null;

    public boolean recursionTest() {
        String command = scanner.nextLine();
        boolean exit = true;
        System.out.println("Enter the command please");
        if (getStringEnumMap().containsKey(command)) {
            switch (getStringEnumMap().get(command)) {
                case TEXT_MODEL:
                    System.out.println(TEXT_MODEL);
                    break;
                case FILE_MODEL:
                    System.out.println(FILE_MODEL);
                    break;
                case NUMBER_OF_WORDS:
                    System.out.println(NUMBER_OF_WORDS);
                    break;
                case NUMBER_OF_SENTENCE:
                    System.out.println(NUMBER_OF_SENTENCE);
                    break;
                case VOWELS_AND_CONSONANTS:
                    System.out.println(VOWELS_AND_CONSONANTS);
                    break;
                case TO_FIND_THE_WORD:
                    System.out.println(TO_FIND_THE_WORD);
                    break;
                case NUMBER_OF_SYMBOLS:
                    System.out.println(TO_FIND_THE_WORD);
                    break;
                case HELP:
                    System.out.println(HELP);
                    break;
                case EXIT:
                    exit = true;
                    System.out.println("Bay!");
                    return false;
                default:
                    System.out.println("This command has not included into list yet");


            }

        } else {
            System.out.println("Wrong command");
        }
        return recursionTest();
    }

    int i = 0;

    boolean some() {
        System.out.println("true");
        return i < 5; //very cool!
    }


    public static void main(String[] args) {
        CommandRecursion com = new CommandRecursion();
//        while (com.some()){
//            com.i++;
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the command pls");
        while(com.recursionTest());
//        com.recursionTest();
//

    }


}
