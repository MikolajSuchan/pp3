public class SurfaceAreaTest {
    public static void main(String[] args) {

        System.out.print("Rectangle area (5,2) is ");
        System.out.println(SurfaceArea.rectangle(5,2));

        System.out.print("Circle area (5) is ");
        System.out.println(SurfaceArea.circle(5));

        System.out.print("Triangle area (5,2) is ");
        System.out.println(SurfaceArea.triangle(5,2));

        System.out.print("Cuboid area (5,2,4) is ");
        System.out.println(SurfaceArea.cuboid(5,2,4));

        System.out.print("Sphere area (5) is ");
        System.out.println(SurfaceArea.sphere(5));

        System.out.print("Cone area (5,2) is ");
        System.out.println(SurfaceArea.cone(5,2));

    }
}

