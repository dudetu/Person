public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person = new Person("Lola", 25, 165, 55);
       Person secondPerson= new Person(" Viktor", 70, 170, 80);


        person.name = "Lola";
        person.age = 25;
        person.height = 165;
        person.weight = 55;


        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.height);
        System.out.print(person.weight);
        person.goWork();
        person.info();
    }
}



