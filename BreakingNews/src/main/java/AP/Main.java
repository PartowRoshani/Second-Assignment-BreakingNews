package AP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Infrastructure newsApp = new Infrastructure("980c8f4f4a934c799e5ebde0732d1cf3");
        newsApp.displayNewsList();
        scanner.close();
    }
}