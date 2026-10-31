import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            char[] chars = word.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        System.out.println(map.values());
    }
}
