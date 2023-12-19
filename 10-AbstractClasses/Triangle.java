public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p=(a+b+c)*0.5;
        double h=p*(p-a)*(p-b)*(p-c);
        if(a*b>c && b*c>a && c*a>0){
        return Math.sqrt(h);
    }else{
        return 0;
    }
    }

    @Override
    public double perimeter() {
        if(a*b>c && b*c>a && c*a>0){
        return a+b+c;
    }else{
        return 0;
    }
}
}
