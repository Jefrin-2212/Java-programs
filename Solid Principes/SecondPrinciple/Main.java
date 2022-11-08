

// Open and Closed principle

class Main{
    public static void main(String[] args) {
        AreaCalcuator obj = new AreaCalcuator();
        System.out.println(obj.add(10,20));
        System.out.println(obj.sub(100,20));
        System.out.println(obj.mul(10,20));
        System.out.println(obj.div(20,10));
        System.out.println(obj.squareArea(10));
        System.out.println(obj.rectangleArea(10,20));
        System.out.println(obj.squarePerimeter(20));

    }
}