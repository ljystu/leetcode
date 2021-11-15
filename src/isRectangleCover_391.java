import java.util.HashSet;

public class isRectangleCover_391 {
    public boolean isRectangleCover(int[][] rectangles) {
        HashSet<String> points = new HashSet<>();
        int[] botLeft = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        int[] topRight = new int[]{-1000000, -1000000};
        int square = 0;
        for (int i = 0; i < rectangles.length; i++) {
            botLeft[0] = Math.min(botLeft[0], rectangles[i][0]);
            botLeft[1] = Math.min(botLeft[1], rectangles[i][1]);
            topRight[0] = Math.max(topRight[0], rectangles[i][2]);
            topRight[1] = Math.max(topRight[1], rectangles[i][3]);
            if (points.contains(rectangles[i][0] + "" + rectangles[i][1]))
                points.remove(rectangles[i][0] + "" + rectangles[i][1]);
            else
                points.add(rectangles[i][0] + "" + rectangles[i][1]);
            if (points.contains(rectangles[i][2] + "" + rectangles[i][3]))
                points.remove(rectangles[i][2] + "" + rectangles[i][3]);
            else
                points.add(rectangles[i][2] + "" + rectangles[i][3]);

            if (points.contains(rectangles[i][0] + "" + rectangles[i][3]))
                points.remove(rectangles[i][0] + "" + rectangles[i][3]);
            else
                points.add(rectangles[i][0] + "" + rectangles[i][3]);
            if (points.contains(rectangles[i][2] + "" + rectangles[i][1]))
                points.remove(rectangles[i][2] + "" + rectangles[i][1]);
            else
                points.add(rectangles[i][2] + "" + rectangles[i][1]);

            square += ((rectangles[i][2] - rectangles[i][0]) * (rectangles[i][3] - rectangles[i][1]));
        }


        return (points.size() == 4 && points.contains(botLeft[0] + "" + botLeft[1]) && points.contains(topRight[0] + "" + botLeft[1]) && points.contains(botLeft[0] + "" + topRight[1]) && points.contains(topRight[0] + "" + topRight[1])
                && square == (topRight[0] - botLeft[0]) * (topRight[1] - botLeft[1]));
    }

    public static void main(String[] args) {
        isRectangleCover_391 isRectangleCover_391 = new isRectangleCover_391();
        System.out.println(isRectangleCover_391.isRectangleCover(new int[][]{{1, 1, 3, 3}, {3, 1, 4, 2}, {3, 2, 4, 4}, {1, 3, 2, 4}, {2, 3, 3, 4}}));
    }
}
