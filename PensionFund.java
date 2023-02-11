import java.util.Objects;

public class PensionFund {

    private static final double PENSION_COEFFICIENT = 0.02;
    private static final int AVERAGE_SALARY =1500;
    private String name;

    private final String date;

private TypeOfFond type;

    public PensionFund(String name, boolean isSate, String date) {
        this.name = name;
        this.type= type;
        this.date = date;
    }

    public PensionFund(String пенсионный_фонд_берлина, TypeOfFond state, String date, String date1) {

        this.date = date1;
    }

    public double calculatePension( int age, double minSalary, double maxSalary){
        double avergeSalary;
          switch (type){
              case STATE :
                  avergeSalary = AverageUtils.average(minSalary,maxSalary);
                  break;
              case NOT_STATE:
                  avergeSalary=AverageUtils.average(minSalary,maxSalary,AVERAGE_SALARY);
                  break;
              case SCAM:
                  avergeSalary=0;
                  break;
              default:
                  avergeSalary =0;
          }


             return avergeSalary * age * PENSION_COEFFICIENT;
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return Objects.equals(name, that.name) && Objects.equals(date, that.date) && type == that.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, date, type);
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", type=" + type +
                '}';
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public TypeOfFond getType(){
    return type;
    }

    public void setType(TypeOfFond type) {

        this.type = type;
    }
}




