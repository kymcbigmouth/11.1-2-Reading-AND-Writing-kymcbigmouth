import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws FileNotFoundException {
    File inFile = new File("beemovie.txt");
    Scanner input = new Scanner(inFile);
    PrintWriter copyOfBeeMovie=new PrintWriter("bOutput.txt");
    int lineCount = 0;
    int charCount=0;
    int wordCount=0;
    Scanner wordScanner=new Scanner (inFile);
    do {

      String linea = input.nextLine();
      lineCount++;
    } while (input.hasNextLine());

    do{
     String wordCountString=wordScanner.next();
      charCount=charCount+wordCountString.length();
      wordCount++;
    }while(wordScanner.hasNext());
    copyOfBeeMovie.println(charCount);
    copyOfBeeMovie.println(lineCount);
    copyOfBeeMovie.println(wordCount);
    System.out.println("Character count is "+charCount);
    System.out.println("Line count is "+lineCount);
    System.out.println("Word count is "+wordCount);
    input.close();
    copyOfBeeMovie.close();
    wordScanner.close();
  }
}