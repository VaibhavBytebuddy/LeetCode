
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         Map<String, List<String>> groups = new HashMap<>();
     for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String signature = new String(chars);
            groups.computeIfAbsent(signature, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(groups.values());
    }
     
}