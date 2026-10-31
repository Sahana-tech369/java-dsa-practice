public class AnagramFrequency {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagram");
            return;
        }

        int[] freq = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        boolean anagram = true;

        for (int count : freq) {
            if (count != 0) {
                anagram = false;
                break;
            }
        }

        System.out.println(anagram ? "Anagram" : "Not Anagram");
    }
}