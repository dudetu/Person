public class MainPension {
    public static void main(String[] args) {


        PensionFund statePensionFund = new PensionFund("Goverment", true, "23-09-1983");
        PensionFund notStatePensionFund = new PensionFund(" New-York lions bank", false, "23-09-2009");


        double statPensionFund = statePensionFund.calculatePension(40, 2500.0, 2500.0);

        double notStatPensionFund = notStatePensionFund.calculatePension(40, 2500.0, 2500.0);


        System.out.println(statePensionFund.hashCode());
        System.out.println(notStatePensionFund.hashCode());


    }
}
