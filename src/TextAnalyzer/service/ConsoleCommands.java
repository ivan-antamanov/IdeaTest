package TextAnalyzer.service;

import TextAnalyzer.utility.CommandList;
import TextAnalyzer.utility.Text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by iantaman on 26.09.2015.
 */
public class ConsoleCommands {

    private Text userInputText;
    private Scanner scanner;


    public ConsoleCommands() {
        scanner = new Scanner(System.in);
        userInputText = new Text();
        scanningProcessChoosen();
    }

    private void scanningProcessChoosen() {
        print("Enter the command for analyze text or text-file. (help)");
        try {
            switch (CommandList.getStringEnumMap().get(scanner.nextLine())) {
                case TEXT_MODEL:
                    print("Enter the text");
                    readUserInputText();
                    print("Enter the command");
                    process(scanner.nextLine());
                    break;
                case FILE_MODEL:
                    print("Enter the file path");
                    fileChose(scanner.nextLine());
                    break;
                case HELP:
                    help();
                    break;
                default:
                    print("Unsupported command! You have to enter digit such as those" + CommandList.getStringEnumMap());
            }
        } catch (Exception e) {
            System.out.println("Error!");
            scanningProcessChoosen();
        }
        scanningProcessChoosen();
    }

    private void fileChose(String filePath) {
        Path file = Paths.get(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try(BufferedReader bufferedReader = Files.newBufferedReader(file)) {

            while (bufferedReader.readLine() != null) {
                stringBuilder.append(bufferedReader.readLine());
                stringBuilder.append("\n");
            }
            bufferedReader.close();
            userInputText.setInputText(stringBuilder.toString());
            System.out.print(userInputText);
            print("Successful scan");
            print("Enter the command");
            process(scanner.nextLine());
        } catch (FileNotFoundException e) {
            print("Non-correct file path");
            fileChose(scanner.nextLine());
        } catch (IOException e) {
            print("Can't scanning file! Please check file settings");
            fileChose(scanner.nextLine());
        } catch (Exception e) {
            print("Something going wrong. Please try again");
        }
    }

    void process(String command) {
        print("Enter command:");
        if (CommandList.getStringEnumMap().containsKey(command)) {
            switch (CommandList.getStringEnumMap().get(command)) {
                case NUMBER_OF_WORDS:
                    TextAnalyzerUtils.numbersOfWords(userInputText.getInputText());
                    break;
                case NUMBER_OF_SENTENCE:
                    TextAnalyzerUtils.numberOfSentence(userInputText.getInputText());
                    break;
                case VOWELS_AND_CONSONANTS:
                    TextAnalyzerUtils.consAndWow(userInputText.getInputText());
                    break;
                case TO_FIND_THE_WORD:
                    print("Write the word which u wanna find");
                    String find = scanner.nextLine();
                    TextAnalyzerUtils.findWord(userInputText.getInputText(), find);
                    break;
                case HELP:
                    help();
                    break;
                case EXIT:
                    System.exit(0);
                    break;
                default:
                    print("Unsupported command! You have to enter digit such as those" + CommandList.getStringEnumMap());
            }
        }
        process(scanner.nextLine());

    }

    private void readUserInputText() {
        userInputText.setInputText(scanner.nextLine());
    }

    public void help() {
        print("This is \"text analyzer\" which can analyzing the text.\n" +
                "At first u have to choose how r u going to analyze text: from file or has entered in console.\n" +
                "After that u can choose methods to analyze\n" +
                "When the analyze has finished u may exit from applications");
        for (CommandList command : CommandList.values())
            System.out.println(command.toString());
    }

    public void print(String string) {
        System.out.println(string);
    }
}
