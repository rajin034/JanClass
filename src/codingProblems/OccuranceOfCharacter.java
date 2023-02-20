package codingProblems;

import java.util.HashMap;

public class OccuranceOfCharacter
{
    public void countOccurance(String inputString)
    {
/*        // HashMap char as a key and occurrence as a value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

        // Convert String to Char Array
        char[] charArray = inputString.toCharArray();

        for(char ch : charArray)
        {
            // If char is already present in Map increment count by one
            if(charCountMap.containsKey(ch))
            {
                charCountMap.put(ch, charCountMap.get(ch)+1);
            }
           
            // If char is not present set key value to 1
            else
            {
                charCountMap.put(ch, 1);
            }
        }
		
        // Print CharCount Map
        System.out.println(charCountMap.entrySet());*/

    }

    public static void main(String args[])
    {
        OccuranceOfCharacter ooc = new OccuranceOfCharacter();
        ooc.countOccurance("abbcccdddd");
    }
}