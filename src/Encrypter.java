package src;

public class Encrypter {
  private String text;

  public String encryptText(char oldChar, char newChar, String wholeWord) {
    text = wholeWord;
    text = text.replace(oldChar, newChar);
    return text;
  }
}
