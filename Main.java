import Human.Company;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public  static  void main (String[] args) {


        Company microsoft = new Company("Microsoft");
        Map<String, String> holidays = new HashMap<>();
        holidays.put("Christmas", "25.12");
        microsoft.setHolidays(holidays);


        Company google = new Company("Google");
        holidays.put("Christmas", "31.12");
        google.setHolidays(holidays);


    }
}