package Homework.Lesson_One;

/*
Класс описывает ребро графа
 */
public class Edge {
    public Node source; //источник
    public Node target; //назначение
    private double length;//длина ребра

    {
        this.length = calculatingLength();
    }

    public Edge(Node source, Node target) {
        this.source = source;
        this.target = target;
    }

    private double calculatingLength() {
        return Math.sqrt(Math.pow((source.x - target.x), 2) + Math.pow((source.y - target.y), 2));
    }
    
    public void setSource(Node source) {
        this.source = source;
    }

    public void setTarget(Node target) {
        this.target = target;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
