package CollegeWorks.labprograms.Java.srcprogram.JPanelblock;
import javax.swing.JOptionPane;

public class abstractShapes {
    public void CreateShape() {
        Triangle triangle = new Triangle(5,7);
        triangle.area();
        Rectangle rectangle = new Rectangle(3,8);
        rectangle.area();
        Ellipse ellipse = new Ellipse(9,4);
        ellipse.area();
    }
    
}

abstract class Shape {
    int a,b;
    abstract void area();
}

class Triangle extends Shape {
    Triangle(int length,int height) {
        a=length;
        b=height;
    }
    @Override
    void area() {
        JOptionPane.showMessageDialog(null, "Area of Triangle is: "+(0.5*a*b));
    }
}

class Rectangle extends Shape {
    Rectangle(int height,int breath) {
        a=height;
        b=breath;
    }
    @Override
    void area() {
        JOptionPane.showMessageDialog(null, "Area of REctangle is: "+(a*b));
    }
}

class Ellipse extends Shape {
    Ellipse(int radius,int height) {
        a=radius;
        b=height;
    }
    @Override
    void area() {
        JOptionPane.showMessageDialog(null, "Area of Ellipse is: "+(3.14*a*b));
    }
}