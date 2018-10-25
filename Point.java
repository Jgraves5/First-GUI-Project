
package lab5a;


public class Point  {
    private int x;
    private int y;
    private int z;
  
   public Point(int x, int y, int z){
       
       if(x<=0){
           x=0;
       }
       if(x>500){
           x=500;
       }
       else{
           this.x = x;
       }
       if(y<0){
           y=0;          
       }
       if(y>500){
           y = 500;
       }
       else{
           this.y = y;
       
       }
       
       if(z<0){
           z = 0;
       }
       if(z>500){
           z= 500;
        }
       else{
           this.z = z;
       }
   }  

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

 
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

   
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
    public double area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
