import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
//import edu.princeton.cs.algs4.*;
/**
 * Created by Charlie Davidson on 1/23/17.
 */

public class HW1 {
/**
 * - count how many passenger names are in the file
 * - find the longest passenger name in the file
 * - find whether there were any passengers named “Jones” on the Titanic
 * - write out, to the screen (console), all of the above information
 */
   public static void main(String[] args) throws IOException {
       String name;
       int maxLength = 0;
       String longestString = "";
       int jones = 0;
       Scanner inFile = new Scanner(new File("TitanicNames.txt")).useDelimiter(",\\s*");
       ArrayList<String> tList = new ArrayList<String>();

       while(inFile.hasNext()){
           name = inFile.nextLine();
           tList.add(name);

           for (String longName : tList) {
               longName = name;
               if (name.length() > maxLength) {
                   maxLength = name.length();
                   longestString = longName;
               }
           }
           if (name.contains("Jones"))
           {
               jones++;
           }
       }
       inFile.close();

       int nameCount = tList.size();
       System.out.println("Passengers on Titanic: " + nameCount);
       System.out.println("Longest passenger name on Titanic: " + longestString);
       System.out.println("Are any passengers named Jones on board?");
       if (jones > 0)
           System.out.println("Yes, there is " + jones + " passenger(s) with that name.");
   }
}

