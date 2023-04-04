package practice;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {


    private static EmailList treeSet = new EmailList();
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        boolean good = true;

        while (good) {
            input = scanner.nextLine();
            switch (input) {
                case ("ADD") -> {
                    System.out.println("Введите email");
                    input = scanner.nextLine();
                    if(treeSet.add(input)) {
                        System.out.println("Добавлено дело " + input);
                    }
                    else{
                        System.out.println(WRONG_EMAIL_ANSWER);
                    }
                    }
                    case("LIST") ->{
                        System.out.println("Список email: "+ treeSet.getSortedEmails());
                    }
                }
            }
            }
            }



