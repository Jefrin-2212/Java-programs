class Student extends Person{
    int rollNumber;
    int marks;
    double cgpa;
    public Student(String name, int age, int rollNumber,int marks,double cgpa){
        super(name,age);
        this.rollNumber=rollNumber;
        this.marks=marks;
        this.cgpa=cgpa;
        }
    public void dispAllDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age+"\nRollNumber "+rollNumber);
        System.out.println("Marks: "+marks);
        System.out.println("CGPA: "+ cgpa);
        
    }    
}
