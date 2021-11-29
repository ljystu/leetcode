import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAnagrams_438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        char[] ssort=new char[p.length()];
        char[] psort = new char[p.length()];
        int len = p.length();
        if (s.length() < p.length())
            return list;
        for (int i = 0; i < len; i++)
            psort[i] = p.charAt(i);
        Arrays.sort(psort);
        for (int i = 0; i <= s.length() - len; i++) {
            ssort=s.substring(i, i + len).toCharArray();
            if(Arrays.equals(ssort, psort))
                list.add(i);
        }
        return list;
    }
}
