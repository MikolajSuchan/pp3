public class SurfaceArea {
    static float rectangle(float a,float b){
        return a*b;
    }
    static double circle(double radius){
        return Math.PI*Math.pow(radius,2);
    }
    static double triangle(float a,float h){
        return a*h*0.5;
    }
    static double cuboid(float a,float b,float c){
        return 2*a*b+2*a*c+2*b*c;
    }
    static double sphere(float r){
        return 4*Math.PI*r*r;
    }
    static double cone(float r,float l){
        return Math.PI*r*r+Math.PI*r*l+Math.PI*r*(r+l);
    }
}


