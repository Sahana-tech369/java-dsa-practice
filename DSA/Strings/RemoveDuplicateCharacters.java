import java.util.*;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {

        String str = "programming";

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!set.contains(ch)) {
                set.add(ch);
                System.out.print(ch);
            }
        }
    }
}
