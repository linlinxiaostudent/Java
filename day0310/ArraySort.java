package day0310;

import java.util.Arrays;
import java.util.Comparator;

class Dog{
	int size;
	int weight;

	public Dog(int size) {
		super();
		this.size = size;
	}

	public Dog(int size, int weight) {
		super();
		this.size = size;
		this.weight = weight;
	}
	
}

class DogSizeComparator implements Comparator<Dog>{
	@Override
	public int compare(Dog o1,Dog o2){
		return o1.size-o2.size;
	}
}
class DogWeightComparator implements Comparator<Dog>{
	@Override
	public int compare(Dog o1,Dog o2){
		return o1.weight-o2.weight;
	}
}

public class ArraySort {
	public static void printDogs(Dog[] dogs){
		for(Dog d:dogs)
			System.out.println(d.size +"  ");
		System.out.println();
	}
	public static void main(String[] args) {
		Dog d1= new Dog(2);
		Dog d2= new Dog(1);
		Dog d3= new Dog(3);
		
		Dog [] dogArray ={d1,d2,d3};
		printDogs(dogArray);
		Arrays.sort(dogArray,new DogSizeComparator());
		printDogs(dogArray);
		
		Dog d4= new Dog(2,50);
		Dog d5= new Dog(1,30);
		Dog d6= new Dog(3,40);
		
		Dog [] dogArray1 ={d4,d5,d6};
		printDogs(dogArray1);
		Arrays.sort(dogArray1,new DogWeightComparator());
		printDogs(dogArray1);
	}
}
