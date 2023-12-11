package homework.task_2.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEmail {
    public static void searchEmail (String input){
        String regexp = "([a-zA-Z0-9._%+-])+@([a-zA-Z0-9.-])+\\.([a-zA-Z]{2,6})";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            System.out.println("Email: "+ matcher.group());
        }else {
            System.out.println("Email not found");
        }
    }
}
