/*
 * Project exercise 13.10 GeometricObject class 
 * Lauren Smith 
 * 12/17/20 
 * Makes GeometricObject class  
 */
package pkg1310;


public abstract class GeometricObject {
    private String color="white"; 
    private boolean filled; 
    private java.util.Date dateCreated; 
    //constructs a default geometric object 
    protected GeometricObject() 
    {
        dateCreated=new java.util.Date(); 
    } 
    //construct a geometric object with color and filled value
    protected GeometricObject(String color, boolean filled) 
    {
      dateCreated=new java.util.Date();
      this.color=color; 
      this.filled=filled; 
    }
    //return color 
    public String getColor() 
    {
        return color; 
    } 
    //set a new color 
    public void setColor(String color) 
    {
        this.color=color; 
    } 
    //returm filled 
    public boolean isFilled() 
    {
        return filled; 
    } 
    //set a new filled 
    public void setFilled(boolean filled) 
    {
        this.filled=filled; 
    } 
    //get dateCreated 
    public java.util.Date getDateCreated() 
    {
        return dateCreated; 
    } 
    @Override 
    public String toString() 
    {
        return "created on "+dateCreated + "\ncolor: "+color+" and filled: " +filled;
    }
    public abstract double getArea(); 
    public abstract double getPerimeter(); 
}
