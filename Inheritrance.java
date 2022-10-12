
// Single level inheritance



class Employee{
    String name;
    int empId;
    int salary;
    public void setname(String name){
        this.name=name;
    }
    public void setEmpId(int empId){
        this.empId = empId;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void display(){
        System.out.println(name+" "+empId+" "+salary);
        System.out.println("employee class !!!");
    }
}
class Manager extends Employee{
    int bonus;
    public void setBonus(int bonus){
       this.bonus = bonus;
    }
    public void printMessage(){
        System.out.println("Bonus amount is "+bonus);
        System.out.println("Manager class");
    }
}
public class Inheritrance {
    public static void main(String[] args){

    Manager obj1=new Manager();
    obj1.setname("jefrin");
    obj1.setEmpId(100);
    obj1.setSalary(100000);
    
    obj1.setBonus(5000);

    obj1.display();
    obj1.printMessage();
    }
}
