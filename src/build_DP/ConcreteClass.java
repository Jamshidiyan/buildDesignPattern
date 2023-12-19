package build_DP;
//Assemble Our Object
public class ConcreteClass implements Builder{
    private final Shape shape;

    public ConcreteClass() {
        this.shape = new Shape();
    }


    @Override
    public void buildName() {
        shape.setName("CShape");
    }
    @Override
    public void buildShape() {
        shape.setShape("Circle");
    }
    @Override
    public void buildColor() {
        shape.setColor("Black");
    }
    @Override
    public Shape build() {
        return shape;
    }

    @Override
    public String toString() {
        return "ConcreteClass{" +
                "shape=" + shape +
                '}';
    }
}
