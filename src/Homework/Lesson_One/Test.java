package Homework.Lesson_One;

public class Test {
    public static void main(String[] args) {
        Node node1 = new Node(1,"CONST",0,10,10,10);
        Node node2 = new Node(2,"CONST",0,20,10,10);
        DummyNode dummyNode = new DummyNode(-1,10,20);
        Edge edge12 = new Edge(node2,dummyNode);
        //добавим фиктивный узел в список основного узла

    }
}
