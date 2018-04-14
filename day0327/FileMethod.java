package day0327;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMethod {

	public static void main(String[] args) {
//		File  f = new File("G:/java/1.txt");
//		System.out.println(f.getName());
//		System.out.println(f.getPath());
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.getParent());
//		System.out.println(f.exists());
//		System.out.println(f.canWrite());
//		System.out.println(f.canRead());
//		System.out.println(f.isFile());
//		System.out.println(f.isDirectory());
//		System.out.println(f.lastModified());
//		Date d = new Date(f.lastModified());
//		System.out.println(d);
//		DateFormat ft = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
//		System.out.println(ft.format(d));
//		System.out.println(f.length());
		
//		File dir = new File("G:/java/File/flie");
//		dir.mkdirs();
		File dir2 = new File("G:/java");
//		String[] names = dir2.list();
//		for(String name :names){
//			System.out.println(name);
//		}
		File[] files = dir2.listFiles();
		for(File file: files){
			System.out.println(file);
		}
 		
	}

}
