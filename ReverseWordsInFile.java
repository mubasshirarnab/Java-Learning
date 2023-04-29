package File;

import java.io.*;

public class ReverseWordsInFile {

    public static void main(String[] args) {
        File inputFile = new File("E:\\Java-Learning\\Final\\src\\File\\input.txt");
        File outputFile = new File("E:\\Java-Learning\\Final\\src\\File\\output.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");
                for (int i = words.length - 1; i >= 0; i--) {
                    writer.write(words[i] + " ");
                }
                writer.newLine();
            }

            reader.close();
            writer.close();

        }
        catch (IOException E) {
            System.out.println("File not found");
        }
    }
}
