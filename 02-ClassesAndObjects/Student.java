public class Student {
    String name;
    int age;
    int student_id;
    boolean validation;
    int semester_number;
    float average_grade;
    

    void sayHello(){
        System.out.println("Hello from "+name);
    }
    void displayName(){
        System.out.println("Your name is: "+name);
    }
    void displayAge(){
        System.out.println("Your age is: "+age);
    }
    void displayInfo(){
        System.out.println(name+" "+semester_number+" "+average_grade);
    }
    void changeValidation(){
        validation= !validation;
    }
    void displayStudent(){
        System.out.println(name+" "+student_id+" "+ (validation==true?"Your id is Valid":"Your Id is invalid"));
    }
}
