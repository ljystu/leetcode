public class originalDigits_423 {
    public String originalDigits(String s) {
        int[] letters = new int[26];
        int[] nums = new int[10];
        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
        }
        nums[0] = letters['z' - 'a'];
        nums[2] = letters['w' - 'a'];
        nums[8] = letters['g' - 'a'];
        nums[6] = letters['x' - 'a'];
        nums[3] = letters['t' - 'a'] - nums[8] - nums[2];
        nums[7] = letters['s' - 'a'] - nums[6];
        nums[5] = letters['v' - 'a'] - nums[7];
        nums[4] = letters['f' - 'a'] - nums[5];
        nums[9] = letters['i' - 'a'] - nums[6] - nums[5] - nums[8];
        nums[1] = letters['o' - 'a'] - nums[0] - nums[2] - nums[4];
        String str = "";
        for (int i = 0; i < 10; i++) {

            if (nums[i] > 0) {
                for (int j = 0; j < nums[i]; j++) {
                    str += i;
                }
            }
        }
        return str;
    }

}
