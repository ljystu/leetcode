import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class buddyString_859 {

    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int[] list = new int[26];
        int count = 0;
        int pos1 = -1, pos2 = -1;
        if (s.equals(goal)) {
            for (int i = 0; i < s.length(); i++) {
                list[s.charAt(i) - 'a']++;
                if (list[s.charAt(i) - 'a'] > 1) {
                    return true;
                }
            }
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                list[s.charAt(i) - 'a']++;
                if (s.charAt(i) != goal.charAt(i)) {
                    if (pos1 == -1) {
                        pos1 = i;
                    } else {
                        pos2 = i;
                    }
                    if (++count > 2) {
                        return false;
                    }
                }
            }
            return (s.charAt(pos1) == goal.charAt(pos2) && s.charAt(pos2) == goal.charAt(pos1));

        }

    }

    public static void main(String[] args) {
        buddyString_859 buddyString = new buddyString_859();
        System.out.println(buddyString.buddyStrings("abcdeee", "abdfcee"));
    }
}
