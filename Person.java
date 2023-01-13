import java.util.Objects;

public class Person {

    //1) Сделать его правильным - создать геттеры и сеттеры, проверить, что он соответствует тем правилам, которые мы с вами обсуждали.

    //2) Создать классы Pensioner и Worker. Унаследовать их от класса Person. В класс Pensioner добавить дробное поле pension, в класс Worker добавить два поля minSalary и maxSalary.

    //3) Класс Person превращаем в абстрактный. В него добавляем абстрактный метод die(), которая ничего не возвращает.

    // 4) В Worker реализуем этот метод таким образом: пишем на экран сообщение "Этот человек не дожил до пенсии"

    //5) В классе Pensioner реализуем так: пишем на экран "Этот пенсионер умер, он заработал: x". Где вместо x нужно рассчитать значение по формуле "(age-50)*pension"


    private String name;
    private int age;
    private int height;
    private double weight;
    double workAge;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person() {
    }


    public String goWork() {
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


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getWorkAge() {
        return workAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setWorkAge(double workAge) {
        this.workAge = workAge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && height == person.height && Double.compare(person.weight, weight) == 0 && Double.compare(person.workAge, workAge) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weight, workAge);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", workAge=" + workAge +
                '}';
    }


}

