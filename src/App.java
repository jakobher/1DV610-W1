package src;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in vad du vill kryptera: ");
        String encryptedText = scanner.nextLine();
        System.out.println("Här är din krypterade text: " + encryptedText);
        scanner.close();
    }

}
