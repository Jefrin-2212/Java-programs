
class Encapsulate {

	private String name;
	private int roll;
	private int age;

	public int getAge(){ 
        return age; 
    }

	public String getName() { 
        return name; 
    }

	public int getRoll() {
         return roll; 
        }
        
    public void setAge(int age) {
         this.age = age; 
        }

	public void setName(String name){
		this.name = name;
	}

	public void setRoll(int roll) { 
        this.roll = roll; 
    }
}
public class EncapsulationDemo {
	public static void main(String[] args)
	{
		Encapsulate obj = new Encapsulate();

		obj.setName("Jefrin");
		obj.setAge(19);
		obj.setRoll(51);

		System.out.println("name: " + obj.getName());
		System.out.println("age: " + obj.getAge());
		System.out.println("roll: " + obj.getRoll());
	}
}
