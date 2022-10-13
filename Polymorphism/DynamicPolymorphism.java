class GrandFather{
    public void print(){
    System.out.println("Grand Father Class");
    }
}

class Father extends GrandFather{
    public void print(){
        System.out.println("Father Class");
    }
}

class Son extends Father{
    public void print(){
        System.out.println("Son Class");
    }
}

public class DynamicPolymorphism {
    public static void main(String [] args){
        GrandFather gf = new GrandFather();
        gf.print();
        Father obj = new Father();
        obj.print();
        Son obj2 = new Son();
        obj2.print();
    }
}
