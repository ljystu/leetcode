class ShortestCompletingWord_748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] list = new int[26];
        int[] temp = new int[26];
        int count = 0;
        int countsup = 0;
        for (int i = 0; i < licensePlate.length(); i++) {
            if (licensePlate.charAt(i) >= 'a' && licensePlate.charAt(i) <= 'z') {
                list[licensePlate.charAt(i) - 'a']++;
                temp[licensePlate.charAt(i) - 'a']++;
                count++;
            }
            if (licensePlate.charAt(i) >= 'A' && licensePlate.charAt(i) <= 'Z') {
                list[licensePlate.charAt(i) - 'A']++;
                temp[licensePlate.charAt(i) - 'A']++;
                count++;
            }
        }
        int pos = -1;
        for (int i = 0; i < words.length; i++) {
            countsup = count;
            for (int j = 0; j < words[i].length(); j++) {
                if (temp[words[i].charAt(j) - 'a'] != 0) {
                    temp[words[i].charAt(j) - 'a']--;
                    countsup--;
                }
                if (countsup == 0) {
                    if (pos == -1) {
                        pos = i;
                    } else {
                        if (words[pos].length() > words[i].length()) {
                            pos = i;
                        }
                    }
                }
            }
            for (int k = 0; k < 26; k++) {
                temp[k] = list[k];
            }
        }
        if (pos == -1) {
            return null;
        } else {
            return words[pos];
        }

    }

    public static void main(String[] args) {
        ShortestCompletingWord_748 shortestCompletingWord_748 = new ShortestCompletingWord_748();
        shortestCompletingWord_748.shortestCompletingWord("1s3 PSt", new String[]{"step", "steps", "stripe", "stepple"});

    }
}