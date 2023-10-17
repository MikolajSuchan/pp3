public class StudentTest {
    public static void main(String[] args){
        Student s = new Student();
        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name=" "+s.age);

        Student a = new Student();
        a.name = "John";
        a.age=25;

        Student b = new Student();
        b.name="Lisa";
        b.age=35;

        a.sayHello();
        a.displayName();
        a.displayAge();

        b.sayHello();
        b.displayName();
        b.displayAge();

        Student c = new Student();
        Student d = new Student();

        c.name="Marta";
        d.name="Zofia";
        c.student_id=225675;
        d.student_id=225789;
        c.validation=true;
        d.validation=false;
        c.semester_number=1;
        d.semester_number=2;
        c.average_grade=3.5f;
        d.average_grade=4.5f;

        c.displayInfo();
        d.displayInfo();
        c.changeValidation();
        d.changeValidation();
        c.displayStudent();
        d.displayStudent();



    }
}
