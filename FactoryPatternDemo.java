import java.io.*;

class Circle implements FactoryPatternShapeInterface{
    @Override
    public void draw() {
        System.out.println("This is Circle class");
    }
}
class Rectangle implements FactoryPatternShapeInterface{
    @Override
    public void draw() {
        System.out.println("This is Rectangle class");
    }
}

class Triangle implements FactoryPatternShapeInterface{
    @Override
    public void draw() {
        System.out.println("This is Triangle class");
    }
}

class FactoryPatternExample {
    FactoryPatternShapeInterface getClaa(String name) {
       if(name.equalsIgnoreCase("CIRCLE")) {
           return new Circle();
        } else if(name.equalsIgnoreCase("RECTANGLE")){
        return new Rectangle();
        } else if(name.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }
          return null;
        }
}
public class FactoryPatternDemo {
    public static void main(String args[]) {
        FactoryPatternExample example = new FactoryPatternExample();
        FactoryPatternShapeInterface shape1 = example.getClaa("CIRCLE");
        shape1.draw();
        FactoryPatternShapeInterface shape2 = example.getClaa("TRIANGLE");
        shape2.draw();
        FactoryPatternShapeInterface shape3 = example.getClaa("RECTANGLE");
        shape3.draw();
    }
}