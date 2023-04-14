
import java.util.HashMap;
import java.util.Map;
public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){
        // Create a new map to hold the word count
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Split the input string into an array of words
        String[] wordsArray = words.split(" ");

        // Iterate through each word in the array
        for (String word : wordsArray) {
            // If the word is not yet in the map, add it with a count of 1
            if (!wordCountMap.containsKey(word)) {
                wordCountMap.put(word, 1);
            }
            // If the word is already in the map, increment its count by 1
            else {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            }
        }

        // Return the map with the word count
        return wordCountMap;
    }
}
