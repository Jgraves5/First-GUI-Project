package lab5a;


public class Triangle extends Shape{
    
    private double base;
    private double height;
    private int x;
    private int y;
    public Triangle(int x, int y, int z, double base, double height){
        super(x,y,z);
        
        this.base = base;
        this.height = height;
 
    }
    
    @Override
    public double area(){
        return( (1.0/2.0) * base * height); 
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
   
    
     public String toString(){
        return "The Origin is ("+getX() + "," + getY()+")The Area of the triangle is /" +area()+ "\\ while the base and height are: /"+ getBase()+","+getHeight()+"\\";
}
}

