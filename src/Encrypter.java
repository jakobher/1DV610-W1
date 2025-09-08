package src;

public class Encrypter {
  private String text;

  public String encryptText(char oldChar, char newChar) {
    text = text.replace(oldChar, newChar);
    return text;
 }
}
