package homework.task_1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Вывести в консоль из строки которую пользователь вводит с клавиатуры все
 * аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
 * только из прописных букв, без чисел.
 */

public class Run {
    public static void main(String[] args) {
        String regexp = "([A-Z]{2,6})|([A-Z.]{2,6})";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter abbreviation");
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regexp);
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()){
            System.out.println("Abbreviation found: "+ matcher.group());
        }else {
            System.out.println("Abbreviation not found");
        }
    }
}
