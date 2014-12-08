import java.lang.Math;


public class Rectangle {
	
	private int width, height, size;
	
	public Rectangle(int w, int h){	//rectangle
		if (width >= 0 && height >= 0)
			size = height * width;
	}
	
	public Rectangle(int w){		//square 
		size = width * width;
	}
	
	public Rectangle(){		//builds small square 
		size = 1;
	}
	
	public boolean isSquare(int s, int w){
		if (width == Math.sqrt(size))
			return true;
		else
			return false;
	}
	
	public void Quadratize(int s){
		//takes any size and makes it a square
		//width = w;
		size = s;
		width = (int) Math.sqrt(size);
		
	}


}
