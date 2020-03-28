package Polymerpision;
public class TestShape {
	   public static void main(String[] args) {
	      Triangle t1=new Triangle("black",3,5);
	      System.out.println(t1.toString());
	      System.out.println("area of triangle:"+t1.getArea());
	      Rectangle r1=new Rectangle("red",2,10);
	      System.out.println(r1.toString());
	      System.out.println("area of rectangle"+r1.getArea());
	     
	      
	   }
	}


