package Human;

import java.util.Map;

public class Company {
    private String name;

    public Map<String, String> getHolidays() {
        return holidays;
    }

    public void setHolidays(Map<String, String> holidays) {
        this.holidays = this.holidays;
    }

    private Map<String, String> holidays;

    public Company(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public int compareTo(Company o ) {
        return name.compareTo(o.name);

}
    @Override
    public String toString() {
        return "Company{" +
                "name=" + name +'\'' +
                '}';
    }
}

