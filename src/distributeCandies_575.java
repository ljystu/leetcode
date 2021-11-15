import java.util.HashSet;

public class distributeCandies_575 {
    /**
     * 575
     *
     * @param candyType
     * @return
     */
    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> candies = new HashSet<>();
        for (int i = 0; i < candyType.length; i++)
            candies.add(candyType[i]);
        return Math.min(candies.size(), candyType.length / 2);

    }
}
