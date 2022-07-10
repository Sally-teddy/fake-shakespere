
//
// advanced placement computer science
//

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
  u18p01_fake_shakespeare_yamagata_sari is the root class of a solution to a programming problem. this class should
  contain only calls to System.out and methods of other classes. it should not contain
  a significant amount of other coding.
 
  @author  (your name)
  @version February 19, 2022, 10:24:20 AM
*/
public class u18p01_fake_shakespeare_yamagata_sari {  
  public static void main() { // main(String[] args)
    String description = "\n" + "u18p01_fake_shakespeare_yamagata_sari" + "\n";
    System.out.println(description);
      
    FakeShakespeare fs = new FakeShakespeare();
    fs.readShakespeare();
    
    
    // HashMap<String, ArrayList<String>> analysis = new HashMap<String, ArrayList<String>>();
    // analysis.put("hello", new ArrayList<String>());
    
    fs.buildingAnalysis();
    
    System.out.println(fs.generateRandomWord("hungry"));
    System.out.print(fs.generateRandomPhrase("hungry",50));
    
    
    // System.exit(0); // seems to disrupt execution on a Macintosh
  }
  
  
  
}
