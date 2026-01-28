package univ;
public class College extends University{
public void ug() {
	        System.out.println("UG courses available: BCA, BBA, B.Sc, B.Com");}
	    public void pg() {
	        System.out.println("PG courses available: MCA, MBA, M.Sc, M.Com");
	    }
public static void main(String[] args) {
	        College c = new College();
	        c.ug();  
	        c.pg();
	    }
	}


