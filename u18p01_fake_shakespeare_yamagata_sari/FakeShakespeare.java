import java.util.HashMap;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 FakeShakespeare
 
 @author  (your name)
 @version (a version number or a date)
 */
public class FakeShakespeare {

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // Fields
  //

  private String[] words;
  private HashMap<String, ArrayList<String>> analysis;
  
  private ArrayList<String> allWords;
  // make ArrayList<String> allWords that will hold ALL of the words

  
  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // Constructors
  //

  /**
   No argument constructor for ClassTemplate
   */
  public FakeShakespeare() { 
    allWords = new ArrayList<String>();
    analysis = new HashMap<String, ArrayList<String>>();
  }
  
  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // Public Methods
  //

  public void readShakespeare(){
    
    BufferedReader reader;
    int lineCount = 0;
    int wordCount = 0;
    int lineNumber = 0;
    
    try {
        reader = new BufferedReader(new FileReader("shakespeare.txt"));
        String line = reader.readLine();
        while (line != null) {
            //System.out.println(line);
            
            
            /* if (lineCount < 50){
                lineCount ++;
                System.out.println("words = " + words.length + " .. ");
            } */
            
            //this will split the line into words at whitespace and return
            //an array of String 
            String[] words = line.split("\\s+");
            wordCount += words.length;
            
            // add these words to the ArrayList allWords
            for (int i = 0; i < words.length; i++){
                allWords.add(words[i]);
            }
            
            // read next line
            line = reader.readLine();
        }
        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    System.out.println("allWords.size() = " + allWords.size());
  }
  
  public void buildingAnalysis(){
      for(int i = 0; i < allWords.size() - 1; i++)
      {
          // analysis is HashMap<String,ArrayList<String>>
          // HashMap<String, ArrayList<String>> analysis = new HashMap<String, ArrayList<String>>();
          
          if(analysis.get(allWords.get(i)) == null){
              ArrayList<String> list = new ArrayList<String>(); 
              list.add(allWords.get(i+1));
              analysis.put(allWords.get(i), list);
          } else {
              analysis.get(allWords.get(i)).add(allWords.get(i+1));
              // analysis.put(allWords.get(i+1), analysis.get(i));
          }
          // get the ArrayList associated with allWords.get(i)
          //   if the ArrayList is null that means haven't seen that word yet
          //     so then put(word, new ArrayList<String> that contains the next word)
          //   else
          //     add the next word (allWords.get(i+1)) to the ArrayList
          
          // in the analysis, the key is a word, and the value is an ArrayList<String>
          // that contains every word that follows the key
          
      }
  }
  
  public String generateRandomWord(String word){
      int index = (int)(Math.random() * analysis.get(word).size());
      ArrayList<String> list = new ArrayList<String>();
      list = analysis.get(word);
      String randomWord = list.get(index);
      
      return randomWord;
  }
  
  public String generateRandomPhrase(String word, int length){
      for (int i = 0; i < length; i++){
          System.out.print(generateRandomWord(word) + " ");
          if(i%9 == 0){
              System.out.println();
          }
      }
      
      return "";
  }
  
  
  
  /**
   Returns a string representation of the object. The default value of function
   is to override toString in the class java.lang.Object.
   
   @return a string representation of the object.
   */
  public String toString() {
    return super.toString();
  }

  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // Private Methods
  //

  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // public static void main(String[] args)
  //

  /**
   Method for testing this class. Default value of function creates an object 
   and prints a string representation of the object to System.out. Unlike most
   calls to main function, this does not accept an array of Strings as an argument.
   This allows quick execution in BlueJ.
   */
   
    //  public static void main() { // String[] args
    //    ClassTemplate m = new ClassTemplate(); // include necessary arguments
    //
    //    System.out.println(m.toString());
    //  }

  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  
}
