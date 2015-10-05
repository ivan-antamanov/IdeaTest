package TextAnalyzer;

import java.util.EnumMap;

/**
 * Created by iantaman on 05.10.2015.
 */
public class EnumComListMap {



    public static void main(String[] args) {
        EnumMap<CommandList, String> stringEnumMap = new EnumMap<>(CommandList.class);
        int i =0;
        for(CommandList p: CommandList.values()){

            String str ="enum ";

            i++;
            str = str+i;
            stringEnumMap.put(p,str);

            System.out.println(stringEnumMap);
        }
    }


}
