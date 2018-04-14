package graph;

class Graph{
	public double circumference(){
		return 0;
	}
	public double acreage(){
		return 0;
	}
}

class Rectangle extends Graph{
	double length;
	double wide;
	public Rectangle(double length, double wide) {
		this.length = length;
		this.wide = wide;
	}
	public double circumference(){
		return (length+wide)*2;
	}
	public double acreage(){
		return length*wide;
	}
}

class EquilateralTriangle extends Graph{
	double size;
	
	public EquilateralTriangle(double size) {
		this.size = size;
	}
	public double circumference(){
		return size*3;
	}
	public double acreage(){
		return size*0.25 *size * Math.sqrt(3);
	}
}

class Circular extends Graph{
	double radius;
	
	
	public Circular(double radius) {
		this.radius = radius;
	}
	public double circumference(){
		return Math.PI*2*radius;
	}
	public double acreage(){
		return Math.PI*radius*radius;
	}
}

public class GraphDemo {
	public static void main(String[] args) {
		Graph d1 = new Rectangle(10.0,5.0);
		Graph d2 = new EquilateralTriangle(10.0);
		Graph d3 = new Circular(10.0);
		System.out.println(d1.circumference());
		System.out.println(d1.acreage());
		System.out.println(d2.circumference());
		System.out.println(d2.acreage());
		System.out.println(d3.circumference());
		System.out.println(d3.acreage());
		
	}
}
