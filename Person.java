public class Person {

    String name;
    int age;
    int height;
    int weight;
    int workAge;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person() {
    }

    public void goWork() {
        if (this.workAge >= 18 && this.workAge <= 70) {
            System.out.println("Oтдыхаю дома");
        } else {
            System.out.println("Pаботаю");
        }


    }
    public void info() {
        System.out.println(this.name + this.age + this.height + this.weight);
    }
}

