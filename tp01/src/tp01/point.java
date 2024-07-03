package tp01;

public class point {
	
	private double x,y;
	
	point(double x,double y){
		this.x=x;
		this.y=y;
	}
	
	void setx(double x) {
		this.x=x;
	}
	double getx () {
		return x;
	}
	void sety(double y) {
		this.y=y;
	}
	double gety () {
		return y;
	}
	void decaler(double dx,double dy) {
    	x+=dx;
    	y+=dy;
    }
	
}
