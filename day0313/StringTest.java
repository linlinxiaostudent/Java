package day0313;

public class StringTest {
	public static void main(String[] args) {
		String s = "abcdef";
		String str = new String("123456");
		System.out.println(s);
		System.out.println(str);
		System.out.println(s.length());
		System.out.println(str.length());
		System.out.println(s.equals("abcdef"));
		System.out.println(s.equalsIgnoreCase("Abcdef"));
		System.out.println(s.compareTo("Abc"));
		System.out.println(s.startsWith("abc"));
		System.out.println(s.endsWith("def"));
		System.out.println(s.endsWith("q"));
		System.out.println(s.charAt(2));
		System.out.println(s.substring(2));
		System.out.println(s.substring(3, 6));
		System.out.println(s.concat("123456"));
		System.out.println(s.replace("def", "EDF"));
		System.out.println(s.indexOf("bc"));
		System.out.println(s.indexOf("br"));
		System.out.println(s.lastIndexOf("bc"));
		s="   a b c   ";
		System.out.println(s.trim());
		s="abc";
		System.out.println(s.toUpperCase());
		s="ABC";
		System.out.println(s.toLowerCase());
		s="2018-03-14";
		String [] items= s.split("-");
		for(String item:items)
			System.out.println(item);
		items= s.split("-",2);
		for(String item:items)
			System.out.println(item);
		System.out.println(s);
		System.out.println(s.contains("2018"));
		
	}

}
