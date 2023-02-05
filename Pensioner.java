

public class Pensioner extends Person{


    private double pension;

    public Pensioner(String name, int age, int height, double weight , double pension){
        super(name,age,height, (int) weight);
        this.pension = pension;
    }

    @Override
    public  void  die (){
        System.out.println( "и , что-то произошло ...");
        super.die();
        System.out.println( "Ага, вот так и случилось!");


        int countOfChildren = 0;
        if ( getChildren() != null){
            countOfChildren = getChildren().size();
        }

        System.out.println( "Зато у меня "+ countOfChildren + "Детей");
    }
     //  public void die(){double x = (getAge() -50)*pension;
     //  System.out.println("Этот пенсионер умер, он заработал: ");
      // }


       public void abc ( int a ){
           System.out.println( a);
       }

    public int getAge() {

        return 0;
    }

    public double getPension() {

    return pension;
    }

    public void setPension(double pension) {

    this.pension = pension;
    }
}

