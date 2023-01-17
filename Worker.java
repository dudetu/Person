import static jdk.internal.icu.lang.UCharacter.getAge;

public class Worker extends Person implements AbleToCalculatePension {

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
      double result = pensionFund.calculatePension(age, maxSalary, minSalaary);
        return result;


    }





}
