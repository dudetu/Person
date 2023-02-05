import java.util.List;

public class Worker  extends Person implements AbleToCalculatePension {
private static final int MONEY_PER_CHILD = 200;

    public Worker(List<Person> children) {
        super(children);
    }

    private double minSalaary;
    private double maxSalary;

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");

    }

    public double getMinSalaary() {

        return minSalaary;
    }

    public void setMinSalaary(double minSalaary) {

        this.minSalaary = minSalaary;
    }

    public double getMaxSalary() {

        return maxSalary;
    }

    public void setMaxSalary(double maxSalary) {

        this.maxSalary = maxSalary;
    }


    @Override
    public double calculatePension() {
        PensionFund pensionFund = new PensionFund(" Пенсионный фонд Берлин", true, "28-05-1977");
        int age = getAge();
        int additionalSalary = 0;
         if ( getChildren() != null){
             additionalSalary = getChildren().size() * MONEY_PER_CHILD;
         }
        additionalSalary += minSalaary;
        
        double result = pensionFund.calculatePension(age, maxSalary, minSalaary);
        return result;
        
    }
  public String toString (){
      String month = null;
      return  "classes.Worker{"+
              "minSalary="+ minSalaary + 
                " ,maxSalary=" + maxSalary +
                ", month=" + month +
                '}';
                
  }


}
