package build_DP;

public class Director {
    private final Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public Shape getShape(){
        return this.builder.build();
    }
    public void makeShape(){
        this.builder.buildName();
        this.builder.buildShape();
        this.builder.buildColor();
    }
}
