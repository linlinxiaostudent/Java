package day0308;

public class ShortCircuit {
	public static void main(String[] args) {
		int y=0;
		boolean x = 5>10 && (y=5<3 ? 12:13)>12;
		System.out.println(x);
		if (y==0)
			System.out.println("y�ĳ�ʼֵΪ0�����ڻ���0��˵�������˶�·����");
	}
}
