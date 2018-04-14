package day0310;

public class Anonymous {
	public void test(){
		Object o = new Object();
		Object o2 = new Object(){
			public void k(){
				
			}
		};
		Object o3 = new Object(){
			public void k(){
				
			}
		};
		pass(new Object());
		pass(new Object(){
			public void k(){
				
			}
		});
		
	}
	public void pass(Object o){
		
	}

}
