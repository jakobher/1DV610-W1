package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * a
 * Handles saving solar system data to files.
 */
public class FileHandler {
  private final String filePath = "encrypted.data";
  private final File file;

  public FileHandler() {
    this.file = new File(filePath);
  }

  public String readFile() {
    StringBuilder content = new StringBuilder();

    if (!file.exists()) {
      try {
        file.createNewFile();
        return "";
      } catch (IOException e) {
        System.err.println("Error creating a new file: " + e.getMessage());
        return "";
      }
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
      String line;
      while ((line = reader.readLine()) != null) {
        content.append(line).append("\n");
      }
      return content.toString();
    } catch (IOException e) {
      System.err.println("Error in parsing the file content: " + e.getMessage());
      return "";
    }
  }

  /**
   * Writes the specified content to a file.
   *
   * @param fileContent the content to be written to the file
   */
  public void writeFile(String fileContent) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
      writer.write(fileContent);
    } catch (IOException e) {
      System.err.println("Error writing to file: " + e.getMessage());
    }
  }
}
