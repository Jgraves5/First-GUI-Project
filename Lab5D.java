
package lab5a;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class Lab5D extends JPanel {
    
    private final int MAX_LAYER = 10;
    
    private ArrayList<Shape> shapes;
    
    /* CONSTRUCTOR */
    
    public Lab5D() {
        
        super();
        
        this.setBackground(Color.decode("#00BFFF")); // Deep Sky Blue

        shapes = new ArrayList<>();
        
        
        
         for(int i = 0; i<30;++i ){
           int num =  (int) (Math.random()*3+1);
           
           int x = (int) (Math.random()*500+1);
           int y = (int) (Math.random()*500+1);
           int z = (int) (Math.random()*2);
           int radius = (int) (Math.random()*100+1);
           int width =(int) (Math.random()*100+10);
           int length =(int) (Math.random()*100+10);
           int base =(int) (Math.random()*100+10);
           int height = (int) (Math.random()*100+10);
            
           if(num ==1){
               shapes.add(new Circle(x,y,z,radius));
           }
           if(num==2){
               shapes.add(new Rectangle(x,y,z,length,width ));
           }
            if(num==3){
                shapes.add(new Triangle(x,y,z,base, height));
                     
               }
        
    }}
    
    @Override
    protected void paintComponent(Graphics g) {
        
        super.paintComponent(g);

        /* Iterate through Layers 1 through 10 */
        
        for (int i = 0; i < MAX_LAYER; ++i) {

            /* Iterate through Shape collection */
        
            for (Shape s : shapes) {

                /* Get X and Y coordinates */
                
                int x = s.getX();
                int y = s.getY();

                /* Check Layer */
                
                if (s.getZ() == i) {

                    /* RECTANGLE */

                    if (s instanceof Rectangle) {

                        g.setColor(Color.decode("#B22222")); // Firebrick Red
                        
                        int width = (int)((Rectangle)s).getWidth();
                        int len = (int)((Rectangle)s).getLength();
                        g.fillRect(x-(width/2), y-(len/2), len, width);
                        

                    }

                    /* CIRCLE */

                    else if (s instanceof Circle) {

                        g.setColor(Color.YELLOW); // Yellow

                        int radius = (int)((Circle)s).getRadius();
                        g.fillOval(x-radius/2, y-radius/2, radius, radius);

                    }

                    /* TRIANGLE */

                    else if (s instanceof Triangle) {

                        g.setColor(Color.decode("#228B22")); // Forest Green
                        
                        int height = (int)((Triangle)s).getHeight();
                        int base= (int)((Triangle)s).getBase();
                        
                        int []xPoint = {x-(base/2),x,x+(base/2)};
                        int []yPoint = {y+(height/2),y-(height/2),y+(height/2)};
                        int nPoints = 3;
                        g.fillPolygon(xPoint, yPoint, nPoints);
                                
                              

                    }
                    
                    /* Tag shape with area */

                    g.setColor(Color.ORANGE);
                    g.drawString(Integer.toString((int)s.area()), x, y);
                    
                } // end layer if

            } // end shapes loop
            
        } // end layer loop
        
    } // end paintComponent()

}

