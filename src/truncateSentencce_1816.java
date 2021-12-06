public class truncateSentencce_1816 {
    public String truncateSentence(String s, int k) {
//        String[] split = s.split(" ");
//        String str = "";
//        for (int i = 0; i < k; i++) {
//            str += split[i];
//            if (i == k - 1)
//                return str;
//            str += " ";
//        }
//        return str;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ' ' && --k == 0)
                return s.substring(0, i);
        return s;
    }
}
