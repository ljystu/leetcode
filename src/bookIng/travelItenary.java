package bookIng;

import java.util.*;

public class travelItenary {
    static List<List<String>> result = new LinkedList<>();
    static LinkedList<String> itenary = new LinkedList<>();

    public static void main(String[] args) {
        Map<String, Map<String, int[]>> airPlanes = new HashMap<>();
        airPlanes.put("Amsterdam", new HashMap<>());
        airPlanes.get("Amsterdam").put("Paris", new int[]{10, 300});
        airPlanes.put("London", new HashMap<>());
        airPlanes.get("London").put("Paris", new int[]{15, 410});
        airPlanes.get("London").put("Amsterdam", new int[]{17, 400});
        airPlanes.put("Paris", new HashMap<>());
        airPlanes.get("Paris").put("London", new int[]{13, 300});
        airPlanes.get("Paris").put("Amsterdam", new int[]{21, 500});

        Map<String, Integer> hotelCosts = new HashMap<>();
        hotelCosts.put("Amsterdam", 400);
        hotelCosts.put("Paris", 500);
        hotelCosts.put("London", 300);
        for (Map.Entry<String, Map<String, int[]>> entry : airPlanes.entrySet()) {
            for (Map.Entry<String, int[]> set : entry.getValue().entrySet()) {
                itenary.offerLast(entry.getKey());
                findLongestItinerary(airPlanes, hotelCosts, entry.getKey(), entry.getKey(), 5000, set.getValue()[0]);
                itenary.pollLast();
            }
        }
        for (List list : result) {
            System.out.println(list.toString());
        }
    }

    public static void findLongestItinerary(Map<String, Map<String, int[]>> airPlanes, Map<String, Integer> hotel,
                                            String departFrom, String destination, int money, int date) {
        if (departFrom == destination && itenary.size() != 1 && itenary.size() > result.size()) {
//            result.clear();
            LinkedList<String> list = new LinkedList<>();
            list.addAll(itenary);
            result.add(list);
            return;
        }

        for (Map.Entry<String, int[]> entry : airPlanes.get(departFrom).entrySet()) {
            if (date > entry.getValue()[0] || money < (hotel.get(departFrom) * (entry.getValue()[0] - date))) {
                continue;
            }
            money -= entry.getValue()[1];
            money -= (hotel.get(departFrom) * (entry.getValue()[0] - date));
            itenary.offerLast(entry.getKey());
            findLongestItinerary(airPlanes, hotel, entry.getKey(), destination, money, entry.getValue()[0]);
            itenary.pollLast();
            money += entry.getValue()[1];
            money += (hotel.get(departFrom) * (entry.getValue()[0] - date));
        }


    }
}
