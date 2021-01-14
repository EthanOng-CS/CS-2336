
public class hw_9dot1 {
	
	public static void main(String[] args) {
		
		// Rectangle 1 width and height
		Rectangle r1 = new Rectangle(4,40);

		// Display the width, height, area, and perimeter of rectangle1
		System.out.println("\n Rectangle 1");
		System.out.println("=============");
		System.out.println("Width:     " + r1.width);
		System.out.println("Height:    " + r1.height);
		System.out.println("Area:      " + r1.getArea());
		System.out.println("Perimeter: " + r1.getPerimeter());

		// Rectangle 2 width and height
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		// Display the width, height, area, and perimeter of rectangle2
		System.out.println("\n Rectangle 2");
		System.out.println("=============");
		System.out.println("Width:     " + r2.width);
		System.out.println("Height:    " + r2.height);
		System.out.println("Area:      " + r2.getArea());
		System.out.println("Perimeter: " + r2.getPerimeter());

	}
}

class Rectangle {
   //data fields
   double width;
   double height;
  
   //no-arg constructor
   public Rectangle() {
       width = 1;
       height = 1;
   }
  
   public Rectangle(double w, double h) {
       width = w;
       height = h;
   }
  
   //method that returns area of this rectangle
   public double getArea() {
       return width * height;
   }
  
   //method that returns the perimeter of this rectangle
   public double getPerimeter() {
       return 2 * (width + height);
   }
}
