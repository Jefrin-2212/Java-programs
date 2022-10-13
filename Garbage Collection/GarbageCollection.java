class Exam{
    String name;
    int rollNo;
    public Exam(){
        name = "jefrin";
        rollNo = 8;
    }
    public void printMethod(){
        System.out.println(name+" " +rollNo);
    }
    public void finalize(){                               // finalize();
        System.out.println("Object is garbage collected");
    }
}
public class GarbageCollection {
    public static void main(String [] args){
        Exam obj1 = new Exam();
        Exam obj2 = new Exam();
        obj1.name="jef";
        obj2.name="rin";
        obj1.printMethod();
        obj2.printMethod();
        obj1 = null;                                       // null;
        
        System.gc();                                       // garbage collection call [gc()];

        
    
    }

}
