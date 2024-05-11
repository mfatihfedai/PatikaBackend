import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a sentence : ");           //User enter a sentence.
        String sentence = input.nextLine();

        String[] list = sentence.split(" ");                //The sentence is split from space " " and added an array.
        Map<String, Integer> words = new HashMap<>();

        for (String word : list){                                           //The array is added hashmap
            words.put(word, words.getOrDefault(word, 0) + 1);       //If there is the word in the hashmap keys, hashmap values will add previous value plus one with getOrDefault method.

        }

        Map.Entry<String, Integer> maxValue = null;
        for (Map.Entry<String, Integer> value : words.entrySet()) {                 //Calculate the most usage word.
            if (maxValue == null || (value.getValue() > maxValue.getValue())){
                maxValue = value;
            }
        }
        System.out.println("Total words : " + words);
        System.out.println("--------------------------");
        System.out.println("The most usage words : " + maxValue.getKey());         //Show the max word.
    }
}