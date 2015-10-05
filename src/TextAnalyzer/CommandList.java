package TextAnalyzer;

import java.io.*;
import java.util.EnumMap;
import java.util.Scanner;

/**
 * Created by iantaman on 26.09.2015.
 */
public enum CommandList{
    ENTER_TEXT("Enter the text"){
        @Override
        String toScanningCommand() {
            return super.toScanningCommand();
        }
    },
    ENTER_FILE_PATH("Enter file path"){
        @Override
        String toScanningCommand() {
            super.toScanningCommand();
            File file = new File(super.toScanningCommand());
            StringBuilder stringBuilder = new StringBuilder();
            try {
                String line;
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while ((line =bufferedReader.readLine()) !=null){
                    stringBuilder.append(line);
                    stringBuilder.append("\n");
                }

            } catch (FileNotFoundException e) {
                System.out.println("Non-correct file path");

            } catch (IOException e) {
                e.printStackTrace();
            }
            return stringBuilder.toString();
        }
    },
    NUMBER_OF_WORDS("Numbers of words"){},
    NUMBER_OF_SENTENCE("Numbers of sentence"){},
    VOWELS_AND_CONSONANTS("Numbers of vowels and consonants"){
        public void string(String string){
            TextAnalyzerMethods.symbolanalyz(string);

        }
    },
    TO_FIND_THE_WORD("To find the word"){},
    HELP("Help"){},
    EXIT("Exit"){};

    private String command;
    private String someText;
    private Scanner scanner = new Scanner(System.in);
    private TextAnalyzerMethods textAnalyzerMethods = new TextAnalyzerMethods();

    CommandList(String command) {

       this.command = command;

    }

    String toScanningCommand(){
        return scanner.nextLine();
    }





}




/*public class CommandList {
    private static HashMap<Integer, String> commandMap = new HashMap<Integer, String>();
    private static String[] arrayCommand ={
            "The Number of symbols;",
            "The Number of sentences;",
            "The Number of vowels and consonants;",
            "Word repeater","How many sentence",
            "Exit"};
    private static CommandList commandList = new CommandList();

    private CommandList() {
        for (int i = 0; i < arrayCommand.length; i++) {
            commandMap.put(i + 1, arrayCommand[i]);
        }
    }

    @Override
    public String toString() {
        return ""+commandMap;
    }

    public static CommandList getCommandList(){
        return commandList;
    }

}
*/