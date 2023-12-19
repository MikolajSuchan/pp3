public class Test {
    public static void main(String[] args) {
        Rectangle s1= new Rectangle(10, 5);
        Triangle s2= new Triangle(7,5,10);
        Circle s3= new Circle(10);

        System.out.println("Rectangle area: "+s1.area());
        System.out.println("Triangle area: "+s2.area());
        System.out.println("Circle area: "+s3.area());

        System.out.println("Rectangle perimeter: "+s1.perimeter());
        System.out.println("Triangle perimeter: "+s2.perimeter());
        System.out.println("Circle perimeter: "+s3.perimeter());
    }
}
