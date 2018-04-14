package day0317;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Cuboid implements Comparable<Cuboid>{
	private double length;
	private double width;
	private double height;
	private double volumn;
	public Cuboid(double length, double width, double height, double volumn) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.volumn = volumn;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getVolumn() {
		return volumn;
	}
	public void setVolumn(double volumn) {
		this.volumn = volumn;
	}
	@ Override
	public String toString(){
		return "Cubiod [volumn  " + volumn +"]";
	}
	@Override
	public int compareTo(Cuboid o){
		return (int)(o.volumn-volumn);
	}
	
	public static void main(String[] args) {
		Random r= new Random();
		Cuboid [] c= new Cuboid[5];
		for (int i=0;i<c.length;i++){
			c[i]= new Cuboid(r.nextInt(), r.nextInt(), r.nextInt(), r.nextInt());
		}
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		Arrays.sort(c,new Volumn());
		System.out.println(Arrays.toString(c));
	}
}
class Volumn implements Comparator<Cuboid>{

	@Override
	public int compare(Cuboid o1, Cuboid o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getVolumn()-o2.getVolumn());
	}
	
}
	
