import jdk.internal.icu.text.UnicodeSet;

import java.util.HashSet;
import java.util.Set;

public class MainPension {




    public  static  void main (String[] args) {


       PensionFund statePensionFund = new PensionFund("Goverment", true, "23-09-1983");
      PensionFund notStatePensionFund = new PensionFund(" New-York lions bank", false, "23-09-2009");

           double statPensionFund = statePensionFund.calculatePension(40, 2500.0, 2500.0);
           double notStatPensionFund = notStatePensionFund.calculatePension(40, 2500.0, 2500.0);


        System.out.println(statePensionFund.hashCode());
        System.out.println(notStatePensionFund.hashCode());



        Worker worker = new Worker();
       worker.setMinSalary(1000);
        worker.setMaxSalary (2000);
       worker.setAge(45);

        Set<PensionFund> HashSet = new HashSet<>();

        String date1 = null;
        PensionFund pensionFund = new PensionFund("Пенсионный фонд Берлина" ,TypeOfFond.STATE, "09- 08-74", date1);


        UnicodeSet set = null;
        set.add((CharSequence) pensionFund);


        PensionFund pensionFundsecond = new PensionFund("Пенсионный фонд Петьки" ,TypeOfFond.SCAM, "08-08-88", date1);
       set.add((CharSequence) pensionFundsecond);

        PensionFund pensionFundThird = new PensionFund("Пенсионный фонд Берлина" ,TypeOfFond.NOT_STATE, "10-08-20", date1);
        set.add((CharSequence) pensionFund);

       worker.getAvailablePensionFunds(set);

        System.out.println(worker.requestFundToCalcculatePension());




    }
}
