package Lesson_One;

import java.util.ArrayList;

/*
Класс описывает узел графа
Узел представляется из себя некотрый математический блок (операцию или константу)
 */
public class Node {
    private int blockId; //id блока
    private String nameBlock; // имя блока
    public double x; //координата x
    public double y; //координата y
    private double w; //ширина
    private double h; //высота
    private static final String color = "#FFCC00";
    private ArrayList<Node> inputs = new ArrayList<>(); //список входных блоков
    private ArrayList<Node> outputs = new ArrayList<>(); //список выходных блоков

    public Node(int blockId, String nameBlock, double x, double y, double w, double h) {
        this.blockId = blockId;
        this.nameBlock = nameBlock;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public boolean isStartBlock() {
        return inputs.isEmpty();
    }//если у блока нет входных блоков он - стартовый

    public boolean isEndBlock() {
        return outputs.isEmpty();
    }//если у блока нет выходных блоков он - конечный


    public void addInputsBlock(Node node){
        this.inputs.add(node);
    }
    public void addInputsBlock(ArrayList<Node> inputNodes){
        this.inputs.addAll(inputNodes);
    }

    public int getBlockId() {
        return blockId;
    }

    public void setBlockId(int blockId) {
        this.blockId = blockId;
    }

    public String getNameBlock() {
        return nameBlock;
    }

    public void setNameBlock(String nameBlock) {
        this.nameBlock = nameBlock;
    }
}
