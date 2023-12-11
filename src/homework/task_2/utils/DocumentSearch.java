package homework.task_2.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocumentSearch {
    public static void documentSearch (String input){
        String regexp = "([0-9]{4})-([0-9]{4})-([0-9]{2})";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            System.out.println("Document number: "+ matcher.group());
        }else {
            System.out.println("Document not found");
        }
    }
}
