package Human;
import  java.util.ArrayList;
import  java.util.List;
@SuppressWarnings( "WriteOnlyObjekt")
public class Node {
    public Node(Object o, int i) {
    }

    public static void  node(String[] args){

        Node pointOne = new Node(null, 1);
        Node pointTwo = new Node(null,2);
        Node pointThree = new Node(null,3);
        Node pointFour = new Node(null,4);
        Node pointFive = new Node(null,5);
        Node pointSix = new Node(null,6);
        Node  additional = new Node(null,7);


        List<Node> formOne = new ArrayList<>();
        formOne.add(pointTwo);
        formOne.add(pointThree);
        pointOne.setRib(formOne);

        List<Node> fromThree = new ArrayList<>();
        fromThree.add(pointFour);
        fromThree.add(pointFive);
        pointThree.setRib(fromThree);

        List<Node> fromFive = new ArrayList<>();
        fromFive.add(pointSix);
        pointFive.setRib(fromFive);

        List<Node> fromSix = new ArrayList<>();
        fromSix.add(pointThree);
        pointSix.setRib(fromSix);

        List<Node> fromAddtional = new ArrayList<>();
        fromAddtional.add(pointOne);
        fromAddtional.add(pointTwo);
        fromAddtional.add(pointThree);
        fromAddtional.add(pointFour);
        fromAddtional.add(pointFive);
        fromAddtional.add(pointSix);
        additional.setRib(fromAddtional);
    }

    private void setRib(List<Node> formOne) {
    }
}
//Путь из Рекьявика в Афины:
//Рекьявик (4) + Лондон (3) + Берлин(2) +Рим(2) + Афины = 9
//Это самый короткий путь - https://waksoft.susu.ru/wp-content/uploads/2021/10/graph-schame.jpg