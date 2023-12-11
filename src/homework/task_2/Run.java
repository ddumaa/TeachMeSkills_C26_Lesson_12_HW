package homework.task_2;

import homework.task_2.utils.DocumentSearch;
import homework.task_2.utils.SearchEmail;
import homework.task_2.utils.SearchPhoneNumber;

/**
 * Программа на вход получает произвольный текст. В этом тексте может быть номер
 * документа(один или несколько), емейл и номер телефона. Номер документа в формате:
 * xxxx-xxxx-xx, где x - это любая цифра; номер телефона в формате: +(xx)xxxxxxx. Документ
 * может содержать не всю информацию, т.е. например, может не содержать номер
 * телефона, или другое. Необходимо найти эту информацию и вывести в консоль
 */

public class Run {
    public static void main(String[] args) {
        String input = "The program receives arbitrary text as input. This text may contain a number\n" +
                "document (one or more), email and phone number. Document number in format:\n" +
                "1423-1512-51, where x is any number; telephone number in the format: +(23)1234567. Document\n" +
                "may contain email teachmeskills@gmail.com";
        DocumentSearch.documentSearch(input);
        SearchPhoneNumber.searchPhoneNumber(input);
        SearchEmail.searchEmail(input);
    }
}
