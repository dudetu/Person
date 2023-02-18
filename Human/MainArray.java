package Human;

import Human.ArrayListImplementation;

import java.util.ArrayList;

public class MainArray {

    public static  void main(String[]args) {

       ArrayListImplementation list = new ArrayListImplementation(10);
        ArrayList<Integer> arrayList = new ArrayList<>(10);

        list.add(1);
        list.add(12);
        list.add(45);
        list.add(67);

        list.remove(2);
        list.print();
    }




}





