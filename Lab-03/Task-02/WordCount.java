import java.io.*;
import java.util.*;
public class WordCount {
    public static void main(String[] args) throws IOException {
    int wordCount = 0;
    FileInputStream file = new FileInputStream("Sameer.txt");
    Scanner input = new Scanner(file);
    while (input.hasNextLine() != false) {
        String line = input.next();
        wordCount++;

       }
       input.close();
       System.out.println(wordCount);
       
    
        
    }
}