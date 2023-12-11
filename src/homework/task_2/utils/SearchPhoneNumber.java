package homework.task_2.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchPhoneNumber {
    public static void searchPhoneNumber (String input){
        String regexp = "\\+\\(([0-9]{2})\\)([0-9]{7})";
        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            System.out.println("Phone number: "+ matcher.group());
        }else {
            System.out.println("Phone number not found");
        }
    }
}
