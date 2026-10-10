package data_structures.assigment_problems;
import java.util.HashMap;
import java.util.Map;
public class MostPopularCanteenOrder {
    // Returns {item, count}; original-order scan resolves ties by first appearance.
    public static String[] mostPopular(String[] orders) {
        Map<String, Integer> counts = new HashMap<>();
        for (String item : orders) counts.put(item, counts.getOrDefault(item, 0) + 1);
        String bestItem = orders[0];
        int bestCount = counts.get(bestItem);
        for (String item : orders) {
            int count = counts.get(item);
            if (count > bestCount) {
                bestItem = item;
                bestCount = count;
            }
        }
        return new String[]{bestItem, String.valueOf(bestCount)};
    }
    public static void main(String[] args) {
        String[] r = mostPopular(new String[]{"dosa", "idli", "vada", "dosa", "idli", "dosa", "tea"});
        System.out.println("(\"" + r[0] + "\", " + r[1] + ")");
        r = mostPopular(new String[]{"tea", "coffee", "coffee", "tea"});
        System.out.println("(\"" + r[0] + "\", " + r[1] + ")");
    }
}
