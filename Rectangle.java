package lab5a;


public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(int x,int y, int z,double length, double width){
        super(x,y,z);
        
        this.length = length;
        this.width = width;
       
    }
   
    @Override
    public double area(){
        return(length * width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
    
    public String toString(){
       return "The Origin is ("+getX() + "," + getY()+")The Area of the Rectangle is [" +area()+ "]while the length and height are: ["+ getLength()+","+getWidth()+"] ";
}
}
