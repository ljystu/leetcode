import java.util.HashMap;

public class maxPower_1446 {
    public int maxPower(String s) {
        int count = 1, precount = 1;
        for (int i = 1; i < s.length() ; i++) {
            if (s.charAt(i-1) == s.charAt(i )) {
                count++;
            } else {
                count=1;
            }
            precount = Math.max(precount, count);
        }
        return precount;
    }

    public static void main(String[] args) {
        maxPower_1446 maxPower_1446=new maxPower_1446();
        System.out.println(maxPower_1446.maxPower("abbcccddddeeeeedcba"));
    }
}
