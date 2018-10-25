
package lab5a;



public abstract class Shape {
    //implements comparable<Shape>
    private Point center;
    
    public abstract double area();

    public Shape(int x, int y, int z){
        this.center = new Point(x, y, z);
    }
 
    
    public int getX(){
        return center.getX();
    }
    
    public int getY(){
        return center.getY();
    }
    
    public int getZ(){
        return center.getZ();
        
    }
    /*public int compareTo(Shape s){
    
"return + if this.area() is > s.area()
    "return - if this.area() is < s.area()
    "return 0 if areas are equal

return(int)(this.area() -s.area() );
}
    put in children classes
    */
    
}
    
