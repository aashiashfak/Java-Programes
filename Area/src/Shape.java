import java.util.Scanner;

 abstract class Shape {
	
	abstract void calculateArea();
}
class Circle extends Shape{
	void calculateArea() {
		System.out.println("enter radius for claculating area");
		Scanner sc=new Scanner(System.in);
		float radius=sc.nextInt();
		double area=Math.PI*radius*radius;
		System.out.println("area of Circle: "+area);
		
	}
}
class Rectangle extends Shape{
	void calculateArea() {
		float width=5;
		float length=4;
		System.out.println("area of Rectangle: "+width*length);
		
	}
}
class Triangle extends Shape{
	void calculateArea() {
		float base=23;
		float height=34;
		System.out.println("area of Triangle: "+(base*height)/2);
	}	
}
class main{
	public static void main(String []args) {
		Circle c=new Circle();
		c.calculateArea();
		Rectangle r=new Rectangle();
		r.calculateArea(); 
		Triangle t=new Triangle();
		t.calculateArea();
		
	
		
		
	}
}


