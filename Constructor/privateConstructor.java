
public class privateConstructor{
    private int age;
    private int roll;
    private String name;
    private privateConstructor(int age,int roll, String name){
        this.age=age;
        this.roll=roll;
        this.name=name;
    }    
    public  void printData(){
        System.out.println(age+" "+roll+" "+name);
    }
	public static void main(String[] args) {
		privateConstructor obj = new privateConstructor(19, 9,"Jefrin");
        obj.printData();
	}
}
