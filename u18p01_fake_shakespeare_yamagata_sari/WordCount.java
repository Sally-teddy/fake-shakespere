import java.util.HashMap;

/**
 WordCount
 
 @author  (your name)
 @version (a version number or a date)
 */
public class WordCount {

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // Fields
  //

  private HashMap<String, Integer> counts;
  private int total;
  
  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // Constructors
  //

  /**
   No argument constructor for ClassTemplate
   */
  public WordCount() { 
    counts = new HashMap<String, Integer>();
  }
  
  //
  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''

  //'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  // Public Methods
  //

  public void add(String word){
      // if counts.get(word) is null then add the word to the
      // HashMap with Integer value 1
      // otherwise, get the Integer value associated with the word
      // and add 1 to it
      
      // counts.get(word) will return the Integer that tells
      // how many times you have added this word.
      if (counts.get(word) == null){
          counts.put(word, 1);
          // Integer.set(1);
      } else{
          counts.put(word, counts.get(word) + 1);
      }
      
      total += 1;
  }
  
  public HashMap getCounts(){
      return counts;
  }
  
  public int getTotal(){
      return total;
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
