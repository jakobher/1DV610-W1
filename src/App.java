package src;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in vad du vill kryptera: ");
        String encryptedText = scanner.nextLine();

        Encrypter encrypter = new Encrypter();
        String encryptedText = encrypter.encryptText('j', 'k');
        System.out.println("Här är din krypterade text: " + encryptedText);
        scanner.close();
    }

}
