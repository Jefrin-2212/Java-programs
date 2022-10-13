class Shapes{
    public void display(){
        System.out.println("All the shapes are formed from connecting multiple straight lines");
    }
}

class Square extends Shapes{
    public void squareArea(int num){
        System.out.println("All sides are equal in a square");
        System.out.println("The area of Square "+num*num);
    }
    public void squarePerimeter(int num){
        System.out.println("The perimeter of Square is "+4*num);
    }
}
class Cube extends Square{
    public void cubeSurfaceArea(int num){
        System.out.println("The Surface  area of cube is "+6*(num*num));
    }
    public void cubeVolume(int num){
        System.out.println("The Volume of the cube is "+num*num*num);
    }

}


public class MultilevelInheritance {

    public static void main(String [] args){
        Shapes obj1 = new Shapes();
        Square obj2 = new Square();
        Cube obj3 = new Cube();

        obj3.display();
        obj3.squareArea(5);
        obj3.squarePerimeter(4);
        obj3.cubeSurfaceArea(4);
        obj3.cubeVolume(3);


    }
}
