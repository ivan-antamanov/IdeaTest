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

    private Text userInput;
    private Scanner scanner;


    public ConsoleCommands() {
        scanner = new Scanner(System.in);
        userInput = new Text();
        scanningProcessChoosen();
    }

    private void scanningProcessChoosen() {
        print("Enter the command for analyze text or text-file. (help)");
        try {
            switch (CommandList.getStringEnumMap().get(scanner.nextLine())) {
                case TEXT_MODEL:
                    print("Enter the text");
                    toScanningCommand();
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
                    throw new NumberFormatException();
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
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(file);
            while (bufferedReader.readLine() != null) {
                stringBuilder.append(bufferedReader.readLine());
                stringBuilder.append("\n");
            }
            bufferedReader.close();
            userInput.setInputText(stringBuilder.toString());
            System.out.print(userInput);
            print("Successful scan");
            print("Enter the command");
            process(scanner.nextLine());
        } catch (FileNotFoundException e) {
            print("Non-correct file path");
            fileChose(scanner.nextLine());
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void process(String command) {
        print("Enter command:");
        if (CommandList.getStringEnumMap().containsKey(command)) {
            switch (CommandList.getStringEnumMap().get(command)) {
                case NUMBER_OF_WORDS:
                    TextAnalyzerUtils.numbersOfWords(userInput.getInputText());
                    break;
                case NUMBER_OF_SENTENCE:
                    TextAnalyzerUtils.numberOfSentence(userInput.getInputText());
                    break;
                case VOWELS_AND_CONSONANTS:
                    TextAnalyzerUtils.consAndWow(userInput.getInputText());
                    break;
                case TO_FIND_THE_WORD:
                    print("Write the word which u wanna find");
                    String find = scanner.nextLine();
                    TextAnalyzerUtils.findWord(userInput.getInputText(), find);
                    break;
                case HELP:
                    help();
                    break;
                case EXIT:
                    System.exit(0);
                    break;
                default:
                    print("Error! You have to enter digit such as those" + CommandList.getStringEnumMap());
            }
        }
        process(scanner.nextLine());

    }

    private void toScanningCommand() {
        userInput.setInputText(scanner.nextLine());
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
