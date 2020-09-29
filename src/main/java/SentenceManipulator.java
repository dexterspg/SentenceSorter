import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceManipulator {

    public static String regex = "(?<=[\\.\\?]\"?)\\s+(?![a-z])";

     public static String splitFileIntoSentencePerLine(String content){

        //remove characters that are not needed i.e. -,(, ) and "
        content = content.trim().replaceAll("[-\\(\\)\"]+","");

        String [] line = content.split(regex);
        return joiningArrayStrings(line);

    }

    public static String sortSentenceAlphabeticalOrder(String content){ //lexicographically

        String [] line = content.trim().split(regex);

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < line.length  ; firstUnsortedIndex++){
            String newElement = line[firstUnsortedIndex];
            int i;

            for( i = firstUnsortedIndex; i > 0 && line[i-1].compareTo(newElement) > 0 ; i--){
                line[i] = line[i-1];
            }

            line[i] = newElement;
        }

        return joiningArrayStrings(line);

    }

    private static String joiningArrayStrings(String [] line){

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < line.length ; i++){
            sb.append(line[i]);
            sb.append("\n");
        }

        return sb.toString();
    }



}
