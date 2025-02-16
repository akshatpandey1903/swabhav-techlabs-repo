package com.aurionpro.model;

public class Box {
	
	private double width;
	  private double depth;
	  private double height;
	  
	  public Box()
	  {
	    System.out.println("Default through chaining");
	  }

	  
	  public Box(double width, double height, double depth)
	  {
		this();
	    this.width=width;
	    this.depth=depth;
	    this.height=height;
	  }
	  
	  public double getWidth()
	  {
	    return width;
	  }
	  
	  public double getDepth()
	  {
	    return depth;
	  }
	  
	  public double getHeight()
	  {
	    return height;
	  }
	  
	  public void setHeight(double height)
	  {
	    this.height=height;
	  }
	  public void setDepth(double depth)
	  {
	    this.depth=depth;
	  }
	  public void setWidth(double width)
	  {
	    this.width=width;
	  }

//	  public void DisplayDetails(){
//		  System.out.println("Height: " + this.height);
//		  System.out.println("Width: " + this.width);
//		  System.out.println("Depth: " + this.depth);
//	  }
}
