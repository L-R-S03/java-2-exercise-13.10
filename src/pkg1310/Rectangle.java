/*
 * Project exercise 13.10 Rectangle class 
 * Lauren Smith 
 * 12/17/20 
 * Makes Rectangle class that extends GeometricObject and implements Comparable
 */
package pkg1310;


public class Rectangle extends GeometricObject implements Comparable <Rectangle> {
    //declares private vars width and height 
    private double width; 
    private double height; 
    
    //empty constructor 
    public Rectangle()
    {}
    
    //constructor that sets width and height 
    public Rectangle(double width, double height) 
    {
        this.width=width; 
        this.height=height; 
    } 
    
    //constructor with width hight color and fill
    public Rectangle(double width, double height, String color, boolean filled) 
    {
        this.width=width; 
        this.height=height; 
        setColor(color); 
        setFilled(filled); 
    } 
    
    //getters and setters for variables (lines 35-54)
    public double getWidth() 
    {
        return width; 
    } 
    
    public void setWidth(double width) 
    {
        this.width=width; 
    } 
    
    public double getHeight() 
    {
        return height; 
    } 
    
    public void setHeight(double height) 
    {
        this.height=height; 
    } 
    
    //overrides getArea abstract method from super and finds area by multiplying 
    //width and height 
    @Override 
    public double getArea() 
    {
        return width*height; 
    } 
    
    //overrides getPerimeter abstract method from super and finds perimeter by 
    //adding width and height and then multiplying by 2 to get the other 2 undadded
    //sides
    @Override 
    public double getPerimeter() 
    {
        return (width+height)*2; 
    }
    
// overrides compareTo from comparable to compare two rectangles through area
    @Override
   public int compareTo(Rectangle obj) 
   {
       //if rectangle called area is greater than compared area return 1
       //compared to rectangle is typecasted as a rectangle since compareTo uses
       // an object parameter 
       if(this.getArea()>((Rectangle)obj).getArea()) 
       {
           return 1; 
       } 
       //if rectangle called area is less than compared area return -1
       //compared to rectangle is typecasted as a rectangle since compareTo uses
       // an object parameter 
       else if(this.getArea()<((Rectangle)obj).getArea()) 
       {
           return -1; 
       }  
       //if other cases fail areas are equal and return 0 
       else 
       {
           return 0; 
       }
   } 
   
   //checks to see if rectangles are equal on basis of area
   public boolean equals(Object obj) 
   { 
       //if rectangle areas are equal return true 
       //parameter type casted as equals uses object parameter 
       if(this.getArea()==((Rectangle)obj).getArea()) 
       {
           return true; 
       }  
       //else they're not equal and return false
       else 
       {
           return false; 
       }
   }
}
