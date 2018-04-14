package day0327;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Copy {
	public static void main(String[] args) {
		try(Reader r = new FileReader("D:/eclipse/workspace/example/src/day0327/HelloWorld.java");
		Writer w = new FileWriter("D:/eclipse/workspace/example/src/day0327/HelloWorldCopy.java")){
			int c;
			while((c = r.read())!=-1){
				w.write(c);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
