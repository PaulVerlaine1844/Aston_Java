package Homework.Lesson_One;

public class Test {
    public static void main(String[] args) {
        Node node1 = new Node(1, "CONST", 0, 10, 10, 10);
        node1.setBlockId(10);
        //узел_2
        Node node2 = new Node(2, "CONST", 0, 20, 10, 10);
        node2.setBlockId(20);
        //фиктивный блок_1
        DummyNode dummyNode1 = new DummyNode(-1, 10, 10);
        node1.addOutputsBlock(dummyNode1);
        //фиктивный блок_2
        DummyNode dummyNode2 = new DummyNode(-2, 30, 20);
        node2.addOutputsBlock(dummyNode2);
        //ребро
        Edge edge12 = new Edge(node1, dummyNode1);
        System.out.println("Длина линии: " + edge12.calculatingLength());
        //проверка на стартовый блок:
        System.out.println("Блок с id " + node1.getBlockId() + ((node1.isStartBlock()) ? " является стартовым" : " не является стартовым"));

    }
}
