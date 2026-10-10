package data_structures.assigment_problems;
public class HotWeatherAlertWindows {
    // Sliding window; sum >= k*threshold avoids decimal division.
    public static int countAlerts(int[] readings, int k, int threshold) {
        int sum = 0, alerts = 0, required = k * threshold;
        for (int i = 0; i < k; i++) sum += readings[i];
        if (sum >= required) alerts++;
        for (int right = k; right < readings.length; right++) {
            sum += readings[right];
            sum -= readings[right - k];
            if (sum >= required) alerts++;
        }
        return alerts;
    }
    public static void main(String[] args) {
        System.out.println(countAlerts(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4));
    }
}
