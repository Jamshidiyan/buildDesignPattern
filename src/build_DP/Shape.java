package build_DP;

public class Shape implements ObjectPlan{

    //Add Our Fields
    private String name;
    private String shape;
    private String color;

    //Override SetMethods And Use Them As Setters
    @Override
    public void setName(String name) {
        this.name=name;
    }
    @Override
    public void setShape(String shape) {
        this.shape=shape;
    }
    @Override
    public void setColor(String color) {
        this.color=color;
    }

    //Create Get Methods
    public String getName() {
        return name;
    }
    public String getShape() {
        return shape;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
