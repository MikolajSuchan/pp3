public class Person {

    String name;
    double weight;
    double height;
    double bmi;

    public Person(String name){

        this.name=name;

    }

    public Person(String name,double weight,double height){
        
        this.name=name;
        this.weight=weight;
        this.height=height;

    }

    void setWeightAndHeight(double weight,double height){
        this.weight=weight;
        this.height=height;
    }

    String calculateBMI(){
        double height1=height/100;
        double bmi=weight/(height1*height1);
        this.bmi=bmi;
        return (bmi < 18.5) ? "too low " : (bmi > 24.9) ? "too high" : "good";
    }

    String displayRecord(){
        return String.format("name: %s weights: %.2f is tall for %.2f and the BMI is %.2f",name,weight,height,bmi);
    }
    public static void main(String[] args) {
        Person p1 = new Person("Joanna", 45, 160);
        Person p2 = new Person("Jan", 65, 185);
        Person p3 = new Person("Jakub", 75, 194);
      
        System.out.println(p1.calculateBMI());
        System.out.println(p1.displayRecord());
        System.out.println(p2.calculateBMI());
        System.out.println(p2.displayRecord());
        System.out.println(p3.calculateBMI());
        System.out.println(p3.displayRecord());
        
    }
}
