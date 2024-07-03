package tp01;

public class cercle {
    private double r;
    point p;
    
     double getx() {
    	return p.getx();
    }
     
     void setx(double x) {
    	p.setx(x);
    }


    public cercle(point p,double r) {
    	this.p=p;
        this.r = r;
    }
    
    void decaler(double dx,double dy) {
    	p.setx(p.getx()+dx);
    	p.sety(p.gety()+dy);
    }
    
    void echange(cercle c1) {
    	double c;
    	c=c1.p.getx();
    	c1.p.setx(p.getx());
    	p.setx(c);
    }

    public double calculSurf() {
        return (Math.PI * Math.pow(this.r, 2));
    }

    public double calculPer() {
        return (Math.PI * this.r);
    }

    public void afficherInfo() {
        System.out.println("X= " + p.getx() + " Y= " + p.gety() + " Rayon= " + this.r + " la surface = " + this.calculSurf() + " le perimetre est ="+ this.calculPer());
    }
}
