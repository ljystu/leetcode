import java.util.Arrays;
import java.util.HashSet;

public class maxProduct_318 {
    public int maxProduct(String[] words) {
        //判断字母基本常用 常见


        int max = 0;
        int matrix[] = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                matrix[i] |= 1 << words[i].charAt(j) - 'a';   //位移用于2进制代表数字
            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((matrix[i] & matrix[j]) == 0) {       //利用与判断字母序列是否符合要求
                    //5转换为二进制：0000 0000 0000 0000 0000 0000 0000 0101
                    //
                    //3转换为二进制：0000 0000 0000 0000 0000 0000 0000 0011
                    //
                    //-------------------------------------------------------------------------------------
                    //
                    //1转换为二进制：0000 0000 0000 0000 0000 0000 0000 0001
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        maxProduct_318 maxProduct_318 = new maxProduct_318();
        maxProduct_318.maxProduct(new String[]{"abcw", "baz", "foo", "bar", "xtfn", "abcdef"});
    }
}
