public class findPoisonedDuration_495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int time=0;
        for (int i = 0; i < timeSeries.length-1; i++) {
            time += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }

        return time+duration;
    }
}
