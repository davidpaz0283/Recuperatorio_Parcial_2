public class Main {
    public static void main(String[] args) {
        Shape shaObject1 = new Circle(5);
        Shape shaObject2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? " +
                equalArea(shaObject1, shaObject2));

        displayGeometricObject(shaObject1);

        displayGeometricObject(shaObject2);
    }


    public static boolean equalArea(Shape shaObject1, Shape shaObject2) {
        return shaObject1.getArea() == shaObject2.getArea();
    }

    public static void displayGeometricObject(Shape object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}


