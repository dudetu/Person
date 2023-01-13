public class Worker extends Person{

  private   double minSalaary;
   private double maxSalary;

@Override
   public void die(){
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
}
