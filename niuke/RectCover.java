package niuke;

public class RectCover {
	public int rectCover(int target) {
		if(target<=0)
			return 0;
		else if(target==1)
			return 1;
		else if(target==2)
			return 2;
		else
			return rectCover(target-1)+rectCover(target-2);

    }
}
