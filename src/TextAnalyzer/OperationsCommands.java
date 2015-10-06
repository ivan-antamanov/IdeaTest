package TextAnalyzer;

import TextAnalyzer.Enum.CommandList;
import TextAnalyzer.Enum.EnumComListMap;

import java.io.*;
import java.util.Scanner;

/**
 * Created by iantaman on 26.09.2015.
 */
public class OperationsCommands {


    private TextAnalyzerMethods textAnalyzerMethods;
    private String string;
    private Scanner scanner;


    public OperationsCommands(TextAnalyzerMethods textAnalyzerMethods) {
        this.textAnalyzerMethods = textAnalyzerMethods;
        scanner= new Scanner(System.in);
        scanningProcessChoosen();
    }

    private void fileChose(String filePath){
        File file = new File(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((string =bufferedReader.readLine()) !=null){
                stringBuilder.append(string);
                stringBuilder.append("\n");
            }

            string =stringBuilder.toString();
            System.out.print(string);
            process(scanner.nextLine());
        } catch (FileNotFoundException e) {
            print("Non-correct file path");
            fileChose(scanner.nextLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void scanningProcessChoosen(){
        System.out.println(CommandList.ENTER_TEXT.getCommand()+"\n"+CommandList.ENTER_FILE_PATH.getCommand() );
        try {String command = scanner.nextLine();
            switch (command){
                case "ett":
                    print("Enter the text");
                    toScanningCommand();
                    print("Enter the command");
                    process(scanner.nextLine());break;
                case "efp":
                    print("Enter the file path");
                    fileChose(scanner.nextLine());break;
                default: throw new NumberFormatException();
            }
        }catch (NumberFormatException e) {
           System.out.println("Error!");
            scanningProcessChoosen();
        }

    }

    private void toScanningCommand(){
        string = scanner.nextLine();
    }

     void process(String process){
            switch (process){
                    case "now":
                    case "Numbers of words":
                        textAnalyzerMethods.numbersOfWords(string);break;
                    case "nos": textAnalyzerMethods.numberOfSentence(string);break;
                    case "nvc": textAnalyzerMethods.consAndWow(string); break;
                    case "ftw":
                        print("Write the word which u wanna find");
                        String find =scanner.nextLine();
                        textAnalyzerMethods.findWord(string, find); break;
                    case "help": break;
                    case "exit": System.exit(0); break;
                default:
                    print("Error! You have to enter digit such as those"+ EnumComListMap.getStringEnumMap());
                }
            process(scanner.nextLine());
     }

    public void help() { //going to write
        print("Enter file path like: C:\\Users\\iantaman\\Desktop\\new 1.txt");
    }

    public void print(String string){
         System.out.println(string);
     }
}
