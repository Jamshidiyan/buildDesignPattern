package build_DP;

public class Main {
    public static void main(String[] args) {
        Builder circleBuilder = new ConcreteClass();
        Director director = new Director(circleBuilder);
        director.makeShape();
        Shape firstShape = director.getShape();
        System.out.println(firstShape);
    }
}
