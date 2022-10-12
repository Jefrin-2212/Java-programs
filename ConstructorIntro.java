class Student{
    String name;
    int roll;
    double cgpa;

    public Student(String name,int roll,double cgpa){
        this.name=name;
        this.roll=roll;
        this.cgpa=cgpa;
    } 
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll);
        System.out.println("CGPA: "+cgpa);
    }

}

public class ConstructorIntro {
    public static void main(String [] args){
        Student obj = new Student("Jefrin", 24, 8.9);
        obj.display();
    }
}
