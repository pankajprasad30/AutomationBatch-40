package java_Revision;

import java.util.HashMap;
import java.util.Map;

public class LeastFrequentAlphabet 
{
    public static void main(String[] args) 
    {
        String input = "example string";
        char leastFrequentChar = findLeastFrequentChar(input);
        System.out.println("The least frequent alphabet is: " + leastFrequentChar);
    }

    public static char findLeastFrequentChar(String str) 
    {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        // Count frequency of each character
        for (char c : str.toCharArray()) 
        {
            if (Character.isLetter(c)) 
            {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }
        }

        // Find the least frequent character
        char leastFrequentChar = '\0';
        int minFrequency = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) 
        {
            if (entry.getValue() < minFrequency) 
            {
                minFrequency = entry.getValue();
                leastFrequentChar = entry.getKey();
            }
        }

        return leastFrequentChar;
    }
}
