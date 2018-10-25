# First-GUI-Project#

### Introduction ###
This is a simple four part program project built over the course of 4 weeks in my first Java programming class. Its use is to display thirty shapes at random across the JFrame. The program takes circles, rectangles, and triangles and displays them based on x,y, and z coordinates.


### Example ###
Here is a simple example of one of the possible outcomes when you run the program

![lab5guipic](https://user-images.githubusercontent.com/44477560/47522050-36a15880-d85a-11e8-85a8-00c8afa9d511.PNG)

## Project Summary ##

### Phase 1: ###
This assignment was meant to give additional practice with creating and implementing classes. This assignment asked me to create three simple classes: circles, rectangles, and triangles. The classes, when created, had to include instance fields for the information necessary to represent the objects, such as area, length, width, radius, etc. The code also had to include constructors, which allow us to initialize the new objects with starting values of our choice. It also had to “getter methods” so that we may get the values we set. The code also had to include a way to compute the area of the three shapes. The code had to include toString methods for each class so that it could put the area into a string. Lastly, it had to print the areas to the screen based on the shape. For triangles it would look like this /4.0\, rectangles [4.0], and for circles (4.0) so that you know which shape you are getting the area for. All of the classes had to be brought together with a main() class. The main() class is where you set the values for each shape.

### Phase 2: ###
Phase two of the assignment is built upon the first phase. I had to expand the original classes by creating a Point class to specify where the center of each shape. The point class was created to get the x and y value of each shape the use that as the origin for the shape. The center points had to be set between zero and five-hundred so that the shapes could appear on screen in a later phase. Along with the point class the toString method had to be updated to include the center point along with the area for each shape. Finally in the main() class I was required to initialize two of each shapes with random values for the x,y, and z values.

### Phase 3: ###
Phase three of this assignment built upon the two previous phases by creating an abstract Shape class to bind the circle, rectangle and triangle classes. The Shape class holds the area object and the point object so that each child class can use it effiecently. The point of the Shape class is to give the children classes easy access to constructers such as area and point so that all future classes can use them. Since area is now in the parent class Shape and it is abstract every time we want to use it in a child class such as circle we have to invoke the super method. In this assignment I was also tasked with creating an ArrayList with one of each shape in the ArrayList with random amounts for x, y, z, radius, length, width, height, and base so that the shapes will be random sizes and locations in the future phases.

### Phase 4: ###
Phases four required completing all previous phases and using what was created in the previous phases to create a GUI to display the shapes to a JFrame. This is where the first GUI build was created. I was tasked with creating a JFrame and JPanel along with using new methods to print the shapes to the JFrame. This GUI creates an ArrayList of Shape objects: one Circle, one Rectangle, and one Triangle. The code which: iterates through the shapes in this ArrayList, determines the type of each Shape object from the list, casts it back to its original type, retrieves the properties of each shape according to its type, and draws the shape into the GUI.  When iterating through the list of shapes, use the instanceof operator to determine the type of each object.  The provided code retrieves the x and y coordinates of each shape's center and uses that was the coordinates to “draw” to shape. Since the origin 0,0 is in the top left corner the values of x and y had to be set above 0. Also, since the frame is only 500 pixels wide and long is couldn’t exceed 500 for x or y values. The program uses the a loop to then go through the ArrayList and choose randomly between the three different shapes and print a shape thirty different times. It is good to note that the z variable had to be set between 1 and 3 to decide which shapes would appear over others if the shapes where overlapping. The code, ran pops up thirty shapes with area printed on the in the Frame.
