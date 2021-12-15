public class getHint_299 {
    public String getHint(String secret, String guess) {
//        if (secret.length() != guess.length())
//            return "0A0B";
//        HashMap<Character, Integer> secretTable = new HashMap<>();
//        for (int i = 0; i < secret.length(); i++) {
//            if (secretTable.containsKey(secret.charAt(i)))
//                secretTable.put(secret.charAt(i), secretTable.get(secret.charAt(i)) + 1);
//            else secretTable.put(secret.charAt(i), 1);
//        }
//        int sum = 0, cows = 0;
//        for (int i = 0; i < guess.length(); i++) {
//            if (secretTable.containsKey(guess.charAt(i)) && secretTable.get(guess.charAt(i)) != 0) {
//                sum++;
//                secretTable.put(guess.charAt(i), secretTable.get(guess.charAt(i)) - 1);
//            }
//            if (guess.charAt(i) == secret.charAt(i))
//                cows++;
//        }
//        return cows + "A" + (sum - cows) + "B";
        int bulls = 0;
        int cows = 0;
        int[] numbers = new int[10];
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                if (numbers[secret.charAt(i) - '0']++ < 0) {
                    cows++;
                }
                if (numbers[guess.charAt(i) - '0']-- > 0) {
                    cows++;
                }
            }
        }
        //Stringbuilder性能更好？
//        StringBuilder builder = new StringBuilder();
//        builder.append(bulls).append('A').append((cows - bulls)).append('B');
//        return builder.toString();
        return bulls + "A" + cows + "B";
    }
}
