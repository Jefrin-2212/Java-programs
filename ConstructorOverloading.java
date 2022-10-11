class Student{
    String name;
    int roll;
    char grade;
    double cgpa;
    
    public  Student(){
        this.grade='N';
        System.out.println("Constructor 1"); // Constructor 1
    }
    public Student(String name){
        this.name=name;
        System.out.println("Constructor 2"); // Constructor 2
    }
    public Student(int roll,double cgpa){
        this.roll=roll;
        this.cgpa=cgpa;
        System.out.println("Constructor 3"); // Constructor 3
    }
    public Student(char grade){
        this.grade=grade;
        System.out.println("Constructor 4"); // Constructor 4
    }
    public Student(String name,int roll,char grade,double cgpa){
        this.name=name;
        this.roll=roll;
        this.grade=grade;
        this.cgpa=cgpa;
        System.out.println("Constructor 5"); // Constructor 5
    }
    public void detail(){                  // method 
        System.out.println(name);
        System.out.println(roll);
        System.out.println(grade);
        System.out.println(cgpa);
    }   
    public void setName(String name){
        this.name=name;
    }
    public void  setRoll(int roll){
        this.roll=roll;
    }
    public void setGrade(char grade){
        this.grade=grade;
    }
    public void setCGPA(double cgpa){
        this.cgpa=cgpa;
    }
}
public class ConstructorOverloading
{
	public static void main(String[] args) {
    Student student1 =  new Student("jef",20,'H',8.9);
    student1.detail();
	}
}