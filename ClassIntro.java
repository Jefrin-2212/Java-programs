
// Creating a class and object
// Initializing the variables
class Student{
    String name;
    int rollNo;
    double cgpa;
    public void display(){
        System.out.println(name+" "+rollNo+" "+" "+cgpa);
    }
}
public class ClassIntro {
    public static void main(String args[]){
        Student obj = new Student();
        obj.name="Jefin";
        obj.rollNo=25;
        obj.cgpa=8.9;

        obj.display();

    }
}

