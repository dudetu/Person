import jdk.internal.icu.text.UnicodeSet;

import java.time.Month;
import java.util.List;
import java.util.Set;

public class Worker  extends Person implements AbleToCalculatePension {
private static final int MONEY_PER_CHILD = 200;
    private static final List<Person> children = null;

    public Worker() {
        super(children);
    }

    private double minSalaary;

    private double maxSalary;
    private Month month;





    private Set < PensionFund> availablePensionFunds;

    public Set<PensionFund> getAvailablePensionFunds(UnicodeSet set) {
        return availablePensionFunds;
    }

    public void setAvailablePensionFunds(Set<PensionFund> availablePensionFunds) {
        this.availablePensionFunds = availablePensionFunds;
    }

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

        int age = getAge();
        int additionalSalary = 0;
         if ( getChildren() != null){
             additionalSalary = getChildren().size() * MONEY_PER_CHILD;
         }
        additionalSalary += minSalaary;
         double maxPension = 0.0;
         for (PensionFund fund: availablePensionFunds ){
             double result = fund.calculatePension(age, maxSalary, minSalaary);
             if ( result > maxPension)
                 maxPension = result;
                }
        

        return maxPension;
        
    }
  public String toString (){
      String month = null;
      return  "classes.Worker{"+
              "minSalary="+ minSalaary + 
                " ,maxSalary=" + maxSalary +
                ", month =" + month +
                '}';
                
  }


    public void setMinSalary(int i) {
    }
}
