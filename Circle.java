package lab5a;

public class Circle extends Shape {
     private double radius;
    
    
   @Override
    public double area() {
        return (Math.PI * Math.pow(radius, 2));
    }
    
    public double circumference(){
        return (2 *Math.PI * radius);
    }
    
    public Circle(int x, int y, int z, double newRadius) {
       super(x,y,z);
        
        this.radius = newRadius;
        
    
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
     public String toString(){
        return "The Origin is ("+getX() + "," + getY()+") The Area of the Circle is (" +area()+ ") while the radius is "+ getRadius();
       
}
}
