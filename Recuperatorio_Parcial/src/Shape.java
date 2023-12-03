public class Shape {
    public String color = "red";
    public boolean filled = true;

    public Shape() {
    }

    protected Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    public abstract double getArea();

    public abstract double getPerimeter();


    public String toString() {
        return "Shape [ \ncolor:  + color +  filled:  + filled ]";

}
}
