package computerdemo3;

interface MobileStorage {
	void read();

	void write();
}

class FlashDisk implements MobileStorage {
	@Override
	public void read() {
		System.out.println("FlashDisk read!");
	}
	@Override
	public void write() {
		System.out.println("FlashDisk write!");
	}
}

class MP3Player implements MobileStorage {
	@Override
	public void read() {
		System.out.println("MP3Player read!");
	}
	@Override
	public void write() {
		System.out.println("MP3Player write!");
	}
}

class MobileHardDisk implements MobileStorage {
	@Override
	public void read() {
		System.out.println("MobileHardDisk read!");
	}
	@Override
	public void write() {
		System.out.println("MobileHardDisk write!");
	}
}

public class ComputerDemo3 {
	public static void main(String[] args) {
		MobileStorage s1 = new FlashDisk();
		s1.read();
		s1.write();
		MobileStorage s2 = new MP3Player();
		s2.read();
		s2.write();
		MobileStorage s3 = new MobileHardDisk();
		s3.read();
		s3.write();

	}
}
