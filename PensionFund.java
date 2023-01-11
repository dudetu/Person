public class PensionFund {

    private static final double PENSION_COEFFICIENT = 0.02;
    private static final int AVERAGE_SALARY =1500;
    private String name;
    private  boolean isSate;

    private final String date;



    public PensionFund(String name, boolean isSate, String date) {
        this.name = name;
        this.isSate = isSate;
        this.date = date;
    }
    public double calculatePension( int age, double minSalary, double maxSalary){
        double avergeSalary;

        if (isSate) {
            double avargeSalary = AverageUtils.averageOfTwooNumbers(  minSalary, maxSalary);
            return avargeSalary * age * PENSION_COEFFICIENT;
        } else {
            double avarageSalary = AverageUtils.averageOfThreeNumbers(minSalary, maxSalary,AVERAGE_SALARY );
             return avarageSalary * age * PENSION_COEFFICIENT;
        }
    }


}
