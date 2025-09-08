package src;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        final FileHandler fileHandler = new FileHandler();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in vad du vill kryptera: ");
        String inputText = scanner.nextLine();

        Encrypter encrypter = new Encrypter();
        String encryptedText = encrypter.encryptText('j', 'k', inputText);
        System.out.println(
                "Här är din originala text: " + inputText + " och här är din krypterade text: " + encryptedText);
        scanner.close();
        fileHandler.writeFile(encryptedText);
    }
}