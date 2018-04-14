package computerdemo;

class FlashDisk {
	public void read() {
		System.out.println("FlashDisk read!");
	}

	public void write() {
		System.out.println("FlashDisk write!");
	}
}

class MP3Player {
	public void read() {
		System.out.println("MP3Player read!");
	}

	public void write() {
		System.out.println("MP3Player write!");
	}
}

class MobileHardDisk {
	public void read() {
		System.out.println("MobileHardDisk read!");
	}

	public void write() {
		System.out.println("MobileHardDisk write!");
	}
}

public class ComputerDemo {
	public static void main(String[] args) {
		FlashDisk s1 = new FlashDisk();
		s1.read();
		s1.write();
		MP3Player s2 = new MP3Player();
		s2.read();
		s2.write();
		MobileHardDisk s3 = new MobileHardDisk();
		s3.read();
		s3.write();

	}
}
