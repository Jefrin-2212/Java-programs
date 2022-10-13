class Student{
    int roll;
    double cgpa;
    String name;

    public void printDetails(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(cgpa);
    }

    public void getName(String name){
        this.name=name;
    }
    public  void getRoll(int roll){
        this.roll=roll;
    }
    public void getCgpa(double cgpa){
        this.cgpa=cgpa;
    }
}

public class ClassGetterAndSetters {
    public static void main(String [] args){
    Student obj = new Student();
    obj.getName("Jefrin");
    obj.getCgpa(8.7);
    obj.getRoll(24);

    obj.printDetails();
    }

}
