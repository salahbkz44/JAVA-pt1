package tp01;

public class mainClass {

	public static void main(String[] args) {
		point p1 = new point(2, 7);
        cercle c1 = new cercle(p1 , 4);
        point p2 = new point(1.87, 5.63);
        cercle c2 = new cercle(p2, 7);
        point p3 = new point(4, 7);
        cercle c3 = new cercle(p3,7.12);
        c1.afficherInfo();
        c2.afficherInfo();
        c3.afficherInfo();
        c1.decaler(1,4);
        c1.afficherInfo();
        
    }
}
