package Homework.Lesson_One;

/*
Класс описываетй фиктивный узел графа
Узел используется как временный для упрощения визуализации
 */
public class DummyNode extends Node {
    private static final String color;

    static {
        color = "#EE82EE";
    }

    public DummyNode(int blockId, double x, double y) {
        super(blockId, ("dummyNode_" + blockId), x, y, 10, 10);
    }
}
