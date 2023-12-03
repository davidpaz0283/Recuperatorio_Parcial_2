public class Square extends Rectangle {


    private double side;

    public Square() {
        }

        public Square(double side) {
            this.side = side;
        }

        protected Square(double side, String color, boolean filled) {
            this.side = side;
            this.color = color;
            this.filled = filled;
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        public void setWidth(double side) {
            this.side = side;
        }

        public void setLength(double side) {
            this.side = side;
        }

        public String toString() {
            return "Square[Rectangle[Shape[\ncolor:  + color +  filled:  + filled ] + width:  + width +  length :  + length]";
        }
}
