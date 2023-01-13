public class Pensioner extends Person{

      private double pension;

@Override
       public void die(){double x = (getAge() -50)*pension;
        System.out.println("Этот пенсионер умер, он заработал: ");
       }

    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }
}
