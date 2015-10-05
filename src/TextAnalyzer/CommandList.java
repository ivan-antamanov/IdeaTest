package TextAnalyzer;

/**
 * Created by iantaman on 26.09.2015.
 */
public enum CommandList{
    ENTER_TEXT("Enter the text"){

        public void string(String string){
            TextAnalyzerMethods.symbolanalyz(string);

        }

    },
    ENTER_FILE_PATH("Enter file path"){},
    NUMBER_OF_WORDS("Numbers of words"){},
    NUMBER_OF_SENTENCE("Numbers of sentence"){},
    VOWELS_AND_CONSONANTS("Numbers of vowels and consonants"){},
    TO_FIND_THE_WORD("To find the word"){},
    HELP("Help"){},
    EXIT("Exit"){};

    private String command;
    private String someText;

    private TextAnalyzerMethods textAnalyzerMethods = new TextAnalyzerMethods();

    CommandList(String command) {

       this.command = command;

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