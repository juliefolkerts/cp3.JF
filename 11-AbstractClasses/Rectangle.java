public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public double area() {
        return width * height;
    }
    @Override
    public double perimeter(){
        return 2*width+2*height;
    }
}
