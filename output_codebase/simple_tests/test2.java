import java.util.ArrayList;
import java.util.List;

public class findAllAnagram {

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0)
            return list;
        // character hash
        int[] hash = new int[256];
        // record each character in p to hash
        for (char c : p.toCharArray()) {
            hash[c]++;
        }
        // two points, initialize count to p's length
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            // current hash value >= 1 means the character is existing in p
            if (hash[s.charAt(right)] >= 1) {
                count--;
            }
            hash[s.charAt(right)]--;
            right++;
            // then add window's left to result list
            if (count == 0) {
                list.add(left);
            }
            // the count >= 0 indicate it was original in the hash, cuz it won't go below 0
            if (right - left == p.length()) {
                if (hash[s.charAt(left)] >= 0) {
                    count++;
                }
                hash[s.charAt(left)]++;
                left++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
    }
}
