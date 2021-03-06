
/**
 * Write a description of Part3 here.
 * This assignment will give you additional practice using String methods. You will write two 
 * methods to solve some problems using strings and a third method to test these two methods.

Specifically, you should do the following:

1. Create a new Java Class named Part3 in the StringsFirstAssignments project. Put the following
methods in this class.

2. Write the method named twoOccurrences that has two String parameters named stringa and 
stringb. This method returns true if stringa appears at least twice in stringb, otherwise it 
returns false. For example, the call twoOccurrences(“by”, “A story by Abby Long”) returns true 
as there are two occurrences of “by”, the call twoOccurrences(“a”, “banana”) returns true as 
there are three occurrences of “a” so “a” occurs at least twice, and the call 
twoOccurrences(“atg”, “ctgtatgta”) returns false as there is only one occurence of “atg”.

3. Write the void method named testing that has no parameters. This method should call 
twoOccurrences on several pairs of strings and print the strings and the result of calling 
twoOccurrences (true or false) for each pair. Be sure to test examples that should result in 
true and examples that should result in false.

4. Write the method named lastPart that has two String parameters named stringa and stringb. 
This method finds the first occurrence of stringa in stringb, and returns the part of stringb 
that follows stringa. If stringa does not occur in stringb, then return stringb. For example, 
the call lastPart(“an”, “banana”) returns the string “ana”, the part of the string after the 
first “an”. The call lastPart(“zoo”, “forest”) returns the string “forest” since “zoo” does not
appear in that word.

5. Add code to the method testing to call the method lastPart with several pairs of strings. 
For each call print the strings passed in and the result. For example, the output for the two 
calls above might be:

The part of the string after an in banana is ana.
The part of the string after zoo in forest is forest.

 * @author (Theary Im) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.io.File;

public class Part3 {
    public boolean twoOccurences(String stringa, String stringb){
        int subStringIndex = stringb.indexOf(stringa);
        int count = 0;
        while(subStringIndex >= 0) {
            count++;
            subStringIndex = stringb.indexOf(stringa, subStringIndex + 1); 
        }        
        return count >= 2;
    }
    
    public String lastPart(String stringa, String stringb){
        int subStringIndex = stringb.indexOf(stringa);
        String remainderString = stringb;
        if(subStringIndex >= 0){
            remainderString = stringb.substring(subStringIndex + stringa.length());
        }
        return remainderString;
    }
    
    public void testTwoOccurences(){
        String stringa = "by";
        String stringb = "A story by Abby Long";
        System.out.println("find '" + stringa + "' in '" + stringb + "'");
        boolean hasTwoOccurences = twoOccurences(stringa, stringb);
        System.out.println(hasTwoOccurences);
        
        stringa = "story";
        stringb = "A story by Abby Long";
        System.out.println("find '" + stringa + "' in '" + stringb + "'");
        hasTwoOccurences = twoOccurences(stringa, stringb);
        System.out.println(hasTwoOccurences);
        
        stringa = "fun";
        stringb = "A story by Abby Long";
        System.out.println("find '" + stringa + "' in '" + stringb + "'");
        hasTwoOccurences = twoOccurences(stringa, stringb);
        System.out.println(hasTwoOccurences);
    }
    
    public void testLastPart() {
        String stringa = "an";
        String stringb = "banana";
        System.out.println("Initial full string " + stringb);
        System.out.println("stringa is " + stringa);
        String remainderString = lastPart(stringa, stringb);
        System.out.println("Remainder String " + remainderString);
        
        stringa = "zoo";
        stringb = "forest";
        System.out.println("Initial full string " + stringb);
        System.out.println("stringa is " + stringa);
        remainderString = lastPart(stringa, stringb);
        System.out.println("Remainder String " + remainderString);
        
        stringa = "an";
        stringb = "A banana grows on a tree";
        System.out.println("Initial full string " + stringb);
        System.out.println("stringa is " + stringa);
        remainderString = lastPart(stringa, stringb);
        System.out.println("Remainder String " + remainderString);
    }
}
