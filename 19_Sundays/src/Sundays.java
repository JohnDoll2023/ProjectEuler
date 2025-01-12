import java.util.HashMap;
import java.util.Map;

public class Sundays {
    public static void main(String[] args) {
        // year, days since start, number of sundays
        Map<String, Integer> map = new HashMap<>();
        map.put("year", 1900);
        map.put("days", 0);
        map.put("sundays", 0);
        while(map.get("year") < 2001) {
            increaseYear(map);
            System.out.println(map);
        }
    }

    // increase each year and check values for sundays
    public static void increaseYear(Map<String, Integer> map) {
        // get all the values
        int year = map.get("year");
        int days = map.get("days");
        int sundays = map.get("sundays");
        // array of days in each month
        int [] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // update february if leap year
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            daysInMonth[1] = 29;
        }
        // loop through each month and check
        for(int i = 0; i < 12; i++) {
            if(days % 7 == 6) {
                if (year > 1900) {
                    sundays++;
                }
            }
            days += daysInMonth[i];
        }
        // print sundays if year is 2000
        if(year == 2000) {
            System.out.println(sundays);
        }
        // update values
        year++;
        map.put("year", year);
        map.put("days", days);
        map.put("sundays", sundays);
    }
}