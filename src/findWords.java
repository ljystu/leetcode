import java.util.*;

public class findWords {
    /**
     * findWords
     */
    static String line1 = "qwertyuiopQWERTYUIOP";
    static String line2 = "asdfghjklASDFGHJKL";
    static String line3 = "zxcvbnmZXCVBNM";
    static Map<Character, Integer> map;

    static {
        map = new HashMap<>();
        for (char c : line1.toCharArray()) {
            map.put(c, 1);
        }
        for (char c : line2.toCharArray()) {
            map.put(c, 2);
        }
        for (char c : line3.toCharArray()) {
            map.put(c, 3);
        }
    }

    public static String[] findWords(String[] words) {
        List<String> ans = new ArrayList<>();
        w:
        for (String str : words) {
            int index = map.get(str.charAt(0));
            for (char c : str.toCharArray()) {
                if (map.get(c) != index) {
                    continue w;
                }
            }
            ans.add(str);
        }
        return ans.toArray(new String[]{});
    }
}
